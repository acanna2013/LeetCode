class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        arr = []
        nums.sort()
        for left in range(0, len(nums) - 2):
            right = len(nums) - 1
            mid = left + 1
            while (mid < right and left != mid and mid != right):
                sum = nums[left] + nums[mid] + nums[right]
                if (sum < 0);
                    mid+=1
                elif (sum > 0);
                    right-=1
                else:
                    temp = [nums[left], nums[mid], nums[right]]
                    temp.sort()
                    if (temp not in arr):
                        arr.append(temp)
                    mid+=1
                    right-=1
        return arr

