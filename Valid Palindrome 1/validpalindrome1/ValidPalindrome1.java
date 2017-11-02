package validpalindrome1;

public class ValidPalindrome1 {

	public static void main (String[] args) {
		
		System.out.println(isPalindrome2("A man, a plan, a canal: Panama"));
	}
	
    public static boolean isPalindrome(String s) {
        
    	s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    	return new StringBuffer(s).reverse().toString().equals(s);
    	
    }
	
    public static boolean isPalindrome1(String s) {
        
    	s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    	
	    int left = -1, right = s.length();
	    while (++left < --right) 
	        if (s.charAt(left) != s.charAt(right)) {
	        	return false;
	        }
    	
    	return true;
    }
    
    public static boolean isPalindrome2(String s) {
        
	    int left = 0, right = s.length() - 1;
	    while (left < right) 
	    	if(!Character.isLetterOrDigit(s.charAt(left))) {
	    		left++;
	    	} else if(!Character.isLetterOrDigit(s.charAt(right))) {
	    		right--;
	    	} else if (!String.valueOf(s.charAt(left++)).toLowerCase().equals(String.valueOf(s.charAt(right--)).toLowerCase())) {
	        	return false;
	        }
    	
    	return true;
    }
}
