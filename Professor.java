package task2;

import java.util.ArrayList;

public class Professor extends Employee {

	public Course courses;
	public Exam exam; 
	
	public ArrayList<Course> offeredCourses;
	
	
	public void assign_TA() {
		 TA newTA = new TA(); 
	     courses.ta = newTA; 
	}
	
	public void addNewCourse() {
		offeredCourses.add(courses); 
		
	}
}
