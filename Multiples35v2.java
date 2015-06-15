public class Multiples35v2 {
	public static void main(String[] args) {
		int sum = getSumOfMultipleOfN(999, 3) 
				+ getSumOfMultipleOfN(999, 5)
				- getSumOfMultipleOfN(999, 15);

		System.out.println("Sum = " + sum);
	}

	private static int getSumOfMultipleOfN(int target, int n) {
		int p = target / n;

		return (n * (p * (p + 1)) / 2);
	}
}