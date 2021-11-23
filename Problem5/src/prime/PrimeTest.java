package prime;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeTest {

	private Prime p = new Prime();

	@Test
	void test2() {
		assertTrue(p.isPrime(2));
	}

	@Test
	void test3() {
		assertTrue(p.isPrime(3));
	}

	@Test
	void test4() {
		assertTrue(p.isPrime(4));
	}

	@Test
	void test5() {
		assertTrue(p.isPrime(5));
	}

	@Test
	void test6() {
		assertTrue(p.isPrime(6));
	}

}
