package ru.geracimov.leetcode.top_interview_questions.easy.strings;

/**
 * <h1>Implement strStr()</h1>
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */
public class ImplementstrStr {

    public int strStr(String haystack, String needle) {
        return strStrCustomImpl(haystack, needle);
    }

    public int strStrJavaImpl(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public int strStrCustomImpl(String haystack, String needle) {
        int needleLength = needle.length();
        int haystackLength = haystack.length();
        for (var i = 0; ; i++) {
            for (var j = 0; ; j++) {
                if (j == needleLength) return i;
                int tail = i + j;
                if (tail == haystackLength) return -1;
                if (needle.charAt(j) != haystack.charAt(tail)) break;
            }
        }
    }
}
