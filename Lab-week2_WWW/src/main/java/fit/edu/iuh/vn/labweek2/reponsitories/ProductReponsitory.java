package fit.edu.iuh.vn.labweek2.reponsitories;

import fit.edu.iuh.vn.labweek2.db.Connection;
import fit.edu.iuh.vn.labweek2.models.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;

public class ProductReponsitory {
    private EntityManagerFactory emf;
    private EntityManager em;

    public ProductReponsitory(){
        emf = Connection.getInstance().getEmf();
        em = emf.createEntityManager();
    }

    public void add(Product p){
        em.persist(p);
    }

    public void delete(long id){
        em.remove(em.find(Product.class, id));
    }

    public void update(Product p){
        em.merge(p);
    }

    public List<Product> getAll(){
        String sql = "select * from product";
        List<Product> lp = em.createNativeQuery(sql, Product.class).getResultList();
        return lp;
    }
}
