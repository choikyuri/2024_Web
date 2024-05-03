package chapter21;

public class ThreadEx02 extends Thread{
	
	private int[] temp;
	
	public ThreadEx02() { // 0 1 2 3 4 5 6 7 8 9
		temp=new int[10];
		for(int i=0;i<temp.length;i++) {
			temp[i]=i;
		}
	}//������

	@Override
	public void run() {
		
		for(int i:temp) {
			
			try {
				Thread.sleep(1000);//1000�� 1��
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("temp : "+temp[i]);
		}
		
	}
	
	

}
