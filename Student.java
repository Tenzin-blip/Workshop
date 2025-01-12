package Workshop;

public class Student {
	private int id;
	private String name;
	private int age;
	private char grade;
	
	Student (int id, String name, int age, char grade){
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(1,"Tenzin",16,'A');
		System.out.println("Id: " + s1.id);
		System.out.println("Name: " + s1.name);
		System.out.println("Age: " + s1.age);
		System.out.println("Grade: " + s1.grade);
		
	}
}
