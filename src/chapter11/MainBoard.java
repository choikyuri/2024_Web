package chapter11;

public class MainBoard {

	public static void main(String[] args) {
		
		
		/*
		BeginnerLevel begin=new BeginnerLevel();
		begin.go(0);
		begin.showLevelMessage();
		*/
				
			
		//기본 게임 1단계
		Player player=new Player();
		player.play(1);
		
		System.out.println();
		//게임 2단계
		PlayerLevel aLevel=new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		player.toString();
		
		
		System.out.println();
		//게임 3단계
		SuperLevel sLevel=new SuperLevel();
		player.upgradeLevel(sLevel);//level
		player.play(3); //go
		player.toString();

	}
	
	

}
