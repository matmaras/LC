package hammingdistance;

public class HammingDistance {

	public static void main (String[] args) {
		
		System.out.println(hammingDistance(1, 4));
	}
	
    public static int hammingDistance(int x, int y) {
    	int result = 0;
    	
        while(x > 0 || y > 0) {
        	if(x%2 != y%2) result++;
        	if(x != 0 ) x /= 2;
        	if(y != 0 ) y /= 2;
        }
    	
    	return result;
    }
    
    public static int hammingDistance1(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
