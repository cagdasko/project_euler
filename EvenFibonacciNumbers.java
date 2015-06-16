import java.util.*;
import java.math.*;

public class EvenFibonacciNumbers {
	public static void main(String[] args) {
		int index = 0;
		BigDecimal num = new BigDecimal(0);
		BigDecimal sum = new BigDecimal(0);
		List<BigDecimal> fibonaccis = new ArrayList<BigDecimal>();

		fibonaccis.add(index, new BigDecimal(1));
		index++;
		fibonaccis.add(index, new BigDecimal(2));
		index++;

		while(true) {
			num = fibonaccis.get(index - 1).add(fibonaccis.get(index - 2));

			if (num.intValue() <= 4000000) {
				fibonaccis.add(index, num);
				index++;
			} else {
				break;
			}
		}

		for (int i = 4; i < fibonaccis.size(); i += 3)
			sum = sum.add(fibonaccis.get(i));

		sum = sum.add(fibonaccis.get(1));

		System.out.println(fibonaccis);
		System.out.println(sum);
	}
}