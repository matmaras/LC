package twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main (String[] args) {
		int nums[] = {3,2,4};
		int target = 6;
		
		int[] result = new int[2];
		result = twoSum(nums, target);
		System.out.print(result[0]);
		System.out.print(result[1]);
		
		
	}
	
    public static int[] twoSum(int[] nums, int target) {
    	
		for(int pickFirst = 0; pickFirst < nums.length; pickFirst++) {
			for(int pickSecond = pickFirst + 1; pickSecond < nums.length; pickSecond++) {
				if(nums[pickFirst] + nums[pickSecond] == target) {
					return new int[]{pickFirst, pickSecond};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
    }
    
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
