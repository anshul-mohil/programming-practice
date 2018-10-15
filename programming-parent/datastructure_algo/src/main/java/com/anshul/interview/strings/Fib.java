package com.anshul.interview.strings;

class Fib {

	static final int MOD = 1000000007;

	static int fib(int a, int b, int n) {
		long F[][] = new long[][] { { 1, 1 }, { 1, 0 } };
		if (n == 0)
			return a;
		if (n == 1)
			return b;
		power(F, n - 1);

		long ans = (((a % MOD) * (F[0][1] % MOD)) % MOD + (b % MOD) * (F[0][0] % MOD) % MOD) % MOD;

		return (int) ans;
	}

	/*
	 * Helper function that multiplies 2 matrices F and M of size 2*2, and puts
	 * the multiplication result back to F[][]
	 */
	static void multiply(long F[][], long M[][]) {
		long x = ((F[0][0] * M[0][0]) % MOD + (F[0][1] * M[1][0]) % MOD) % MOD;
		long y = ((F[0][0] * M[0][1]) % MOD + (F[0][1] * M[1][1]) % MOD) % MOD;
		long z = ((F[1][0] * M[0][0]) % MOD + (F[1][1] * M[1][0]) % MOD) % MOD;
		long w = ((F[1][0] * M[0][1]) % MOD + (F[1][1] * M[1][1]) % MOD) % MOD;

		F[0][0] = x;
		F[0][1] = y;
		F[1][0] = z;
		F[1][1] = w;
	}

	/*
	 * Helper function that calculates F[][] raise to the power n and puts the
	 * result in F[][] Note that this function is designed only for fib() and
	 * won't work as general power function
	 */
	static void power(long F[][], int n) {
		int i;
		long M[][] = new long[][] { { 1, 1 }, { 1, 0 } };

		// n - 1 times multiply the matrix to {{1,0},{0,1}}
		for (i = 2; i <= n; i++)
			multiply(F, M);
	}

	// Driver function
	public static void main(String args[]) {
		int a = 3, b = 4, n = 3;
		// int a=2147483647,b=2147483647,n = 1000000000;
		long startTime = System.currentTimeMillis();
		System.out.println(fib(a, b, n));
		long endTime = System.currentTimeMillis() - startTime;
		// System.out.println(endTime/1000);
	}

}
