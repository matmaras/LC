package reverseinteger;

public class ReverseInteger {

	public static void main (String[] args) {
		
		System.out.println(reverse(-123));
	}
	
    public static int reverse(int x) {
    	long result = 0;
    	
    	while(x != 0) {
    		result = result * 10 + x % 10;
    		x /= 10;
    	}
    	
    	return (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0 : (int)result;
    }
}
