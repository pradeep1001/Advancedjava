package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Course 
{
	@Id
	@GeneratedValue
	int courseId;
	String courseName;
	int durationInMonth;
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDurationInMonth() {
		return durationInMonth;
	}
	public void setDurationInMonth(int durationInMonth) {
		this.durationInMonth = durationInMonth;
	}
	
	
}
