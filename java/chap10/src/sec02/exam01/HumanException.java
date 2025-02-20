package sec02.exam01;

public class HumanException extends Exception {

	HumanException(){
		System.out.println("HumanException 생성");
	}
	
	HumanException(String message){
		super(message);// 생략(메세지를 전달받기 위해)
		System.out.println("HumanException String 생성");
	}
	
}
