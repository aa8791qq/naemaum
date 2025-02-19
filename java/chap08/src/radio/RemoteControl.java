package radio;

public interface RemoteControl {

	void play();
	void stop();
	void setVolume(int vol);
	default void mode(String m) {
		System.out.println(m + "모드로 바꿉니다.");
	};
	
}
