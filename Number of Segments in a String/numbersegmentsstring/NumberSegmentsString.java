package numbersegmentsstring;

public class NumberSegmentsString {

	public static void main (String[] args) {
		String s = "asdasd";
		System.out.println(countSegments1(s));
	}
	
	public static int countSegments(String s) {
        if(s.isEmpty()) return 0;
        String[] strings =  s.split("   ");
        int result = 0;
        
        for(String str : strings) {
        	if(!str.isEmpty()) {
        		result++;
        	}
        }
        
        return result;
    }
	
	public static int countSegments1(String s) {
        if(s.isEmpty()) return 0;
        
        char[] chars =  s.toCharArray();
        int result = 0;
        
        for(int i = 0; i < chars.length; i++) {
        	char first = chars[i];
        	char second = i + 1 < chars.length ? chars[i + 1] : ' ';
        	
        	if(first != ' ' && second == ' ') {
        		result++;
        	}
        }
        
        return result;
    }
}
