package chapter12.MultiInterface;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		System.out.println("-------Buy-------");
		Buy buyer=customer; //교집합
		buyer.buy();
		buyer.order();
		
		System.out.println("-------Sell-------");
		Sell seller=customer; //교집합
		seller.sellOrder();
		//seller.order();
		
		//seller 부모 / Customer 자식
		if(seller instanceof Customer) {
			Customer customer2=(Customer)seller;//명시적인 형변환
			System.out.println("Down Chasting");
			customer2.buy(); //Customer
			customer2.sell(); //sell
			customer2.sellOrder(); //sell
		}
		
		

	}

}
