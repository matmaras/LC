package judgeroutecircle;

public class JudgeRouteCircle {

	public static void main (String[] args) {
		
		System.out.println(judgeCircle1("UD"));
	}
	
    public static boolean judgeCircle(String moves) {
    	if(moves.length() % 2 != 0) return false;
    	
    	int upDown = 0;
    	int leftRight = 0;
    	
    	for(int i = 0; i < moves.length(); i++) {
    		if(moves.charAt(i) == 'U') {
    			upDown++;
    		} else if (moves.charAt(i) == 'D') {
    			upDown--;
    		} else if (moves.charAt(i) == 'L') {
    			leftRight++;
    		} else if (moves.charAt(i) == 'R') {
    			leftRight--;
    		}
    	}
    	
    	return upDown == 0 && leftRight == 0;
    }
    
    public static boolean judgeCircle1(String moves) {
    	if(moves.length() % 2 != 0) return false;
    	
    	int upDown = 0;
    	int leftRight = 0;
    	
    	for(char ch : moves.toCharArray()) {
            switch (ch) {
	            case 'U' : upDown++; break;
	            case 'D' : upDown--; break;
	            case 'R' : leftRight++; break;
	            case 'L' : leftRight--; break;
            }
    	}
    	
    	return upDown == 0 && leftRight == 0;
    }
    
    public static boolean judgeCircle2(String moves) {
    	if(moves.length() % 2 != 0) return false;
    	
    	return moves.replaceAll("R", "").length() == moves.replaceAll("L", "").length() && 
    			moves.replaceAll("U", "").length() == moves.replaceAll("D", "").length();
    }
}
