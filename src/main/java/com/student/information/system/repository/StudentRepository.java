package com.student.information.system.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.student.information.system.model.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
	List<Student> findByLastName(@Param("name") String name);
}
