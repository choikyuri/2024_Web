package chapter09;

public class CustomerMain {

	public static void main(String[] args) {
		
		System.out.println("--------�Ϲݰ�-------");
		//���1
		int price=10000;
		Customer cs1=new Customer();//���ʽ�����, ���
		cs1.setCustomerName("�輺��");
		System.out.println(cs1.getCustomerName()+"���� "
							+cs1.calcPrice(price)+"���� ���� �Ϸ��Ͽ����ϴ�");
		System.out.println(cs1.showCustomer());
		
		//���2
		price=24000;
		Customer cs2=new Customer(510,"�ӵ���");
		System.out.println(cs2.getCustomerName()+"���� "
				+cs2.calcPrice(price)+"���� ���� �Ϸ��Ͽ����ϴ�");
		System.out.println(cs2.showCustomer());
		
		System.out.println("--------VIP-------");
		price=54000;
		VIPCustomer vipcs=new VIPCustomer(1004, 1010, "ȫ�浿");
		
		int vipprice=vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName()+"���� "
						+vipprice+"���� ���� �Ϸ��Ͽ����ϴ�.");
		System.out.println(vipcs.showCustomer());

	}

}













