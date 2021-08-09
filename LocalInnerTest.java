package java0809_2;

public class LocalInnerTest {
	public static void main(String[] args) {
		Outer out = new Outer(); //클래스 생성
		Runnable runner = out.getRunnable(10); //메소드 호출
		runner.run();
		}
}
