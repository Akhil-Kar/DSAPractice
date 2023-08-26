import java.util.Scanner;

public class fibonaci{
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int nth = in.nextInt();
		int a = 0;
		int b = 1;
		int count = 2;
		System.out.print(a+", ");
		System.out.print(b+", ");
		
		while (count <= nth) {
			int temp =  b;
			b = a + b;
			a = temp;
			System.out.print(b);
			count++;
			if(count <=  nth)
				System.out.print(", ");
		}
		
	}
}
