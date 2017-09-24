import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicate {
	public boolean containsDuplicate1(int[] nums) {
	    Arrays.sort(nums);
	    for (int i = 0; i < nums.length - 1; ++i) {
	        if (nums[i] == nums[i + 1]) return true;
	    }
	    return false;
	}
/*
 Time complexity : O(nlogn). Sorting is O(nlogn) and the sweeping is O(n). The entire algorithm is dominated by the sorting step, which is O(nlogn).

Space complexity : O(1). Space depends on the sorting implementation which, usually, costs O(1) auxiliary space if heapsort is used.

Note

The implementation here modifies the original array by sorting it. In general, it is not a good practice to modify the input unless it is clear to the caller that the input will be modified. One may make a copy of nums and operate on the copy instead.
 */
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>(nums.length);
		for(int i : nums) {
			if(set.contains(i)) return true;
			set.add(i);
		}
	    return false;    
	}
	/*
	Time complexity : O(n). We do search() and insert() for n times and each operation takes constant time.

	Space complexity : O(n). The space used by a hash table is linear with the number of elements in it.

	Note

	For certain test cases with not very large n, the runtime of this method can be slower than Approach #2. The reason is hash table has some overhead in maintaining its property. One should keep in mind that real world performance can be different from what the Big-O notation says. The Big-O notation only tells us that for sufficiently large input, one will be faster than the other. Therefore, when n is not sufficiently large, an O(n) algorithm can be slower than an O(nlogn) algorithm.
	*/
	
	
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
	    Set<Integer> set = new HashSet<Integer>();
	    for(int i = 0; i < nums.length; i++) {
	    		if(i>k) set.remove(nums[i - k - 1]);
	    		if(! set.add(nums[i])) return true;
	    }
	    return false;
	}
	public boolean containsNearbyDuplicate2(int[] nums, int k) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < nums.length; i++) {
	        if (map.containsKey(nums[i])) {
	            if (i - map.get(nums[i]) <= k) return true;
	        }
	        map.put(nums[i], i);
	    }
	    return false;
	}

}






