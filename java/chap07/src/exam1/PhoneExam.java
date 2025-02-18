package exam1;

public class PhoneExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p = new Phone("01051998522");
		p.calling("01099999999");
		p.callback("01099999999");
		
		Picherphone s = new Picherphone("01051998522");
		s.sendmessege("01099999999", "애교");
		
		SmartPhone t = new SmartPhone("김새론");
		t.searchinternet("김새론");
		
		
	}

}
