package javaPractice.ch03.second;

public class Student extends People {
	
	public int studentNo;
	
	public Student(String name, String ssn, int student) {
		super(name, ssn);
		
		this.name = name;
		this.name = ssn;
		this.studentNo = studentNo;
	}
	
	public Student(String name, String ssn) {
		super(name, ssn);
	}
	
	public Student() {
		
	}
}
