import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


/**
 * Created by pwhiters on 1/28/2016.
 */
public class JPADriver {

    public static void main(String[] args){

        Person pr = new Person();
        pr.setPersonName("Mat Whiters");
        //pr.setPersonId(12345);

//        EntityManagerFactory entityManagerFactory; // = Persistence.createEntityManagerFactory("PersonPU");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersonPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;

        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(pr);
            entityTransaction.commit();
        }
        catch(RuntimeException e){
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            throw e;
        }

    }
}
