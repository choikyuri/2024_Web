package chapter09;

public class VIPCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	
	//VIPCustomer의 생성자를 오버로딩하여 
	//Customer의 int customerID, String customerName를 초기화하고
	//agentID도 초기화 하는 생성자를 구현하시오
	public VIPCustomer(int agentID ,int customerID, String customerName) {
		super(customerID,customerName);
		//this.customerID = customerID;
		//this.customerName = customerName;
		customerGrade="VIP";
		bonusRatio=0.1;
		this.agentID = agentID;//전문 상담전화
		saleRatio=0.15;
	}
	//포인트 적립
	
	public int getAgentID() {
		return agentID;
	}

	@Override
	public int calcPrice(int price) {
		//세일된 가격의 10%
		//보너스포인트=(가격-(가격의 세일비율))*bonusRatio
		bonusPoint+=(price -(int)(price*saleRatio))*bonusRatio;
		return price -(int)(price*saleRatio); //물건가격
		
	}

	@Override
	public String showCustomer() {
		return super.showCustomer()+"\n전문 상담원은 "+agentID+"입니다.";
	}
	
	

}
