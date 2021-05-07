package ru.geracimov.leetcode.top_interview_questions.easy.strings;

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
