package fit.edu.iuh.vn.labweek2.reponsitories;

import fit.edu.iuh.vn.labweek2.db.Connection;
import fit.edu.iuh.vn.labweek2.models.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;

public class CustomerReponsitory {
    private EntityManagerFactory emf;
    private EntityManager em;
    public CustomerReponsitory(){
        emf = Connection.getInstance().getEmf();
        em = emf.createEntityManager();
    }

    public void add(Customer c){
        em.persist(c);
    }

    public void delete(long id){
        em.remove(em.find(Customer.class, id));
    }

    public void update(Customer c){
        em.merge(c);
    }

    public List<Customer> getAllCustomer(){
        String sql = "select * from customer";
        List<Customer> l = em.createNativeQuery(sql, Customer.class).getResultList();
        return l;
    }
}
