package practice.easy;

public class MinimumLengthFitTarget {
	public static int minOfSubFitSum(int[] arr, int target) {
		int minLength = arr.length;
		int left = 0;
		int right = 0;
		int tempRes = 0;
			while(right < arr.length) {
				tempRes+=arr[right];
				while (tempRes >= target ) {
					minLength = Math.min(minLength, right-left+1);
					tempRes-=arr[left];
					left++;
				}
				right++;
			}
		
		return minLength;
	}
	public static void main(String[] args) {
		System.out.println(minOfSubFitSum(new int[] {1,4,5,7,8,6,4}, 15));
	}
}
