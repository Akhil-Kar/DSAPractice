public class functions {
	
	int sum(int a, int b) {
		int total = a + b;
		return total;
	}
	
	public static void main(String[] args) {
		int val;
		functions f = new functions();
		val = f.sum(10, 12);
		System.out.println(val);
	}
}
