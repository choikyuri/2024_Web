package chapter14.string;

public class PersonMain {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//���1
		Person person=new Person();
		System.out.println(person); 
		
		Person person2=new Person("SOLDESK");
		System.out.println(person2);
		
		Person person3=new Person("SOLDESK",24);
		System.out.println(person3);
		
		Class pClass1=person.getClass();
		System.out.println(pClass1); //Class : Ŭ���� ����
		System.out.println();
		
		//���2
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		//���3
		Class pClass3=Class.forName("chapter14.string.Person");
		System.out.println(pClass3.getName());		  
	}

}
