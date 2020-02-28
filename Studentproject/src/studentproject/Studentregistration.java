package studentproject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Studentregistration {

	@Id
	private int id;
	private String Name;
	private int Age;
	private String FatherName;
	private int Marks;
	private String Grade;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	@Override
	public String toString() {
		return "Studentregistration [id=" + id + ", Name=" + Name + ", Age=" + Age + ", FatherName=" + FatherName
				+ ", Marks=" + Marks + ", Grade=" + Grade + "]";
	}
	
	

}
