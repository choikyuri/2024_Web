package chapter16.arraylist;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
	
}

class Tiger extends Animal{
	
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �Ƚ��ϴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̴� ����� �մϴ�.");
	}
	
}

class Eagle extends Animal{
	
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	public void flying() {
		System.out.println("�������� ������ ��� ���� �ٴմϴ�.");
	}
}

//============================================
public class AnimalMain {
	
	ArrayList<Animal> aniList=new ArrayList<>();

	  public static void main(String[] args) {
			AnimalMain aTest=new AnimalMain();
			aTest.addAnimal(); //��ĳ����
			System.out.println("---�ٿ�ĳ����---");
			aTest.testCasting();
	
		}//main
		
	  //addAnimal -> ��ĳ���� �޼ҵ�
	  public void addAnimal() {
		aniList.add(new Human()); //Animal������ �ڵ� ����ȯ
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani:aniList) {
			ani.move();
		}//for
		  
		  
	    }//method
	
	  //testCasting -> �ٿ�ĳ���� �޼ҵ�
	  public void testCasting() {
		  
		  for(int i=0;i<aniList.size();i++) {	
				Animal ani=aniList.get(i);//�θ� ArrayList�� ��ü�� ani��ü�� ����		
				if(ani instanceof Human) {
					Human h=(Human)ani;
					h.readBook();
				}else if(ani instanceof Tiger) {
					Tiger t=(Tiger)ani;
					t.hunting();
				}else if(ani instanceof Eagle) {
					Eagle e=(Eagle)ani;
					e.flying();
				}else {
					System.out.println("�������� �ʴ� Ÿ���Դϴ�");
				}//if
		     }//for
		  
	    }//method

}//class









