package sec01.exam02;

public class VarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int hour = 3; // 변수를 hour으로 선언하고 선언한 값을 3으로 저장한다.
			int minute = 5; //변수를 minute으로 선언하고 선언한 값을 5으로 저장한다.
			System.out.println(hour + "시간 " + minute + "분"); // hour 값과 minute 값을 불러온 뒤 텍스트를 합친다.
			
			int totalMinute = (hour*60) + minute;
			// 변수를 totalMinute라고 선언하고 hour 값, hour 값의 60을 곱한 값, minute 값을 불러온 뒤 연산을 시행한다.
			System.out.println("총 "  + totalMinute +"분"); // totalMinute 값을 불러온 뒤 텍스트를 합친다.
			
			int totalSecond = (totalMinute * 60);
			System.out.println("총 " + totalSecond +"초");
			
			int x = 10;
			int y = 20;
			System.out.println("x의 값은 : "+ x);
			System.out.println("x+y의 값은 : "+ (x+y)); // 변수지정을 하지 않았으므로 사라짐
			// 'syso' + ctrl + space : 단축함수(System.out.println)
			
			x = y; // X와 Y값 지정??
			System.out.println("x의 값은 : "+ x);
			
//			System.out.println(j); // j값이 범위밖에 있었으므로 에러나옴
			int j = 1;
			System.out.println("j : "+ j);
			
			{
				System.out.println("j : "+ j);
			}
			
			{
				int i = 0;
				System.out.println("i : "+ i);
			} // i변수 활용 가능구역
//			System.out.println("i : "+ i); // i값이 범위밖에 있었으므로 에러나옴(i는 사라진 상태)
			int i = 100; //이때는 다시 선언가능함(범위밖이므로)
	} // j변수 활용 가능구역

}
