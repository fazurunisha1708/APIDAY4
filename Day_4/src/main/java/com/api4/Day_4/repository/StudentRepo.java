package com.api4.Day_4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api4.Day_4.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
