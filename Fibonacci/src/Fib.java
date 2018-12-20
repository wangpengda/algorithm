import java.text.SimpleDateFormat;
import java.util.Date;

public class Fib {

	public static void main(String[] args) throws InterruptedException {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss.SSS");

		 Date start = new Date();
		 System.out.println(sdf.format(start));
		 System.out.println(Fib1(48));
		 System.out.println(sdf.format(new Date()));
		
		 Thread.sleep(2000);
		 System.out.println();

		System.out.println(sdf.format(new Date()));
		System.out.println(Fib2(48));
		System.out.println(sdf.format(new Date()));

		Thread.sleep(2000);
		System.out.println();

		System.out.println(sdf.format(new Date()));
		System.out.println(Fib3(48));
		System.out.println(sdf.format(new Date()));
	}

	public static int Fib1(int n) {
		if (n == 1 || n == 2)
			return 1;
		else
			return Fib1(n - 1) + Fib1(n - 2);
	}

	public static int Fib2(int n) {
		if (n == 1 || n == 2)
			return 1;
		else {
			int numsecond = 1;
			int numfirst = 1;
			int temp = 1;
			for (int i = 3; i <= n; i++) {
				temp = numsecond + numfirst;
				numfirst = numsecond;
				numsecond = temp;
			}
			return numsecond;
		}
	}

	public static int Fib3(int n) {
		if (n == 1 || n == 2)
			return 1;
		else {
			int[][] a = new int[2][2];
			a[0][0] = 1;
			a[0][1] = 1;
			a[1][0] = 1;
			a[1][1] = 0;

			int[][] temp = matricPow(a, n - 2);

			return temp[0][0] + temp[0][1];
		}
	}

	public static int[][] matricMulity(int[][] a, int[][] b) {
		int[][] result = new int[2][2];
		result[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0];
		result[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1];
		result[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0];
		result[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1];
		return result;
	}

	public static int[][] matricPow(int[][] a, int n) {
		if (n == 0)
			return new int[][] { { 1, 1 }, { 1, 0 } };
		if (n == 1) {
			return a;
		}
		if (n % 2 == 0)
			return matricPow(matricMulity(a, a), n / 2);
		else {
			return matricMulity(matricPow(matricMulity(a, a), (n - 1) / 2), a);
		}
	}
}
