package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;




/* Suppose you have a random list of people standing in a queue. 
 * Each person is described by a pair of integers (h, k), 
 * where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h.
 *  Write an algorithm to reconstruct the queue.
 * Note: The number of people is less than 1,100.
 * 
 * Example
 * Input:
 * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 * Output:
 * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 * 
 * */
public class QueueReconstructionByHeight_Leetcode406 {
	/**Insert short person to tall person will not affect the relative order of the taller persons, thus sort from higher height to lower heigh
	 * for persons with same height, sort them according to the k index
	 * for example: for [7,0], [4,4], [7,1], [5,0], [6,1], [5,2]
	 * first sort tallest persons [7,0], [7,1],
	 * then insert lower height to the position of their k index
	 * [7,0], [6,1] [7,1]
	 * [5,0],[7,0], [6,1] [7,1]
	 * [5,0],[7,0], [5,2] [6,1] [7,1]
	 * [5,0],[7,0], [5,2] [6,1], [4,4] [7,1]
	 * done.
	 */
	
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] person1, int[] person2) {
                return (person1[0] == person2[0]) ? person1[1] - person2[1] : person2[0] - person1[0];
            }
        });
        List<int[]> list = new ArrayList<int[]>();
        for (int[] cur : people) {
            list.add(cur[1], cur);
        }
        return list.toArray(new int[people.length][2]);
    }

}
