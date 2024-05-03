package chapter09;

public class VIPCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	
	//VIPCustomer�� �����ڸ� �����ε��Ͽ� 
	//Customer�� int customerID, String customerName�� �ʱ�ȭ�ϰ�
	//agentID�� �ʱ�ȭ �ϴ� �����ڸ� �����Ͻÿ�
	public VIPCustomer(int agentID ,int customerID, String customerName) {
		super(customerID,customerName);
		//this.customerID = customerID;
		//this.customerName = customerName;
		customerGrade="VIP";
		bonusRatio=0.1;
		this.agentID = agentID;//���� �����ȭ
		saleRatio=0.15;
	}
	//����Ʈ ����
	
	public int getAgentID() {
		return agentID;
	}

	@Override
	public int calcPrice(int price) {
		//���ϵ� ������ 10%
		//���ʽ�����Ʈ=(����-(������ ���Ϻ���))*bonusRatio
		bonusPoint+=(price -(int)(price*saleRatio))*bonusRatio;
		return price -(int)(price*saleRatio); //���ǰ���
		
	}

	@Override
	public String showCustomer() {
		return super.showCustomer()+"\n���� ������ "+agentID+"�Դϴ�.";
	}
	
	

}
