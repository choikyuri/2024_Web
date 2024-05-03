package chapter12.Interface;

public class SmartTelevision implements Remote, Searchable{
	
	private int volume;


	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {

      //만약에 MAX_VOULUME보다 volume크면 MAX_VOULUME값을 volume에 대입
	  //만약에 MIN_VOULUME보다 volume작으면 MIN_VOULUME값을 volume에 대입
	  //그밖에 volume을 this.volume에 대입
	  //출력은: 현재 TV 볼륨: 8	
		if (volume > Remote.MAX_VOLUME) {
			this.volume = Remote.MAX_VOLUME;
		} else if (volume < Remote.MIN_VOLUME) {
			this.volume = Remote.MIN_VOLUME;
		}else {	
			this.volume = volume;
		}
		
	System.out.println("현재 볼륨 : " + volume);
	
	}
	
	@Override
	public void search(String url) {
		System.out.println(url +"을 검색합니다.");
	}

}
