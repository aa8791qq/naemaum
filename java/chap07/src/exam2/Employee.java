package exam2;

public class Employee {

	int recivesal;
	String study;
//	String customer;
	
	Employee(int recivesal, String study){
		this.recivesal = recivesal;
		this.study = study;
	}
	
	void recivesal(int recivesal) {
		System.out.println(this.recivesal + "원을 받았습니다.");
	}
	
	void st(String study) {
		System.out.println("공부하고 있습니다.");
	}
	
//	void cs(String customer) {
	void cs () {
		System.out.println("직원이 손님을 받고 있습니다.");
	}
}
