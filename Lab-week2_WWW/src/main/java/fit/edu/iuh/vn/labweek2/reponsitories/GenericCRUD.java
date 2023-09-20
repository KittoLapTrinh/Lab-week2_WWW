package fit.edu.iuh.vn.labweek2.reponsitories;

import fit.edu.iuh.vn.labweek2.db.Connection;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public abstract class GenericCRUD <T>{
    protected EntityManager em;
    public GenericCRUD(){
        em = Connection.getInstance().getEmf().createEntityManager();
    }
    public boolean create(T t){
        EntityTransaction tr = em.getTransaction();
        try {
            tr.begin();
            em.persist(t);
            tr.commit();
            return true;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
