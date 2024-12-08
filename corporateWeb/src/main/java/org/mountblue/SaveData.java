package org.mountblue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveData {
    public void saveit (QueryPojo qPojo) {
      
             EntityManagerFactory entityManagerFactory = null;

          try{
        entityManagerFactory = Persistence.createEntityManagerFactory("querycontrol");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(qPojo);
        entityTransaction.commit();
        entityManager.close();
       
          }
          catch(Exception e){}
          finally {  
            entityManagerFactory.close();      
          }
         }    
     }
  
