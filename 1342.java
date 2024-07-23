// 1342. Number of Steps to Reduce a Number to Zero
// Link - https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while(num != 0) {
            if(num % 2 == 1) {
                num = num - 1;
                steps++;
                if(num == 0) break;
            }
            num = num / 2;
            steps++;
        }
        return steps;
    }
}