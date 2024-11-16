package com.studentDetails.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentDetails.Entity.Student;
import com.studentDetails.Repository.StudentRepository;
import com.studentDetails.exception.AgeException;

@Repository
public class StudentDao {

	@Autowired
	StudentRepository sr;
	
	public String postValue(List<Student> li) {
		 sr.saveAll(li);
		return "Saved SuccessFully";
	}

	public String post(Student a) throws AgeException {
		sr.save(a);
		return "Saved";
	}

	public String  getvalue(int b) {
		 return sr.findById(b).get().getName();
		 
		
	}
	
	public int getper(int a) {
		return sr.getper(a);
	}

	public String modify(int a, Student s) {
		Student val = sr.findById(a).get();
		val.setName(s.getName());
		sr.save(s);
		return "Saved successfully";
	}
}
