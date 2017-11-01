package validpalindrome2;

public class ValidPalindrome2 {

	public static void main (String[] args) {
		
		System.out.println(validPalindrome2("abbca"));
	}
	
	public static boolean validPalindrome2(String s) {
	    int left = -1, right = s.length();
	    while (++left < --right) 
	        if (s.charAt(left) != s.charAt(right)) {
	        	return isPalindromic(s, left, right+1) || isPalindromic(s, left-1, right);
	        }
	    return true;
	}

	public static boolean isPalindromic(String s, int left, int right) {
	    while (++left < --right) 
	        if (s.charAt(left) != s.charAt(right)) return false;
	    return true;
	}
	
	public static boolean validPalindrome(String s) {
		int lastChar = s.length()-1;
		
    	for(int i = 0; i < s.length()/2; i++) {
    		if(s.charAt(i) != s.charAt(lastChar-i)) {
    			return isPalindrome(s, i, i+1) || isPalindrome(s, i+1, i);
    		}
    	}
    	
    	return true;
    }
	
	public static boolean isPalindrome(String s, int left, int right) {
		int lastChar = s.length()-1;
		
    	for(int i = 0; i < (s.length()-(left+right))/2; i++) {
    		if(s.charAt(i+left) != s.charAt(lastChar-i-right)) {
    			return false;
    		}
    	}
    	return true;
	}
	
    public static boolean validPalindrome1(String s) {
    	
    	int lastChar = s.length()-1;
    	boolean rifhtSkipHelps = true;
		boolean leftSkipHelps = true;
    	
    	for(int i = 0; i < s.length()/2; i++) {
    		if(s.charAt(i) != s.charAt(lastChar-i)) {
    			//skip right
    			for(int skipRight = 0; skipRight < (s.length()-i*2)/2; skipRight++) {
    				if(s.charAt(i+skipRight) != s.charAt(lastChar-i-1-skipRight)) {
    					rifhtSkipHelps = false;
    				}
    			}
    			
    			if(rifhtSkipHelps) return true;
    			
    			//skip left
    			for(int skipLeft = 0; skipLeft < (s.length()-i*2)/2; skipLeft++) {
    				if(s.charAt(i+1+skipLeft) != s.charAt(lastChar-i-skipLeft)) {
    					leftSkipHelps = false;
    				}
    			}
    			
    			if(leftSkipHelps) return true;
    		}
    		
    		if(!rifhtSkipHelps && !leftSkipHelps) return false;
    	}
    	
    	return true;
    }
}
