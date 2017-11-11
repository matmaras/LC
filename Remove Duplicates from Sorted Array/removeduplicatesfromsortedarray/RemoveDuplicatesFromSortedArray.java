package removeduplicatesfromsortedarray;

public class RemoveDuplicatesFromSortedArray {

	public static void main (String[] args) {
		
		int[] nums = new int[] {1,1,2};
		System.out.println(removeDuplicates1(nums));
	}

	public static int removeDuplicates(int[] nums) {
		int pos = 1;
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] > nums[i-1]) {
				nums[pos++] = nums[i];
			}
	    }
		
		return pos;
	}
	
	public static int removeDuplicates1(int[] nums) {
		int pos = 0;
		for(int i = 1; i < nums.length; i++) {
			if(nums[pos] != nums[i]) {
				pos++;
				nums[pos] = nums[i];
			}
	    }
		
		return pos+1;
	}
}
