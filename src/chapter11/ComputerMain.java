package chapter11;

public class ComputerMain {

	public static void main(String[] args) {
		
		Computer c2=new DeskTop();
		c2.typing(); //DeskTop
		c2.display(); //DeskTop
		System.out.println();
		
		//abstract class 즉 추상 클래스는 객체를 생성할 수 없음
		//NoteBook note=new NoteBook();
		
		Computer c4=new MyNoteBook();
		c4.display(); //NoteBook
		c4.typing(); //MyNoteBook
	}

}
