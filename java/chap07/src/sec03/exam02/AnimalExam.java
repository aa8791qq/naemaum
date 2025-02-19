package sec03.exam02;

public class AnimalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		////// 놓침 //////
		
//		new Animal(); // 추상클래스이므로 할 수 없다.
		Dog dog = new Dog();
		dog.sound(); // 가능
		
		Animal a = dog; // 부모형태로 형변환이 가능하다.
		a.sound();
		dog = (Dog)a; // 형변환 생략 불가능
		
		testSound(dog);
		
//		animal로 하면은 animal에 있는 속성밖에 못씀
		
		Dog dog3 = new Dog();
		dog3.name = "다솜";
		
		Dog dog4 = dog3;
		dog4.name = "윤희";
		setName(dog3);
		System.out.println(dog3.name);
		
		}
	
	// 메서드는 메인 밖에 선언해야 함.
	// 전달인자로는 스택영역의 값만 복사되어 전달된다.
	// 얕은 복사(전달인자로 참조타입이 가는 경우 무조건 얕은 복사로 간다.)
	static void setName(Dog dog) {
		dog.name = "서영";
	}
	
	// 깊은 복사
	static void testName(Dog dog) {
		Dog dog2 = new Dog();
		dog2.name = dog.name;
		
		dog2.name = "서영";
	}
	static void testSound(Animal animal) {
		animal.sound();
	}

}
