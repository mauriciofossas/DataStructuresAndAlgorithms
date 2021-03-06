package dataStructures;

public class reverseInteger {
	//Given a 32-bit signed integer, reverse digits of an integer, where first digit is non-zero.
	
	public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)res;
        }
    }
}
