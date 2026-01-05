package gr.aueb.cf.cf9.review_challenges;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * Finds the indices of two numbers that sum up to the target.
 * Uses a HashMap to store values and their indices for O(n) lookups.
 */

public class IntsSumToTarget {

    public static void main(String[] args) {
        int num[] = {1, 2, 8, 13, 20};

        System.out.println(Arrays.toString(twoSum(num,33)));
    }


    public static int[] twoSum(int nums[], int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i =0; i < nums.length; i++) {
            int remain = target - nums[i];
            if (map.containsKey(remain)) {
                return new int[] {map.get(remain),i};
            }

            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No solution");


        //2nd Solution

//        for (int i = 0; i < nums.length; i++) {
//            int current = nums[i];
//            int remain = target - current;
//            if (map.containsKey(remain)) return new int[] {map.get(remain), i};
//            else map.put(nums[i],i );
//        }
//        return null;

    }
}
