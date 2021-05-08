package ru.geracimov.leetcode.top_interview_questions.easy.strings;


/**
 * Longest Common Prefix
 * <p>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * Constraints:
 * <ul>
 *     <li>1 <= strs.length <= 200</li>
 *     <li>0 <= strs[i].length <= 200</li>
 *     <li>strs[i] consists of only lower-case English letters.</li>
 * </ul>
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String min = strs[0];
        String max = strs[0];
        for (String str : strs) {
            if (str.compareTo(min) < 0) min = str;
            if (str.compareTo(max) > 0) max = str;
        }

        var sb = new StringBuilder();
        char[] charArray = min.toCharArray();
        for (int i = 0, charArrayLength = charArray.length; i < charArrayLength; i++) {
            char ch = charArray[i];
            if (max.charAt(i) == ch) sb.append(ch);
            else return sb.toString();
        }
        return sb.toString();
    }
}
