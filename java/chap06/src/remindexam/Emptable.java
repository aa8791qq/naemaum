package remindexam;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Emptable {

	// 변수공간생성하기 (중복코딩 하지말고 저장공간만 생성할것)
	String com;
//	int empno;
//	int sal;
//	int mgr;

	// emp 관리
	ArrayList empmanger = new ArrayList();
	Emp[] arrEmpmanger = new Emp[3];
	
	// 추가(리스트만 출력)
	Emptable(String emp) { // 생성자.. (중복오류)
		System.out.println(emp);
		this.com = emp; // 여기서 막힘
	}
//	
//	Emptable(String ename) {
//		System.out.println(ename);
//		this.ename = ename;
//	}
//	
//	Emptable(int sal) {
//		System.out.println(sal);
//		this.sal = sal;
//	}
//	
//	Emptable(int mgr) {
//		System.out.println(mgr);
//		this.mgr = mgr;
//	}
	
	// 출력(모든사원의 모든 정보를 출력)
	void add(Emp mg) {
		this.empmanger.add(mg); //막혔어..(배열에는 .add가 없음)
	}
	
	// 변수 호출 및 메소드 호출 실수 (for문이 없어서 오류)
	void print() {
		System.out.println("-----------------");
		for(int i = 0; i < empmanger.size(); i++) {
			Emp mg = (Emp) empmanger.get(i);
			System.out.println(mg.empno); 
			System.out.println(mg.ename); 
			System.out.println(mg.sal); 
			System.out.println(mg.mgr); 
		}
	}
	
	Emp[] getArray() {
		return arrEmpmanger;
	}
}
