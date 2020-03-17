package org.mountblue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class SaveRegister {
    public void saveData (String name, String email, String password) {
            AdminPojo aPojo = new AdminPojo();
            aPojo.setName(name);
            aPojo.setEmail(email);
            aPojo.setPassword(password);
                 
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("querycontrol");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(aPojo);
        entityTransaction.commit();
        entityManager.close();
    }
}