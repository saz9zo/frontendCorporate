import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.annotation.WebServlet;
public class SaveData {

     public void saveit (String name, String email, String phone,String query) {
             QueryPojo qPojo = new QueryPojo();
             qPojo.setName(name);
             qPojo.setEmail(email);
             qPojo.setPhone(phone);
             qPojo.setQuery(query); 
             
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("querycontrol");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(qPojo);
        entityTransaction.commit();
        entityManager.close();
 
         }    
     }
  
