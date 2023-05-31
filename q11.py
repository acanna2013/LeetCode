class Solution:
    def maxArea(self, height: List[int]) -> int:
        sum_arr = []
        l = 0
        r = len(height) - 1
        area = 0
        while (l < r):
            area = min(height[l], height[r]) * (r-l)
            sum_arr.append(area)
            if (height[l] > height[r]):
                r-=1
            else: 
                l+=1
        return max(sum_arr)

