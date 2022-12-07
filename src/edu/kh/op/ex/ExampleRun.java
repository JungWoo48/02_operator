package edu.kh.op.ex;

//코드 실행용 클래스(메인 메소드 작성)
public class ExampleRun {

	public static void main(String[] args) {
		OpExample ex = new OpExample();
		// OpExample 이라는 설계도를 보고
		// OpExample 형태의 ex를 만들어냄.
		ex.ex1();
		// ex1은 OpExample에서 지정한 void ex1에서 갖고 온것
		ex.ex2();
		// ex2는 void ex2 에서 지정한 값을 가져온다
		ex.ex3();
		ex.ex4();
		ex.ex5();
		ex.ex6();
		ex.ex7();
	}
}
