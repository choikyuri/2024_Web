package chapter09;

public class CustomerMain {

	public static void main(String[] args) {
		
		System.out.println("--------일반고객-------");
		//방법1
		int price=10000;
		Customer cs1=new Customer();//보너스비율, 등급
		cs1.setCustomerName("김성웅");
		System.out.println(cs1.getCustomerName()+"님이 "
							+cs1.calcPrice(price)+"원을 지불 완료하였습니다");
		System.out.println(cs1.showCustomer());
		
		//방법2
		price=24000;
		Customer cs2=new Customer(510,"임도영");
		System.out.println(cs2.getCustomerName()+"님이 "
				+cs2.calcPrice(price)+"원을 지불 완료하였습니다");
		System.out.println(cs2.showCustomer());
		
		System.out.println("--------VIP-------");
		price=54000;
		VIPCustomer vipcs=new VIPCustomer(1004, 1010, "홍길동");
		
		int vipprice=vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName()+"님이 "
						+vipprice+"원을 지불 완료하였습니다.");
		System.out.println(vipcs.showCustomer());

	}

}













