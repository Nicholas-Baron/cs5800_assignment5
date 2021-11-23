package prime;

public final class Prime {

	public boolean isPrime(int number) {

		if (number % 2 == 0)
			return number == 2; // 2 is the only even prime

		for (int i = 3; i <= number / 3; i += 2)
			if (number % i == 0)
				return false;

		return true;
	}

}
