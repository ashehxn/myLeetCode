// 1480. Running Sum of 1d Array
// Link - https://leetcode.com/problems/running-sum-of-1d-array/description/

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=0; i < nums.length; ++i) {
            if(i!=0) nums[i] += nums[i - 1];
        }
        return nums;
    }
}