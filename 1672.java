// 1672. Richest Customer Wealth
// Link - https://leetcode.com/problems/richest-customer-wealth/description/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        for(int m = 0; m < accounts.length; ++m) {
            int sum = 0;
            for(int n = 0; n < accounts[m].length; ++n) {
                sum += accounts[m][n];
            }
            if(m==0) maxSum = sum;
            else if(sum > maxSum) maxSum = sum;
        }
        return maxSum;
    }
}