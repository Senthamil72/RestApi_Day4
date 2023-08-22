package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.Studentservice;

@RestController
public class ApiController {
	@Autowired
	Studentservice sser;
	@PostMapping("Add")
	public Student add (@RequestBody Student ss)
	{
		return sser.saveinfo(ss);
	}
	@GetMapping("show")
	public List<Student> show(Student ss)
	{
		return sser.showinfo();
	}
	@PutMapping("update")
	public Student update (@RequestBody Student ss)
	{
		return sser.changeinfo(ss);
	}
	@DeleteMapping("delete")
	public String  delete(@RequestBody Student ss)
	{
		sser.deleteinfo(ss);
		return "Delete Succesfullt";
		
	}

}
