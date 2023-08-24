package com.api4.Day_4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api4.Day_4.model.Student;
import com.api4.Day_4.repository.StudentRepo;
@Service
public class ApiService {
@Autowired
StudentRepo sr;

public Student addinfo(Student s) {
	// TODO Auto-generated method stub
	return sr.save(s);
}
public List<Student> showinfo() {
	// TODO Auto-generated method stub
	return sr.findAll();
}
public Student updateinfo(Student s) {
	// TODO Auto-generated method stub
	return sr.saveAndFlush(s);
}
public void del(Student s) {
	// TODO Auto-generated method stub
    sr.delete(s);
}



}
