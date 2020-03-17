package org.mountblue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.*;
import org.mindrot.jbcrypt.BCrypt;

public class Validate {
    
    public boolean validEntry (String username, String password) {

          if(username=="" || password==""){
              return false;
          }

        List<AdminPojo> adminList = new ArrayList<>();

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("querycontrol");
        EntityManager entitymanager = emfactory.createEntityManager();
        adminList = entitymanager.createQuery("select e from AdminPojo e ", AdminPojo.class).getResultList();
         
        for(AdminPojo list : adminList) {
            String pass = list.getPassword();
            System.out.println(pass);
            if(list.getEmail().equals(username) && BCrypt.checkpw(password, pass)){
               return true;
            }
        }
        return false;
    }
}