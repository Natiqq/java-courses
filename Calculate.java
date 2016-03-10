
public class Calculate {

	public static void main(String[] args) {
		System.out.println("Calculate...");
		double first = Double.valueOf(args[0]);
		double second = Double.valueOf(args[1]);
		double summ = first + second;
		double differ = first - second;
		double multipl = first * second;
		double division = first / second;
		System.out.println("Summ: "+ summ);
		System.out.println("Difference: "+ differ);
		System.out.println("Multiplication: "+ multipl);
		System.out.println("Division: "+ division);
	}
}
