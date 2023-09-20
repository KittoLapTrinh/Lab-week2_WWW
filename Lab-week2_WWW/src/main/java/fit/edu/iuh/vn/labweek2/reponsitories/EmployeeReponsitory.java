package fit.edu.iuh.vn.labweek2.reponsitories;

import fit.edu.iuh.vn.labweek2.enums.EmployeeStatus;
import fit.edu.iuh.vn.labweek2.models.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;


import java.util.ArrayList;
import java.util.logging.Logger;

import java.util.List;
import java.util.Optional;



public class EmployeeReponsitory {
    private EntityManager em;
    private EntityTransaction trans;
    private Logger LoggerFactory;
    private final Logger logger =
            LoggerFactory.getLogger(this.getClass().getName());
    public EmployeeReponsitory() {
        em = Persistence
                .createEntityManagerFactory("lab-week2_WWW")
                .createEntityManager();
        trans = em.getTransaction();
    }

    public void insertEmp(Employee employee){
        em.persist(employee);
        try{
            trans.begin();
            em.persist(employee);
            trans.commit();

        }catch (Exception ex){
            trans.rollback();
            ex.printStackTrace();
        }
    }
    public void setStatus(Employee employee, EmployeeStatus status) {
        employee.setStatus(status);
    }

    public void update(Employee employee) {
        em.merge(employee);
        try{
            trans.begin();
            em.merge(employee);
            trans.commit();

        }catch (Exception ex){
            trans.rollback();
            ex.printStackTrace();
        }
    }
    public Optional<Employee> findbyId(long id) {
        TypedQuery<Employee> query = em.createQuery("select e from Employee e where e.emp_id=:id", Employee.class);
        query.setParameter("id", id);
        Employee emp = query.getSingleResult();
        return emp == null ? Optional.empty() : Optional.of(emp);
    }


    public List<Employee> getAllEmp() {
        return em.createNamedQuery("Employee.findAll", Employee.class)
                .setParameter(1, EmployeeStatus.ACTIVE)
                .getResultList();
    }
}




