import java.util.Scanner;

public class CountInNumber {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String n = in.next();
		int seq = 0;
		int count = 0;
		int charNum = 0;

		while (seq < n.length()) {
			if (n.charAt(charNum) == '6')
				count++;
			seq++;
			charNum++;
		}

		System.out.println(count);
	}
}
