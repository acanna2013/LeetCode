class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # use a dictionary to track frequency of each value in the list
        # sort values descending order
        # get top k values 
        d = dict()
        for num in nums:
            d[num] = d.get(num, 0) + 1
        sort_dict = dict(sorted(d.items(), key = lambda x: x[1], reverse = True))
        result = list(sort_dict.keys())
        return result[:k]
    
