// 383. Ransom Note
// Link - https://leetcode.com/problems/ransom-note/description/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magLetters = new HashMap<>();

        for(int i = 0; i < magazine.length(); ++i) {
            char m = magazine.charAt(i);

            int currentCount = magLetters.getOrDefault(m, 0);
            magLetters.put(m, currentCount + 1);
        }

        for(int i = 0; i < ransomNote.length(); ++i) {
            char n = ransomNote.charAt(i);

            int currentCount = magLetters.getOrDefault(n, 0);

            if(currentCount == 0) {
                return false;
            }

            magLetters.put(n, currentCount - 1);
        }
        return true;
    }
}