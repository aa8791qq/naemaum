package sec01.exam01;

public interface RemoteControl {

	/* [public static final] 생략가능 */
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	/* [public abstract] 생략가능 */
	void turnOn();
	void turnOff();
	void setVolume(int vol);
	
	// 이해못함(default 부분)
	default void mic(String text) {
		// 추상메소드를 못쓰기 때문에 실행블럭을 못쓰는 방식을
		// 해결하기 위해 defalut를 붙임
	}
	
	
}
