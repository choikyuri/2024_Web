package chapter08;

public class StaticFunctionMain {

	public static void main(String[] args) {
		//객체로 접근
		StaticFunction st=new StaticFunction();
		System.out.println(st.str2);
		String s=st.getStatic();
		System.out.println(s);
		
		
		//클래스 명으로 접근
		String str;
		str=StaticFunction.getStatic();
		System.out.println(str);
		
		

	}

}
