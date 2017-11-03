package majorityelement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main (String[] args) {
		
		int[] nums = new int[] {1,1,1,1,2,3,4};
		System.out.println(majorityElement2(nums));
	}
	
    public static int majorityElement(int[] nums) {
    	Map<Integer, Integer> occ = new HashMap<>();
    	
    	if(nums.length == 1) return nums[0];
    	
    	for(int num : nums) {
    		if(occ.containsKey(num)) {
    			occ.put(num, occ.get(num)+1);
    			if(occ.get(num) > nums.length / 2) {
    				return num;
    			}
    		} else {
    			occ.put(num, 1);
    		}
    	}
    	
    	throw new IllegalArgumentException("No solution");
    }
    
    public static int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    
    public int majorityElement3(int[] nums) {
        int count = 0, ret = 0;
        for (int num: nums) {
            if (count == 0)
                ret = num;
            if (num != ret)
                count--;
            else
                count++;
        }
        return ret;
    }
}
