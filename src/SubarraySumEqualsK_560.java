import java.util.HashMap;

public class SubarraySumEqualsK_560 {
	
/**
Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Example 1:
Input:nums = [1,1,1], k = 2
Output: 2
**/
	// Time complexity O(n^2), Space complexity O(n)
	public int subarraySum(int[] nums, int k) {
		int count = 0;
		int[] sums = new int[nums.length + 1];
		sums[0] = 0;
	
		for(int i = 0; i < nums.length; i++) {
			sums[i+1] = sums[i]+nums[i];
		}
				
		for(int i = sums.length - 1; i > 0; i--) {
			for(int j = i - 1;j >= 0; j--) {
				
					if(sums[i] - sums[j] == k) {
						count++;
					}
					
				}	
			
		}
		return count;
	}
	
	// Time complexity O(n^2), Space complexity O(1)
	public int subarraySum2(int[] nums, int k) {
		int count = 0;
		for(int start = 0; start < nums.length; start++) {
			int sums = 0;
			for(int end = start; end < nums.length; end++) {
				sums += nums[end];
				if(sums == k) 
					count++;
				
			}
		}
		return count;
	}
	
	
	// Time complexity O(n^2), Space complexity O(n)
	public int subarraySum3(int[] nums, int k) {
		int count = 0, sums = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0,1);
		for(int i = 0; i < nums.length; i++) {
			sums += nums[i];
			if(map.containsKey(sums - k)) {
				 count += map.get(sums - k);
			}
			map.put(sums, map.getOrDefault(sums, 0)+1);
			//getOrDefault(Object key,V defaultValue): return a default value whenever the value was not found using the key specified on the HashMap. 
		}
		return count;
	}


}
