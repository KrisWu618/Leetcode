import java.util.LinkedList;
import java.util.Queue;

public class matrixReshape {
	//Time complexity : O(m*n)O(m∗n). We traverse over m∗n elements twice. 
	//Here, m and n refer to the number of rows and columns of the given matrix respectively.
	//Space complexity : O(m*n)O(m∗n). The queue formed will be of size m∗n.

	public int[][] matrixReshape1(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if(nums.length == 0 || r*c != nums.length*nums[0].length) return nums;
        Queue <Integer> queue = new LinkedList <> ();
        	for(int row = 0; row < nums.length; row++) {
        		for(int col = 0; col < nums[0].length; col++) {
        			queue.add(nums[row][col]);
        		}
        	}
        
        	for(int i = 0; i < r; i++) {
        		for(int j = 0; j < c; j++) {
        			res[i][j] = queue.remove();
        		}
        	}
        	 return res;
	
	
	}
	
	
	
	
	// Without using extra Space : use new matrix to save old value by sequence
	//Time complexity : O(m*n).
	//Space complexity : O(m*n). The resultant matrix of size m*n is used.
	public int[][] matrixReshape2(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if(nums.length == 0 || r*c != nums.length*nums[0].length) 
        	    return nums;
        int row = 0, col = 0;
        for(int i = 0; i < nums.length; i++) {
        		for(int j = 0; j< nums[0].length; j++) {
        			res[row][col] = nums[i][j];
        			col++;
        			if(col == c) {
        				row ++;
        				col = 0;
        			}
        		}
        	
        }
        return res;
       
	
	
	}

	
	
	//Do you know how a 2-D array is stored in the main memory(which is 1-D in nature)? It is internally represented as a 1-D array only. The element nums[i][j] of nums array is represented in the form of a one dimensional array by using the index in the form: nums[n*i + j], where n is the number of columns in the given matrix. Looking at the same in the reverse order, while putting the elements in the elements in the resultant matrix, we can make use of a count variable which gets incremented for every element traversed as if we are putting the elements in a 1-D resultant array. But, to convert the count back into 2-D matrix indices with a column count of c, we can obtain the indices as res[count/c][count\%c]where count/c is the row number and count%c is the column number. Thus, we can save the extra checking required at each step.
	//Time complexity : O(m*n)O(m∗n). We traverse the entire matrix of size m*nm∗n once only. Here, mm and nn refers to the number of rows and columns in the given matrix.
	//Space complexity : O(m*n)O(m∗n). The resultant matrix of size m*nm∗n is used.
	public int[][] matrixReshape3(int[][] nums, int r, int c) {
		if(nums.length == 0 || r*c != nums.length*nums[0].length) 
			return nums;
		int[][] res = new int[r][c];
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[0].length; j++) {
				res[count/c][count %c] =  nums[i][j];
				count++;
						
			}
		}
		return res;
		
		
	}
}
