package ch6;

public class DemoException {

	public static void main(String[] args) {
		int res = div(1,0);
	}
	static int div(int a ,int b) throws ArithmeticException {
		int res = a/b;
		return res;
	}

}
