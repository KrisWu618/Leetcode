import java.util.HashMap;
import java.util.Map;

public class twoSum_1 {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		int[] result = new int[2];
		
		for(int i = 0 ; i < nums.length; i ++) {
			if(!map.containsKey(nums[i])) {
				map.put(target - nums[i], i);
			
			}else {
				result[0] = map.get(nums[i]);
				result[1] = i;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {4,2 ,3};
		int target = 6;
		twoSum_1 sums = new twoSum_1();
		int[] result = sums.twoSum(nums,target);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		

	}

}
