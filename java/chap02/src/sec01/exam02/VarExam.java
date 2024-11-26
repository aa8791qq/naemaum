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
	}

}
