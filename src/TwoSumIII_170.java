import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSumIII_170 {
    private HashMap<Integer, Integer> map;
    
    // initialize data structure
    public TwoSumIII_170(){
       map = new HashMap<>();
    }

    // Time: O(1)
    public void add(int number) {
        if(!map.containsKey(number)){
            map.put(number, 1);
        }else{
            map.put(number,map.get(number) + 1);
        }
       
    }

    // time: O(n)
    public boolean find(int value) {
    	// traversal HashMap
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int i = entry.getKey();
            int j = value - i;
            
            /*
             * case 1: 10 = 5+5, <5,2>, 5 appear twice: i == j
             * case 2: 10 = 4+6
             */
            if((i == j && entry.getValue() > 1) || (i != j && map.containsKey(j))){
                return true;
            }
        }
        return false;
    
    }

    /*------------------------Method 2-------------------------------*/
    private List<Integer> list;
    //private HashMap<Integer, Integer> map;
    public void TwoSum() {
    		map = new HashMap<>();
    		list = new ArrayList<>();
    }        
    
    // Time: O(1)
    public void add2(int number) {
    		if(! map.containsKey(number)) {
    			map.put(number, 1);
    			list.add(number); // array is only used to store numbers; used as HashSet
    		}else {
    			map.put(number, map.get(number) + 1);
    		}
    }
    
    // Time: O(n)
    public boolean find2(int value) {
    	// traversal array only instead of HashMap
    		for(Integer num1 : list) {
    			int num2 = value - num1; 
    			if((num1 == num2 && map.get(num1) > 1) || (num1 != num2 && map.containsKey(num2))) {
    				return true;
    			}
    		}
    		return false;
    }
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSumIII_170 obj = new TwoSumIII_170();
		obj.add(3);
		obj.add(3);
		obj.add(4);
		boolean param_1 = obj.find(6);
		System.out.println(param_1);
		
		System.out.println("---------------");
		TwoSumIII_170 obj2 = new TwoSumIII_170();
		obj2.TwoSum();
		obj2.add2(3);
		obj2.add2(5);
		obj2.add2(4);
		boolean param_2 = obj2.find2(6);
		System.out.println(param_2);

	}

}
