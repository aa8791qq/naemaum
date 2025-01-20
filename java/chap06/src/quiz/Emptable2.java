package quiz;

import java.util.ArrayList;

public class Emptable2 {

	ArrayList /* <Emp> */ list = new ArrayList();
	
	void insert(Emp emp) {
		this.list.add(emp);
	}
	
	void select() {
		for(int i = 0; i < list.size(); i++) {
			Emp e = (Emp)list.get(i);
			System.out.println(e.empno);
			System.out.println(e.ename);
			System.out.println(e.sal);
			System.out.println(e.mgr);
		}
	}
}
