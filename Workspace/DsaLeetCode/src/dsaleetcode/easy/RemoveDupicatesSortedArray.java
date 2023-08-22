package dsaleetcode.easy;

/*
 * Requirements: Calculate number of unique element
 * and move all unique level respectively first
 * Example: {0,0,1,1,1,2,3,4} -> k = 5 
 * -> Expected Array:  {0,1,2,3,4,_,_,_}
 */

public class RemoveDupicatesSortedArray {
	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int pos = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] < nums[i + 1]) {
				nums[pos++] = nums[i + 1];
			}
		}
		return pos;
	}

}
