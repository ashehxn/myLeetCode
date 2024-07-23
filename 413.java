// 412. Fizz Buzz
// Link - https://leetcode.com/problems/fizz-buzz/

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<String>();
        String key = "";
        for(int i = 1; i <= n; ++i) {
            if(i % 3 == 0 && i % 5 == 0) key = "FizzBuzz";
            else if(i % 3 == 0) key = "Fizz";
            else if(i % 5 == 0) key = "Buzz";
            else key = String.valueOf(i);
            list.add(key);
        }
        return list;
    }
}