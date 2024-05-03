package chapter18.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTestMain {

	public static void main(String[] args) {
		//����
		List<TravelCustomer> customerList=new ArrayList<TravelCustomer>();
		
		//��ü ����
		TravelCustomer customerLee=new TravelCustomer("�̼���", 30,28000);
		TravelCustomer customerKim=new TravelCustomer("������", 20,35000);
		TravelCustomer customerHong=new TravelCustomer("ȫ�浿", 18,25000);
		
		//�߰�
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		 System.out.println("==�� ��� �߰��� ������� ���==");
		 customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		 //mapToInt : Integer -> int
		 int total=customerList.stream().mapToInt(c->c.getPrice()).sum();
		 System.out.println("�� ����: "+total);
		 //filter : Ư�� ���ǿ� �´� �����͸� �ɷ�����
         System.out.println("==20�� �̻��� ���� �̸��� �����Ͽ� ���==");
		 customerList.stream().filter(c->c.getAge()>=20).
		 												map(c->c.getName()).sorted().
		 												forEach(s->System.out.println(s));
		
		
		
		
		
		
		
		
	}

}
