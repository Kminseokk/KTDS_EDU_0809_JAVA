package java0809;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	public MemberHashSet(){
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member){
		hashSet.add(member);
	}
		
	
	public void showAllMember(){
	for(Member member : hashSet){
		System.out.println(member);
	}
	System.out.println();
	}
	
	public boolean removeMember(int memberId){
		Iterator<Member> ir = hashSet.iterator();
		while( ir.hasNext()){
			Member member = ir.next();
			int tempId = member.getMemberId();
			if( tempId == memberId){
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
}