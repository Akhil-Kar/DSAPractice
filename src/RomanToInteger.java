class RomanToInteger {

	static int convertNumber(String s) {

		int out = 0;

		s.trim();
		String[] splitStr = s.split("");
		for(String part : splitStr) {
			switch (part) {
				case "I" -> out += 1;
				case "V" -> out += 5;
                                case "X" -> out += 10;
                                case "L" -> out += 50;
                                case "C" -> out += 100;
                                case "D" -> out += 500;
                                case "M" -> out += 1000;
				default -> out = -1;
			}
		}
		return out;
	}

	public static void main(String args[]) {
		// System.out.println("Hello World");
		System.out.println(convertNumber("MCMXCIV"));
	}

}
