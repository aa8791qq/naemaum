package sec01.exam01; // 복습필수

public class ExtendsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		c.printName();
		String cName = c.getName();
		System.out.println("-------------------------");
		System.out.println("cName : " + cName);
		System.out.println("c.name : " + c.name);
		
		System.out.println("----------------------------");
		
		String pName = c.parentName();
		System.out.println(pName);
		
		System.out.println("----------------------------");
		Child c2 = new Child("새로운 이름");
		String pName2 = c2.parentName();
		System.out.println(pName2); // "새로운 이름"
	}
	
}
