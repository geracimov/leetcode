package ru.geracimov.leetcode.top_interview_questions.easy.strings;

/**
 * Valid Anagram
 * <p>
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * Constraints:
 * <ul>
 *    <li>1 <= s.length, t.length <= 5 * 10^4</li>
 *    <li>s and t consist of lowercase English letters.</li>
 * <ul/>
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] sStructure = getStructure(s);
        int[] tStructure = getStructure(t);

        for (int i = 0; i < sStructure.length; i++) {
            if (sStructure[i] != tStructure[i]) return false;
        }
        return true;
    }

    private int[] getStructure(String s) {
        var res = new int[26];
        for (var i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            res[index]++;
        }
        return res;
    }

}
