package org.mountblue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.*;

public class DisplayContactData {
    public List<QueryPojo> fetchData () {
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
      return queryList;
    }
}