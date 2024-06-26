package chapter09;

    //#1
	class Animal{
		public void move() {
			System.out.println("동물이 움직입니다.");
		}
	}	
	//================================
	//#2
	class Human extends Animal{
		//오버라이딩
		public void move() {
			System.out.println("사람은 두발로 걷습니다.");
		}
		
		public void readBook() {
			System.out.println("사람은 책을 읽습니다.");
		}
	}
	//#3
	class Tiger extends Animal{
		public void move() {
			System.out.println("호랑이는 네발로 걷습니다.");
		}
		
		public void hunting() {
			System.out.println("호랑이는 사냥을 합니다.");
		}
	}
	//#4
	class Eagle extends Animal{
		public void move() {
			System.out.println("독수리는 하늘은 납니다.");
		}
		
		public void flying() {
			System.out.println("독수리는 날개를 펴고 날아 다닙니다");
		}
	}
	//------------------------------------------------------

public class AnimalTest {
			
		public void moveAnimal(Animal animal) { //Animal animal : Human, Tiger, Eagle
			animal.move();
		}	

	public static void main(String[] args) {
		
		AnimalTest aTest=new AnimalTest();
		
		//new Human() : Human() h=new Human();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		
		System.out.println();
		Human h=new Human();
		h.readBook();
		Tiger t=new Tiger();
		t.hunting();
		Eagle e=new Eagle();
		e.flying();

	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	