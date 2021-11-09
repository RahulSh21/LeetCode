package edu.northeastern.rahul;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       int[] nums1 = {1,3};
        int[] nums2 = {2,4};
        System.out.println("median is " + median(nums1, nums2));
    }

    private static int median(int[] nums1, int[] nums2){
        int[] nums = mergedArray(nums1, nums2);
        Arrays.sort(nums);
        if(nums.length/2 == 0){
            return nums[nums.length/2] + nums[nums.length/2 -1];
        } else {
            return nums[nums.length/2];
        }
    }

    private static int[] mergedArray(int[] nums1, int[] nums2){
        int[] nums = new int [nums1.length + nums2.length];
        int length =0;
        for (int j : nums1) {
            nums[length] = j;
            length++;
        }
        for (int j : nums2) {
            nums[length] = j;
            length++;
        }
        return nums;
    }
}
