package chapter14.string;

public class Person {
	
	public String name; 
	public int age;
	
	//생성자를 오버로딩(1.name초기화 | 2.name,age초기화)를 하되 디폴트 생성자도 사용할 수 있도록
	public Person() {
	}
	
	public Person(String name) {
		this.name=name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//getter & setter 호출
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
	
	//toString 오버라이딩
	@Override
	public String toString() {
		return name + ", "+age;
	}
	
	
	

}
