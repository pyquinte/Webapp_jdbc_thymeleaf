package com.quinte.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="subject")
public class Subject {
	@Id
	private int idSubject;
	private String code;
	private String name;
	private String level;
	private String teacher;
	
	@Override
	public String toString() {
		return "Subject [idSubject=" + idSubject + ", code=" + code + ", name=" + name + ", Level="+level + ", Teacher=" + teacher + "]";
	}
	public int getSubject() {
		return idSubject;
	}
	public int getIdSubject() {
		return idSubject;
	}
	public void setIdSubject(int idSubject) {
		this.idSubject = idSubject;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
}
