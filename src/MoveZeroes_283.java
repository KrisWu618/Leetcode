
public class MoveZeroes_283 {
	public void moveZeroes(int[] nums) {
		if(nums == null || nums.length == 0) return;
        int insertIndex = 0;
        for(int num : nums) {
        		if(num != 0) nums[insertIndex++] = num; //only it contains value, the index will increase
        }
        while(insertIndex < nums.length) {
        		nums[insertIndex++] = 0;
        }
    }

}
