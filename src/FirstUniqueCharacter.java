import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
	//public void firstUniqChar(String s) {
		
		
	//}
	public static int gcd(int p, int q) {
		if(q == 0) return p;
		int r = p%q;
		return gcd(q,r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcode";
		FirstUniqueCharacter f = new FirstUniqueCharacter();
		//System.out.println(f.firstUniqChar(s));
		
		//f.firstUniqChar(s);
		int a = 9;
		int b = 3;
		
        System.out.println(f.gcd(b, a));
        System.out.println(4%10);
        System.out.println(13%3);
        
	}

}
