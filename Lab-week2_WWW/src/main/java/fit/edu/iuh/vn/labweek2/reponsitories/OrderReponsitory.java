package fit.edu.iuh.vn.labweek2.reponsitories;

import fit.edu.iuh.vn.labweek2.db.Connection;
import fit.edu.iuh.vn.labweek2.models.Order;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;

public class OrderReponsitory {
    private EntityManager em;
    private EntityManagerFactory emf;



    public OrderReponsitory(){
        emf = Connection.getInstance().getEmf();
        em = emf.createEntityManager();
    }

    public void add(Order o){
        em.persist(o);
    }

    public void delete(long id){
        em.remove(em.find(Order.class, id));
    }

    public void update(Order o){
        em.merge(o);
    }

    public List<Order> getAll(){
        String sql = "select * from order";
        List<Order> lo = em.createNativeQuery(sql, Order.class).getResultList();
        return lo;
    }
}
