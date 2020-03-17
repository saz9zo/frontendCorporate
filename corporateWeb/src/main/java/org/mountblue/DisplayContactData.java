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
    try {
    EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("querycontrol");
    EntityManager entitymanager = emfactory.createEntityManager();
    TypedQuery<QueryPojo> query = entitymanager.createQuery("SELECT que FROM contactQuery que",QueryPojo.class);
    queryList = query.getResultList();
    for(QueryPojo q: queryList) {
        System.out.println(q);
    }
} catch(Exception e){}
finally{

}
      return queryList;
    }
}