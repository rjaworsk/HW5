package task2;

public class Course {

	public int id; 
	public String name; 
	public int maxCapacity; 
	public Boolean isFull; 
	public Professor prof; 
	public Student student; 
	public Exam exam; 
	public TA ta; 

	
	public Course(int id, String name, int cap, Professor prof) {
		this.id = id; 
		this.name = name; 
		this.maxCapacity = cap; 
		this.prof = prof; 
	}
		
	
	public void setMaxCap(int max) {
		this.maxCapacity = max; 
	}
	
	public Professor getProf() {
		return this.prof; 
	}
	
	
	public void setName(String s) {
		this.name = s; 
		
	}
	
	
	
}
