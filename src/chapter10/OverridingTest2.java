package chapter10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridingTest2 {

	public static void main(String[] args) {
		//�θ�=�ڽ�(�ڵ��� ��ȯ)
		Customer vc=new VIPCustomer(10003, 10003, "��ġ");
		System.out.println(vc.showCustomer());
		
	}

}
