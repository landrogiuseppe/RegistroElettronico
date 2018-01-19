package org.solution.registroelettronico.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao {
	
	
	  @Autowired
	  private SessionFactory sessionFactory;
	  
	  
	  @Transactional
	  public Object ricercaDaId(long id) {
	    
		  Object found = null;
	    try{
	    	Session sessione = sessionFactory.getCurrentSession();
	    	found= (Object) sessione.get(Object.class, id);
	    }catch(Exception e){
	    	System.out.println(e);
	    }
	   
		return found;
	  }


}
