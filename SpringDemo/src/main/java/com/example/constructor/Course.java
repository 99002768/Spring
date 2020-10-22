package com.example.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
String courseName;
String coursePrice;
public String getCourseName() {
	return courseName;
}
@Value("${student.course.courseName}")
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getCoursePrice() {
	return coursePrice;
}
@Value("${student.course.coursePrice}")
public void setCoursePrice(String coursePrice) {
	this.coursePrice = coursePrice;
}
@Override
public String toString() {
	return "Course [courseName=" + courseName + ", coursePrice=" + coursePrice + "]";
}

}
