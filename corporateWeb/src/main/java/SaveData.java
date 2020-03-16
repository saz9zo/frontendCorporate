import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.annotation.WebServlet;
public class SaveData {

     public void saveit (String name, String email, String phone,String query) {
             queryPojo qPojo = new queryPojo();   
             qPojo.setName(name);
             qPojo.setEmail(email);
             qPojo.setPhone(phone);
             qPojo.setQuery(query); 
             
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("querycontrol");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        
        em.persist(qPojo);
        et.commit();

         }    
     }
  
