package java0809;

public class Student {
	String memberId; //회원 아이디
	private String memberName; //회원 이름
	int memberIdint;
	
	public Student(String memberId, String memberName){ //생성자
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
	return memberIdint;
	}
	
	public void setMemberId(String memberId) {
	this.memberId = memberId;
	}
	
	public String getMemberName() {
	return memberName;
	}
	
	public void setMemberName(String memberName) {
	this.memberName = memberName;
	}
	
	public boolean equals(Object obj) {
		if( obj instanceof Student){
		Student member = (Student)obj;
		if( this.memberId == member.memberId ) {
			System.out.println(member.memberId+" 는 중복되어 있습니다. 반영되지 않습니다.");
			return true;	
		}

		else 
			return false;
		}
		return false;
	}

	public int hashCode() {
		int memberIdint = Integer.parseInt(memberId);
		return memberIdint;
	}

	
	@Override
	public String toString(){ //toString 메소드 오버라이딩
		return memberId + " : " + memberName;
	}
}
