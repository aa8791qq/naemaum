package sec02.exam01;

public class AnimalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Animal의 eat, sound만 알고 있음
		Animal a1 = new Animal();
		a1.eat();
		a1.sound();
		
		Cat cat = new Cat();
		cat.sound();
		cat.eat();
		cat.push(); // 알기때문에 실행됨(cat 속성)
		
		// 여기서는 cat을 모르는 상태(형변환 해야 아는 상태로 변환해줌) // cat 속성이 사라지는 것은 아님
		// 자식에서 부모만 빼오는 것.
		Animal a2 = (Animal) cat; // 자식이 부모가 될 때
		Animal a3 = cat; // 형변환(생략가능)
		
		a3.eat();
		a3.sound();
//		a3.push(); // 모르기때문에 실행안됨(animal 속성)
		
		Dog dog = new Dog();
		Animal a4 = new Dog();
		// 생략전
//		Dog dog = new Dog();
//		Animal a5 = (Animal)dog;
		a4.eat();
		a4.sound();
		
		catMom(cat); // static으로 안쓰면 안됨. //?
	}
	
	// 놓침
	static void catMom(Cat cat) {
		cat.eat();
		cat.sound();
		cat.push();
	}

	void feed(Animal animal) {
		animal.eat();
		animal.sound();
	}
}
