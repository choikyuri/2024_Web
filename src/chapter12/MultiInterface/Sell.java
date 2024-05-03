package chapter12.MultiInterface;

public interface Sell {
	
	void sell();
	
	/*
	default void order() {
		System.out.println("판매 주문");
	}*/
	
	default void sellOrder() {
		System.out.println("판매 주문");
	}

}
