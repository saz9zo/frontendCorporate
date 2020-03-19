package org.mountblue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.*;
import com.google.gson.Gson; 


public class DisplayContactData {
    public String fetchData () {
        List<QueryPojo> queryList = new ArrayList<>();

        EntityManagerFactory emfactory = null;
        try {
            emfactory = Persistence.createEntityManagerFactory("querycontrol");
            EntityManager entitymanager = emfactory.createEntityManager();
            queryList = entitymanager.createQuery("select e from QueryPojo e", QueryPojo.class).getResultList();
       } catch(Exception e){}
       finally{
            emfactory.close();
      }
      Gson g = new Gson();
      String json = g.toJson(queryList); 

      
      return json;
    }
}