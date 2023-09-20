package fit.edu.iuh.vn.labweek2.db;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class Connection {
    private static Connection instance;
    private EntityManagerFactory emf;
    private Connection(){
        emf = Persistence.createEntityManagerFactory("Lab-week_WWW");
    }
    public EntityManagerFactory getEmf(){
        return emf;
    }

    public static Connection getInstance(){
        if(instance == null){
            instance = new Connection();
        }
        return instance;
    }


}
