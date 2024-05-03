package chapter12.Interface;

public class SmartTelevision implements Remote, Searchable{
	
	private int volume;


	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {

      //���࿡ MAX_VOULUME���� volumeũ�� MAX_VOULUME���� volume�� ����
	  //���࿡ MIN_VOULUME���� volume������ MIN_VOULUME���� volume�� ����
	  //�׹ۿ� volume�� this.volume�� ����
	  //�����: ���� TV ����: 8	
		if (volume > Remote.MAX_VOLUME) {
			this.volume = Remote.MAX_VOLUME;
		} else if (volume < Remote.MIN_VOLUME) {
			this.volume = Remote.MIN_VOLUME;
		}else {	
			this.volume = volume;
		}
		
	System.out.println("���� ���� : " + volume);
	
	}
	
	@Override
	public void search(String url) {
		System.out.println(url +"�� �˻��մϴ�.");
	}

}
