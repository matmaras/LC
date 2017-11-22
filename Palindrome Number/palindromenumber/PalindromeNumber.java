package palindromenumber;

public class PalindromeNumber {

	public static void main (String[] args) {
		System.out.println(isPalindrome(-2147447412));
	}
	
	public static boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) return false;
        
        int revertedX = 0;
        
		while(x > revertedX) {
			revertedX = revertedX * 10 + x % 10;
			x /= 10;
		}
		
		return (revertedX == x || revertedX/10 == x) ? true : false;
    }
}
