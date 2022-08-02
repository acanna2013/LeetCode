/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int num1 = 0;
        int num2 = 0;
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            num1 = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                num2 = nums[j];
                if (num1 + num2 == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();
        
        int complement = 0;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] {i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
