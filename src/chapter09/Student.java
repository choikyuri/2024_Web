package chapter09;

public class Student extends People{
	/*
	public String name;
	public String ssn;
	*/
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);//오버로딩된 부모클래스의 생성자를 호출하여 초기화 해야함
		this.studentNo = studentNo;
	}
	
	
	
	

}
