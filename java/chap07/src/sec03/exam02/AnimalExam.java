package sec03.exam02;

public class AnimalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		new Animal(); // 추상클래스이므로 할 수 없다.
		Dog dog = new Dog();
		dog.sound(); // 가능
		
		Animal a = dog; // 부모형태로 형변환이 가능하다.
		a.sound();
		dog = (Dog)a; // 형변환 생략 불가능
		
//		testSound(dog);
//		
////		animal로 하면은 animal에 있는 속성밖에 못씀
//		static void testSound(Animal animal) {
//			animal.sound();
//		}
	}

}
