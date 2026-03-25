package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private double marks;
	
	@Column
	private int rollnum;
	
	@Column
	private String grade;
	
	@Column
	private String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getmarks() {
		return name;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getrollnum() {
		return name;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", marks=" + marks + ", rollnum=" + rollnum + ", grade=" + grade + ", city="
				+ city + "]";
	}
	
	
	
}
