package findthedifference;

public class FindTheDifference {

	public static void main (String[] args) {
		String s = "abcd";
		String t = "abcde";
		System.out.println(findTheDifference(s, t));
	}
	
    public static char findTheDifference(String s, String t) {
    	char[] tArray = t.toCharArray();
    	char[] sArray = s.toCharArray();
    	
    	int result = tArray[tArray.length - 1];
    	
    	for(int i = 0; i < sArray.length; i++) {
    		result += tArray[i] - sArray[i];
    	}
    	
		return (char)result;
    }
    
    public static char findTheDifference1(String s, String t) {
    	int result = t.charAt(t.length() - 1);
    	
    	for(int i = 0; i < s.length(); i++) {
    		result += t.charAt(i) - s.charAt(i);
    	}
    	
		return (char)result;
    }
}
