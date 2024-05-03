package chapter11;

public class AnimalMain {

	public static void main(String[] args) {
       //规过1
	   System.out.println("-----------规过1-----------");
       Cat cat=new Cat();
       System.out.println(cat.kind);
       cat.sound();
       
       Dog dog=new Dog();
       System.out.println(dog.kind);
       dog.sound();
       
       Spider spider=new Spider();
       System.out.println(spider.kind);
       spider.sound();
       
       //规过2
       System.out.println("-----------规过2-----------");
       animalSound(new Cat());//Animal cat=new Cat()
       animalSound(new Spider());//Animal spider=new Spider()
       animalSound(new Dog());//Animal dog=new Dog()
       
       //规过3
       System.out.println("-----------规过3-----------");
       Animal animal=null;
       
       animal=new Cat(); //牢胶畔胶 函荐狼 磊悼 屈函券
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


	






