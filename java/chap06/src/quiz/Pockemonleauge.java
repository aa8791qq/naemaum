package quiz;

import java.util.Random; // 랜덤프로세스 실행
import java.util.Scanner; // 스캐너 프로세스 실행

// 실제리그 진행

public class Pockemonleauge {
	void leagNm() {
		Scanner scanner = new Scanner(System.in); // 스캐너 실행
		String name; // 리그이름 저장공간 변수선언
		// 무한 루프(입력값이 유효할때까지)
		do {
			System.out.print("진행하실 리그이름을 입력하세요: ");
			name = scanner.nextLine(); // 스캐너로 입력받은 내용을 저장한다.
			// 만약에 이름이 없다면 다시 입력받게 하기
			if (name.isEmpty()) { // 빈값을 입력했는지 체크해준다.
				System.out.println("올바르지 않은 값입니다. 다시 입력해 주세요.");
			}
		} while (name.isEmpty()); // 빈값이 입력될경우 반복

		System.out.println("리그 이름은 : " + name + "입니다");

		scanner.close(); // 스캐너 닫기(누수방지), 재입력을 요구하기 전에 닫아줘야 한다.(반복문 끝나고 동작)
//		return; // void에서는 작업 후에는 자동으로 종료됨
	}

	void play() {
		int selplay = playlist(); // 호출할 변수 입력(다른 메소드 호출방법), 배열번호로 호출시킨다.(int)
		Pockemon selplay1 = new Pockemon(); // 객체 생성
		String[] names = selplay1.pockeNames(); // 이름배열 가져오기
		// 중복출력이 되서 위치를 조정함
		System.out.println("리그에 참가한 포켓몬은 " + names[0] + ", " + names[1] + ", " + names[2] + "입니다.");
		// 3개의 포켓몬이 공격한다. 배열에 저장되어 있는 값으로 참가포켓몬을 불러옴
		System.out.println(names[0] + " 이 공격하였습니다.");
		System.out.println(names[1] + " 이 공격하였습니다.");
		System.out.println(names[2] + " 이 공격하였습니다.");
		System.out.println("한번 더 쳐보시지~~~ 이제 내 차례군~"); // 무한루프문 만들자?(체력 값이 따로 주어지지 않았음)
//		여러 값이 올 경우에는 ,가 아니고 +로 입력해준다.
	}

	int playlist() { // play에다가 호출할려면 void가 아니고 int형으로 해야 배열에 있는 값을 호출할수있다.
		Pockemon play = new Pockemon(); // 객체 생성
		String[] names = play.pockeNames(); // 포켓몬정보를 저장하는 곳에 있는 값을 랜덤으로 불러옴

		Random random = new Random(); // 배열안에 있는 포켓몬을를 무작위로 리그에 참여시킨다.
		int[] selplay = new int[3];// 3개의 랜덤 인덱스 선정하기(배열형태로 선언했다.)
//		int rdPi1, rdPi2, rdPi3;// rdPi(n) 선언(배열로 할 경우에는 쓰지 못함)
		// 중복제거(do while 문 사용)
		do { // 배열에 저장(selplay[i], 이때에는 기존 배열값이 아닌 랜덤값으로 덮어씌워짐)
			selplay[0] = random.nextInt(names.length);// 포켓몬 정보 갓차!(배열크기만큼) 1번포켓몬
			selplay[1] = random.nextInt(names.length);// 포켓몬 정보 갓차!(배열크기만큼) 2번포켓몬
			selplay[2] = random.nextInt(names.length);// 포켓몬 정보 갓차!(배열크기만큼) 3번포켓몬
		} while (selplay[0] == selplay[1] || selplay[0] == selplay[2] || selplay[1] == selplay[2]); // 중복검사
		return 0;
	}
}
