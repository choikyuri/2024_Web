package chapter11;

public class MainBoard {

	public static void main(String[] args) {
		
		
		/*
		BeginnerLevel begin=new BeginnerLevel();
		begin.go(0);
		begin.showLevelMessage();
		*/
				
			
		//�⺻ ���� 1�ܰ�
		Player player=new Player();
		player.play(1);
		
		System.out.println();
		//���� 2�ܰ�
		PlayerLevel aLevel=new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		player.toString();
		
		
		System.out.println();
		//���� 3�ܰ�
		SuperLevel sLevel=new SuperLevel();
		player.upgradeLevel(sLevel);//level
		player.play(3); //go
		player.toString();

	}
	
	

}
