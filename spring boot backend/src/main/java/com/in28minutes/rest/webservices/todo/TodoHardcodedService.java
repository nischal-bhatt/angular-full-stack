package com.in28minutes.rest.webservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {

	private static List<Todo> todos = new ArrayList();

	private static int idCounter = 0;
	
    static {
    	//todos.add(new Todo(++idCounter,"nishbhatty","learn pything", false, new Date()));
    	todos.add(new Todo(++idCounter,"nishbhatty","learn c++", false, new Date()));
    	todos.add(new Todo(++idCounter,"nishbhatty","learn c", false, new Date()));
    	todos.add(new Todo(++idCounter,"nishbhatty","learn how to debug", false, new Date()));
    	todos.add(new Todo(++idCounter,"nishbhatty","watch netflix", false, new Date()));
    	todos.add(new Todo(++idCounter,"nishbhatty","dont give up - this is me", true, new Date()));
    }
    
    public List<Todo> findAll()
    {
    	return todos;
    }
}
