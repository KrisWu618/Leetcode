import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;


public class FindAllDuplicatesinArray_442 {
/**
Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?

Example:
Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]

 */

	public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
		List<Integer> res = new ArrayList<Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(set.contains(nums[i])) {
				res.add(nums[i]);
			}else {
				set.add(nums[i]);
			}
		}
		return res;
    }

}
