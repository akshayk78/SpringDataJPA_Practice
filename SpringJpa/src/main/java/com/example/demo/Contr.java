package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Contr {

	@Autowired
	Operator session;
	
	@ResponseBody
	@RequestMapping(path = "/getAll",produces = {"Application/json"})
	public List<Student> getAll() 
	{
		List<Student> list= new ArrayList<Student>();
		
		Iterable<Student> s = session.findAll();
		
		for(Student ss:s) 
		{
			list.add(ss);
		}
		

		return list;
		
	}	
	
	@ResponseBody
	@RequestMapping(path = "/getOne",produces = {"Application/json"})
	public Optional<Student> getone(@RequestParam("sid") int id) 
	{
		
		Optional<Student> s=session.findById(id);
		
		return s;
	}	
	
	@ResponseBody
	@RequestMapping(path = "/Update",produces = {"Application/json"})
	public String  update(@RequestParam("sid") int id,@RequestParam("sname") String name) 
	{
		
	  boolean ex = session.existsById(id);
		
	  if(ex) 
	  {
		  	Student s= new Student();
		  	s.setId(id);
		  	s.setName(name);
		  	
		  	session.save(s);
		  	
	  }
	  else {
		  return " enter correct Student Id";
		  
	  }
	  
		return "updated";
	}	
	
	@ResponseBody
	@RequestMapping(path="/delete")
	public String delete(@RequestParam("sid") int id)
	{
		 boolean ex = session.existsById(id);
			
		 if(ex) 
		 {
			 
			 session.deleteById(id);
		 }
		 else 
		 {
			 return "enter valid Student ID";
			 
		 }
		
		
		return "deleted value";
	}
	
	@ResponseBody
	@RequestMapping(path = "/SaveNew")
	public String sav(@RequestParam("sid") int id,@RequestParam("sname") String name) 
	{
		 boolean ex = session.existsById(id);
			
		 if(ex==false) 
		 {
			 Student s= new Student();
			 s.setId(id);
			 s.setName(name);
			 session.save(s);
		 
		 }
		 else 
		 {
			 return "entered  Student ID is already in use pls enter new id";
			 
		 }
		
		return "values are stored in dataBase";
	}
	
	
	@RequestMapping(path="/index")
	public String im() 
	{
		return "index.jsp";
	}
	
}
