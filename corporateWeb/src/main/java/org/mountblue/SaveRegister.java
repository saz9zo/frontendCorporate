package org.mountblue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.mindrot.jbcrypt.BCrypt;
import java.util.*;


public class SaveRegister {
    public boolean saveData (String name, String email, String password) {

            List<AdminPojo> adminList = new ArrayList<>(); 
             String pass = BCrypt.hashpw(password, BCrypt.gensalt(12));
            AdminPojo aPojo = new AdminPojo();
            aPojo.setName(name);
            aPojo.setEmail(email);
            aPojo.setPassword(pass);
          
        try {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("querycontrol");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
         
        adminList = entityManager.createQuery("select e from AdminPojo e", AdminPojo.class).getResultList();
        for(AdminPojo admin : adminList) {
            if(admin.getEmail().equals(email)){
                return false;
            }
        }
        
        entityTransaction.begin();
        entityManager.persist(aPojo);
        entityTransaction.commit();
        entityManager.close();
        }
        catch (Exception e){}

        return true;
    }
}