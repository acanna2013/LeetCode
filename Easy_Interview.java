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
