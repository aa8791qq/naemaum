package sec01.exam01;

public class TV implements RemoteControl, Searchable{

	int vol;
	
	// 범위 : public - > 생략불가능(범위축소불가)
	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다");
		
	}

	@Override
	public void setVolume(int vol) {
//		System.out.println(vol + "로 불륨을 바꿉니다.");
		if(vol >= MIN_VOLUME || vol <= MAX_VOLUME) {
			this.vol = vol;
			System.out.println(vol + "로 불륨을 바꿉니다.");
		} else if(vol <= MIN_VOLUME) {
				this.vol = MIN_VOLUME;
		} else if(vol >= MAX_VOLUME) {
				this.vol = MAX_VOLUME;
		}
	}

	@Override
	public void search(String t) {
		System.out.println("TV로 " + t + "를 검색하는 중");
	}

}
