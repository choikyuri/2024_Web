package chapter19;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println("비정상 종료");

	}

}
