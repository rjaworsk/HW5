package task2;

import java.util.ArrayList;


public class Student {

	public String name;
	public int StudentId; 
	public  Project project; 
	public Course courses; 
	public Exam exam; 
	public ArrayList<Course> registeredExams;
	
	
	public String getName() {
		return this.name; 
	}
	
	public Project getProjects() {
		return this.project; 
	}
	
	public void registerForExam(Exam exam) {
		registeredExams.add(exam.course); 

		
	}
}
