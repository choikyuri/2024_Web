package chapter10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridingTest1 {

	public static void main(String[] args) {
		Customer customerLee=new Customer(10001, "장민");
		customerLee.bonusPoint=5000;
		System.out.println(customerLee.showCustomer());
		
		VIPCustomer customerKim=new VIPCustomer(1004, 10002, "한도형");
		customerKim.bonusPoint=1000;
		System.out.println();
		System.out.println(customerKim.showCustomer());
		System.out.println();
		int price=10000;
		System.out.println(customerLee.getCustomerName()+"님이 "+customerLee.calcPrice(price)+"원을 지불 완료하였습니다.");
		System.out.println(customerKim.getCustomerName()+"님이 "+customerKim.calcPrice(price)+"원을 지불 완료하였습니다.");
		

	}

}
