package java0809_2;

public class InnerTest2 {
	public static void main(String[] args){
		//외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성
		OutClass2.InStaticClass sInClass = new OutClass2.InStaticClass(); 
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
		OutClass2.InStaticClass.sTest(); 
		}
}
