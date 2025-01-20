package remindexam;

public class EmpExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// emp를 만든다./ 넣기
		Emp e1 = new Emp();
		e1.empno = 7359;
		e1.ename = "smith";
		e1.sal = 800;
		e1.mgr = 7902;

		Emp e2 = new Emp();
		e2.empno = 7902;
		e2.ename = "ford";
		e2.sal = 3000;
		e2.mgr = 7566;

		Emptable2 et = new Emptable2();
		et.insert(e1);
		et.insert(e2);

		// empTable의 emp 정보의 출력
		et.select();
//		et.filter();
	}

}
