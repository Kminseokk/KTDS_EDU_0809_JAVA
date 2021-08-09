package java0809_2;

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(10); //메소드 호출
		runner.run(); 
		out.runner.run();
		}
}
