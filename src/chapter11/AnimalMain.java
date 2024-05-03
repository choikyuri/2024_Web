package chapter11;

public class AnimalMain {

	public static void main(String[] args) {
       //���1
	   System.out.println("-----------���1-----------");
       Cat cat=new Cat();
       System.out.println(cat.kind);
       cat.sound();
       
       Dog dog=new Dog();
       System.out.println(dog.kind);
       dog.sound();
       
       Spider spider=new Spider();
       System.out.println(spider.kind);
       spider.sound();
       
       //���2
       System.out.println("-----------���2-----------");
       animalSound(new Cat());//Animal cat=new Cat()
       animalSound(new Spider());//Animal spider=new Spider()
       animalSound(new Dog());//Animal dog=new Dog()
       
       //���3
       System.out.println("-----------���3-----------");
       Animal animal=null;
       
       animal=new Cat(); //�ν��Ͻ� ������ �ڵ� ����ȯ
       System.out.println(animal.kind);
       animal.sound();
       
       animal=new Spider();
       System.out.println(animal.kind);
       animal.sound();
       
       animal=new Dog();
       System.out.println(animal.kind);
       animal.sound();
       
       
	}
	
	public static void animalSound(Animal animal) {
		System.out.println(animal.kind);
		animal.sound();
	}
	
	

}


	






