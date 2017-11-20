package lengthlastword;

public class LengthLastWord {

	public static void main (String[] args) {
		String s = "H ";
		System.out.println(lengthOfLastWord(s));
	}
	
	public static int lengthOfLastWord(String s) {
    	int result = 0;
    	int lenght = s.length() - 1;
    	
    	while(lenght >= 0) {
    		if (s.charAt(lenght) == ' ' && result == 0){
    			lenght--;
    			continue;
    		}
    		else if (s.charAt(lenght) == ' ') {
    			return result;
    		}
    		result++;
    		lenght--;
    	}
    	
		return result;
    }
	
	public static int lengthOfLastWord1(String s) {
    	String[] strings = s.split(" ");
        if(strings.length == 0) return 0;
    	return strings[strings.length - 1].length();
    	
    }
	
    public static int lengthOfLastWord2(String s) {
		s = s.trim();
	    int lastIndex = s.lastIndexOf(' ') + 1;
	    return s.length() - lastIndex;        
    }
    
    public static int lengthOfLastWord3(String s) { 
        int len = 0;
        int tail = s.length() - 1;
        
        while (tail >= 0 && s.charAt(tail) == ' ') {
        	tail--;
        }
        
        while (tail >= 0 && s.charAt(tail) != ' ') {
            len++;
            tail--;
        }
        
        return len;
    }
}
