package exam3;

import java.util.ArrayList;

public class Portal {

	ArrayList list  = new ArrayList();
	String name, id, pw;
	
	boolean join(String name, String id, String pw) {
		Member member = new Member();
		member.name = name;
		member.id = id;
		member.pw = pw;
		
		for(int i=0; i<this.list.size(); i++) {
			Member m = (Member)list.get(i);
			if(m.id == null || m.id.equals(id)) {
				return false;
			}
		}
		
		list.add(member);
		return true;
	}
	
	String findId(String name) {
		for(int i=0; i<this.list.size(); i++) {
			Member m = (Member)list.get(i);
			if(m.name.equals(name)) {
				return m.id;
			}
		}
		
		return null;
	}
	
	String findPw(String name, String id) {
		for(int i=0; i<this.list.size(); i++) {
			Member m = (Member)list.get(i);
			if(m.name.equals(name)&& m.id.equals(id)) {
				result = m.pw;
				break;
			}
		}
		
		return null;
	}
	
	//놓침
	String loginCheck(String id, String pw) {
		for(int i=0; i<this.list.size(); i++) {
			Member m = (Member)list.get(i);
			if(m.name.equals(name)&& m.id.equals(id)) {
				result = m.pw;
				break;
			}
		}
		
		return null;
}
