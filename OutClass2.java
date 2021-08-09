package java0809_2;

public class OutClass2 {
	private int num = 10;
	private static int sNum = 20; 
	static class InStaticClass { //정적내부 클래스
		int inNum = 100; //정적내부클래스의 인스턴스변수
		static int sInNum = 200; //정적내부클래스의 정적변수
		void inTest(){ //정적내부클래스의 일반 메서드
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수s 사용)"); 
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
		}
		static void sTest(){ // 정적내부클래스의 static 메서드
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
		}
	}

}
