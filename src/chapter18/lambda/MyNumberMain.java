package chapter18.lambda;

public class MyNumberMain {

	public static void main(String[] args) {
		//规过1
		MyNumber max=(x,y)->(x>=y)?x:y;
        //备泅何甫 措涝窍咯 肯己等 皋家靛甫 角青
		System.out.println(max.getMax(10, 20));
		
		//规过2
		MyNumber aa=new MyNumber() {
			
			@Override
			public int getMax(int x, int y) {
				int max=(x>=y)?x:y;
				return max;
			}
		};
		
		//====================
		System.out.println(aa.getMax(10, 20));
	}

}






