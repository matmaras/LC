package totalhammingdistance;

public class TotalHammingDistance {

	public static void main (String[] args) {
		
		int[] nums = new int[] {4, 14, 2};
		
		System.out.println(totalHammingDistance(nums));
	}
	
	public static int totalHammingDistance(int[] nums) {
	    int total = 0, n = nums.length;
	    
	    for (int j = 0; j < 32; j++) {
	        int bitCount = 0;
	        for (int i = 0; i < n; i++) {
	            bitCount += (nums[i] >> j) & 1;
	        }
	        total += bitCount * (n - bitCount);
	    }
	    return total;
	}
	
    public static int totalHammingDistance1(int[] nums) {
        int result = 0;
        
    	for(int i = 0; i < nums.length; i++) {
    		for(int j = i+1; j < nums.length; j++)
    		result += hammingDistance(nums[i], nums[j]);
    	}
    	
    	return result;
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
}
