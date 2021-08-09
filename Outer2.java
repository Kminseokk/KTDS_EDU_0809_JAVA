package java0809_2;

public class Outer2 {
	Runnable getRunnable(int i){
		int num = 100;
		return new Runnable() { //익명 내부 클래스. Runnable 인터페이스 생성
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
				}
			};
		}
		Runnable runner = new Runnable() { //익명 내부 클래스를 변수에 대입
		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명 클래스 변수");
		}
	};
}
