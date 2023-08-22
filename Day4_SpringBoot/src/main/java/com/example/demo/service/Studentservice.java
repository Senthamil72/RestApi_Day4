package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepo;
import com.example.demo.model.Student;


@Service
public class Studentservice {
	
	@Autowired
	StudentRepo sr;
	public Student saveinfo(Student ss)
	{
		return sr.save(ss);
	}
	public List<Student> showinfo()
	{
		return sr.findAll();
	}
	public Student changeinfo(Student ss)
	{
		return sr.saveAndFlush(ss);
	}
	public void deleteinfo(Student ss)
	{
		sr.delete(ss);
		
	}
}
