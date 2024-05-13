package com.quinte.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quinte.model.Subject;

public interface ISubjectRepository extends JpaRepository<Subject, Integer> {
	

}
