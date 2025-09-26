package com.geetha.spring.securityspring.repository;

import com.geetha.spring.securityspring.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
