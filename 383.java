// 383. Ransom Note
// Link - https://leetcode.com/problems/ransom-note/description/

// Solution 1
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabetCount = new int[26];

        for(int i = 0; i < magazine.length(); ++i) {
            char c = magazine.charAt(i);
            alphabetCount[c - 'a']++;
        }

        for(int i = 0; i < ransomNote.length(); ++i) {
            char c = ransomNote.charAt(i);
            if(alphabetCount[c - 'a'] == 0) return false;
            alphabetCount[c - 'a']--;
        }
        return true;
    }
}

// Solution 2
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