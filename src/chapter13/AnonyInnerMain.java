package chapter13;



public class AnonyInnerMain {
	
	
	public void test() {
		
		new TestInter() {
			
			@Override
			public void printData() {
				System.out.println("ȱ��!!!");
			}//�߻�޼ҵ� ����
			
		}.printData();
	}
	
	
	public static void main(String[] args) {
		
		AnonyInnerMain in=new AnonyInnerMain();
		in.test();
		
		
	}

}
