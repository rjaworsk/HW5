package task2;

import java.util.ArrayList;

public class Exam {
	

	public int max_value; 
	public Course course; 
	public Question question; 
	public Student student; 
	
	public ArrayList<Question> questions;
	public ArrayList<Student> registeredStudents;
	
	
	public Boolean register(Student student){
		if (student.registeredExams.contains(this.course) == true) {
			return true; 
		}else {
			return false; 
		}		
	}
	
	public void addQuestion(int id, String task, int value) {
		Question quest = new Question(id,task,value); 
		questions.add(quest); 
	}
	
	
	public void setMaxValue(int max) {
		this.max_value = max; 
		
	}
	
	class Question{  // Aggregation: Exam ◆--Question
		public String task; 
		public int maxValue; 
		public int q_id; 
		
		public Question(int id, String task, int value) {
			this.q_id = id; 
			this.task = task; 
			this.maxValue = value; 
			
	}
	}
	
	
}
