package algo;


// leetcode

import java.lang.reflect.Array;
import java.util.*;

public class Intersection2_Ysen {

/* Brute force:
Time: o(m*n) SPace (m)

HashMap:
Time: O(m+n) Space: O(m)

[4, 9, 5]
[9, 4, 8, 9, 4]


map:
{4,0}
{9,0}
{5,1}

result:
9, 4


 */

    public static int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int num : nums1)
            map.put(num, map.getOrDefault(num, 0) + 1);
        for (int num : nums2)
            if (map.containsKey(num) && map.get(num) > 0) {
                queue.offer(num);
                map.put(num, map.get(num) - 1);
            }

        int i = 0;
        int[] result = new int[queue.size()];
        while (!queue.isEmpty())
            result[i++] = queue.poll();
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,8,9,4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
}
