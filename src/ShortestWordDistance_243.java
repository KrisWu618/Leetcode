import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class ShortestWordDistance_243 {
	
	
	public int shortestDistance(String[] words, String word1, String word2) {
		int distance = words.length;
		int pos1 = -1;
		int pos2 = -1;
		for(int i = 0; i < words.length; i++) {
			if(words[i].equals(word1)) {
				pos1 = i;
			}
			if(words[i].equals(word2)) {
				pos2 = i;
			}
			
			if(pos1 != -1 && pos2 != -1) {
				distance = Math.min(distance, Math.abs(pos1 - pos2));
			}
		}
		
		
		return distance;
	}
	
	
	public int shortestDistance_array(String[] words, String word1, String word2) {
		List<Integer> pos1 = new ArrayList<Integer>();
		List<Integer> pos2 = new ArrayList<Integer>();
		
		for(int i = 0 ; i < words.length; i++) {
			if(words[i].equals(word1)) {
				pos1.add(i);
			}
			if(words[i].equals(word2)) {
				pos2.add(i);
			}
		}
		
		int distance = words.length;
		int p1 = 0, p2 = 0;
		
		while(p1 < pos1.size() && p2< pos2.size()) {
			distance = Math.min(distance, Math.abs(pos1.get(p1) - pos2.get(p2)));
			if(pos1.get(p1) < pos2.get(p2)) {
				p1++;
			}else {
				p2++;
			}
		}
		
		return distance;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = new String[] {"a","b"};
		ShortestWordDistance_243 dis = new ShortestWordDistance_243();
		System.out.println(dis.shortestDistance(words, "a", "b"));
		
	}

}
