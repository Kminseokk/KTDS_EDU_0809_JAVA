package java0809_2;

public class InnerTest {
	public static void main(String[] args){
		OutClass outClass = new OutClass(); //외부클래스 인스턴스 생성
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.inClass.inTest();
		}
}
