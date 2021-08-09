package java0809_2;

public class OutClass {
	private int num = 10; //외부클래스 private 변수
	private static int sNum = 20; //외부클래스 정적변수
	InClass inClass; //내부클래스 자료형 변수 먼저 선언
	public OutClass(){
		inClass = new InClass(); //외부클래스 생성자. 
	}
	
	class InClass{ //인스턴스 내부 클래스
		int inNum = 100; //내부클래스의 인스턴스 변수
//		static int sInNum = 200; //인스턴스내부클래스에 정적변수 선언 불가
		void inTest(){
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
		}
	}
}

