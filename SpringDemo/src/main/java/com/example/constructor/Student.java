package com.example.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
String StuName;
int stuId;
String StuDep;
Course course;
@Autowired


public Student(Course course) {
	super();
	this.course = course;
}

public String getStuName() {
	return StuName;
}
@Value("${student.StuName}")
public void setStuName(String stuName) {
	StuName = stuName;
}
public int getStuId() {
	return stuId;
}
@Value("${student.stuId}")
public void setStuId(int stuId) {
	this.stuId = stuId;
}
public String getStuDep() {
	return StuDep;
}
@Value("${student.StuDep}")
public void setStuDep(String stuDep) {
	StuDep = stuDep;
}
@Override
public String toString() {
	return "Student [StuName=" + StuName + ", stuId=" + stuId + ", StuDep=" + StuDep + ", course=" + course + "]";
}

}
