
public class ImageSmoother_661 {

	public int[][] imageSmoother(int[][] nums) {
		// TODO Auto-generated method stub
	
		int[][] res = new int[nums.length][nums[0].length];
		// for four corner
		int sums = 0;
		int count = 0;
		for(int i = 0; i < nums.length; i ++) {
			for(int j = 0; j < nums[0].length; j++) {
				sums = nums[i][j];
				count = 1;
				
				if(i - 1 >= 0) {
					sums = sums + nums[i - 1][j];
					count++;
					if(j - 1 >= 0) {
						sums = sums + nums[i - 1][j - 1];
						count++;
					}
					if(j + 1 < nums[0].length) {
						sums = sums + nums[i - 1][j + 1];
						count++;
					}
				}
				if(i + 1 < nums.length) {
					sums = sums + nums[i + 1][j];
					count++;
					if(j - 1 >= 0) {
						sums = sums + nums[i + 1][j - 1];
						count++;
					}
					if(j + 1 < nums[0].length) {
						sums = sums + nums[i + 1][j + 1];
						count++;
					}
				}
				
				if(j - 1 >= 0) {
					sums = sums + nums[i][j - 1];
					count++;
				}
				
				if(j + 1 < nums[0].length) {
					sums = sums + nums[i][j + 1];
					count++;
				}
				
				res[i][j] = (int)Math.floor(sums/count);
				
				}
				
			}
		 return res;

	}

}
