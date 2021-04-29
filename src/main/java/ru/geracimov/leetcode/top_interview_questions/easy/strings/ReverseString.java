package ru.geracimov.leetcode.top_interview_questions.easy.strings;

public class ReverseString {
    public void reverseString(char[] s) {
        char temp;
        for (var i = 0; i < s.length / 2; i++) {
            int r = s.length - i - 1;
            if (s[i] != s[r]) {
                temp = s[i];
                s[i] = s[r];
                s[r] = temp;
            }
        }
    }
}
