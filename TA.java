package task2;

import java.util.ArrayList;

public class TA {

  public Course courses; 
  
  public String name; 
  
  public ArrayList<Course> TAcourses;
  
  public void teaches(Course courses) { 
	  TAcourses.add(courses);
  }
  
  
  public Course getCourse() {
	  return this.courses; 
  }
  
  public String getName() {
	  return this.name; 
  }
  
  
  public void setName(String name) {
	  this.name = name; 
  }
  
}
