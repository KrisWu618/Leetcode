
public class LongestContinuousIncreasingSubsequence {
	//Given an unsorted array of integers, find the length of longest continuous increasing subsequence.

	public static int findLengthOfLCIS(int[] nums) {
		if(nums == null | nums.length == 0) return 0;
		int count = 0,maxs = 0;
		for(int i =0; i < nums.length - 1; i++) {
			if(nums[i+1] > nums[i]) {
				count += 1;
				maxs = Math.max(count, maxs);
			}else {count = 0;}
		}
        return maxs+1;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int[] nums_1 = {1,3,5,6,7};
		int[] nums_2 = {1,3,5,6,7};
		System.out.println(findLengthOfLCIS(nums_1));
		System.out.println(findLengthOfLCIS(nums_2));
	}

}
