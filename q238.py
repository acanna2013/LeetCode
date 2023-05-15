class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)

        # calculate prefix per index
        for i in range(1, len(nums)):
            res[i] = res[i-1] * nums[i - 1]
        # calculate suffix per index
        post = 1
        for i in range(len(nums) - 2, -1, -1):
            post *= nums[i + 1]
            res[i] *= post
        return res

        # -----------
        # separate memory for prefix & suffix
        # -----------
        # res = [1] * len(nums)
        # pre = [1] * len(nums)
        # suf = [1] * len(nums)
        # # multiply prefixes
        # for i in range(1, len(nums)):
        #     pre[i] = pre[i - 1] * nums[i - 1]
        
        # # multiply suffixes
        # for i in range(len(nums) - 2, -1, -1):
        #     suf[i] = suf[i + 1] * nums[i + 1]

        # # multiply prefix and suffix
        # for i in range(0, len(nums)):
        #     res[i] = pre[i] * suf[i]
        # return res
        
