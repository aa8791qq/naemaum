package sec02.exam01;

public class AnimalExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		Animal a1 = (Animal) cat;
		feed(a1);
		cat.age = 3;
		
		//최적화
		feed(new Cat());
		feed(new Dog());
		
		//최종
		Animal a2 = new Dog();
		feed(a2);
	}
	
	static void feed(Animal animal) {
		System.out.println("--feed실행할건데--");
		animal.eat();
		animal.sound();
	}

}
