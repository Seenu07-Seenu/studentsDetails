package com.studentDetails.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentDetails.Dao.StudentDao;
import com.studentDetails.Entity.Student;
import com.studentDetails.Repository.StudentRepository;
import com.studentDetails.exception.AgeException;

@Service
public class StudentService {

	@Autowired
	StudentDao sd;
	@Autowired
	StudentRepository sa;
	
	public String postValue(List<Student> li) {
		return sd.postValue(li);
	}

	public String post(Student a) throws AgeException {
		if(a.getAge()>18){
			return sd.post(a);	
		}
		else {
			throw new AgeException("your age is below 18");
		}
		
	}

	public String getvalue(int b) {
		return sd.getvalue(b);
	}
	
	public int getper(int a) {
		return sd.getper(a);
	}

	public String modify(int a, Student s) {
		return sd.modify(a,s);
	}
}
