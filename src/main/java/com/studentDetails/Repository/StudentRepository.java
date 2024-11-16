package com.studentDetails.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentDetails.Entity.Student;


public interface StudentRepository extends JpaRepository<Student,Integer> {

	@Query(value = ("select attendance from student where roll_number like ?"),nativeQuery = true)
	public  int getper(int a);
}
