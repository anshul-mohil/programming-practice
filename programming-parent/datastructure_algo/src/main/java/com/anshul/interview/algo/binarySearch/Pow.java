package com.anshul.interview.algo.binarySearch;

public class Pow {

	public int pow(int x, int n, int d) {
		     long N = n%d;
		          x = x%d;
	        if (N < 0) {
	            x = 1 / x;
	            N = -N;	            
		}
			return fastPow(x,n,d);
	}
		private int fastPow(int x, int n,int d) {
	        if (n == 0) {
	            return 1;
	        }
	        long half = fastPow(x, n / 2, d)%d;
	        if (n % 2 == 0) {
	            return (int) ((half * half)%d);
	        } else {
	            return (int) (((half * half)%d * x)%d);
	        }
		}
	public static void main(String[] args) {
		Pow pow = new Pow();
		System.out.println(pow.fastPow(0, 0, 1));
	}
	    
}
