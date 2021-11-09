package edu.northeastern.rahul;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	int[] nums = {7, 2, 11, 15};
    int traget = 18;
    int[] output = addTwoNums(nums, traget);
        for (int j : output) {
            System.out.print(j + " ");
        }
    }

    private static int[] addTwoNums(int[] nums, int traget){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
         map.put(nums[i], i );
        }
        for(int i = 0; i < nums.length; i++) {
            int complimentnum = traget - nums[i];
            if(map.containsKey(complimentnum)){
                return new int[]{i, map.get(complimentnum)};
            }
        }
        return null;
    }
}
