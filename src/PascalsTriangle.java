import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
/**	Given numRows, generate the first numRows of Pascal's triangle.

	For example, given numRows = 5,
	Return

	[
	     [1],
	    [1,1],
	   [1,2,1],
	  [1,3,3,1],
	 [1,4,6,4,1]
	 1,5,10,10,5,1
	1,6,15,20,15,6,1
   1,7,21,35,35,21,7,1
	 
	]
	**/
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows <=0){
            return triangle;
        }
        for (int i=0; i<numRows; i++){
            List<Integer> row =  new ArrayList<Integer>();
            for (int j=0; j<i+1; j++){
                if (j==0 || j==i){
                    row.add(1);
                } else {
                    row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
	
	
	
	
/** 
119. Pascal's Triangle II
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].
**/

	
	public List<Integer> getRowII(int rowIndex){
		List<Integer> temp = new ArrayList<Integer>();
		temp.add(1);
		
		if(rowIndex <= 0) {
			return(temp);
		}
		for(int i = 0; i < rowIndex + 1; i++) {
			List<Integer> res = new ArrayList<Integer>();
			for(int j = 0; j < i+1; j++) {
				if(j == 0 || j ==i) {
					res.add(1);
				}else {
					res.add(temp.get(j-1)+temp.get(j));
				}
				
			}
			temp = res;
			
		}
        return temp;
	}
	

	
	
	
	
}
