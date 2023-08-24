package com.api4.Day_4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api4.Day_4.model.Student;
import com.api4.Day_4.service.ApiService;


@RestController
public class ApiController {
@Autowired
ApiService as;
@PostMapping("/addEmp")
public Student details(@RequestBody Student s) {
	return as.addinfo(s);
}
@GetMapping("show")
public List<Student> showdetails(){
	return as.showinfo();
}
@PutMapping("update")
public Student updatedetails(@RequestBody Student s) {
	return as.updateinfo(s);
}
@DeleteMapping("delete")
public String delete(@RequestBody Student s) {
	as.del(s);
	return "successfull";
}

}
