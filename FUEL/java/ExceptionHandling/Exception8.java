package ExceptionHandling;

import java.lang.*;

public class Exception8 extends Exception {
	public void propagateException() throws InterruptedException {
		for (int i = 1; i <= 5; i++) {

			System.out.println(i);
			Thread.sleep(1000);

		}
	}

	public static void main(String[] args) throws InterruptedException {

		Exception8 a = new Exception8();
		a.propagateException();
	}

}
