package com.studentDetails.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentDetails.Entity.Student;
import com.studentDetails.Service.StudentService;
import com.studentDetails.exception.AgeException;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	
	@PostMapping(value ="/post")
	public String postValue(@RequestBody List<Student> li) {
		return ss.postValue(li);
	}
	
	@PostMapping(value = "/postvalue")
	public String post(@RequestBody Student a) throws AgeException {
		return ss.post(a);
	}
	
	@GetMapping("/getvalue/{b}")
	public String getvalue(@PathVariable int b){
		return ss.getvalue(b);
	}
	
	@GetMapping("/getper/{a}")
	public int getper(@PathVariable int a) {
		return ss.getper(a);
	}
	
	@PatchMapping("/modifyname/{a}")
	public String modify(@PathVariable int a,@RequestBody Student s) {
		return ss.modify(a, s);
	}

}
