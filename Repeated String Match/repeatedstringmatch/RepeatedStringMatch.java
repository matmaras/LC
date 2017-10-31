package repeatedstringmatch;

public class RepeatedStringMatch {

	public static void main (String[] args) {
		
		System.out.println(repeatedStringMatch2("abcd", "cdabcdab"));
	}
	
    public static int repeatedStringMatch(String A, String B) {
        
    	int repeated = 0;
    	StringBuilder copyOfA = new StringBuilder();
    	
    	while(copyOfA.length() < B.length()) {
    		copyOfA.append(A);
    		repeated++;
    	}
    	
    	if(copyOfA.toString().contains(B)) {
    		return repeated;
    	}
    	
    	if(copyOfA.append(A).toString().contains(B)) {
    		return ++repeated;
    	}
    		
		return -1;
    }
    
    public static int repeatedStringMatch1(String A, String B) {
        String copyOfA = A;
        for (int rep = 1; rep <= B.length() / A.length() + 2; rep++, copyOfA += A)
            if (copyOfA.indexOf(B) != -1) return rep;
        return -1;
    }
    
    public static int repeatedStringMatch2(String A, String B) {
        StringBuilder copyOfA = new StringBuilder(A);
        for (int rep = 1; rep <= B.length() / A.length() + 2; rep++, copyOfA.append(A))
            if (copyOfA.indexOf(B) != -1) return rep;
        return -1;
    }
}
