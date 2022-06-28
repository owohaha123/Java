package exception;
//exception_ExceptionDemo1 °ú ºñ±³

class B{
	private int[] arr = new int[3];
	B() {
		arr[0]=0;
		arr[1]=10;
		arr[2]=20;
	}
	public void z(int first, int second) {
		try {
			System.out.println(arr[first]/arr[second]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch(Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("finally");
		}
	}
}

public class ExceptionDemo1_1 {
	public static void main(String[] args) {
		B b = new B();
		b.z(10,0);
		b.z(1,0); 
		b.z(2,1); 
	}
}