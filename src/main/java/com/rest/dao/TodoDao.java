package com.rest.dao;

import java.util.HashMap;
import java.util.Map;

import com.rest.model.Todo;

public enum TodoDao {
	
	instance;
	  
	  private Map<String, Todo> contentProvider = new HashMap<String, Todo>();
	  
	  private TodoDao() {
	    
	    Todo todo = new Todo();
	    todo.setId("1");
	    todo.setSummary("Learn REST");
	    todo.setDescription("Read http://www.vogella.com/tutorials/REST/article.html");
	    contentProvider.put("1", todo);
	    todo = new Todo();
	    todo.setId("2");
	    todo.setSummary("Do something");
	    todo.setDescription("Read complete http://www.vogella.com");
	    contentProvider.put("2", todo);
	    
	  }
	  public Map<String, Todo> getModel(){
	    return contentProvider;
	  }

}
