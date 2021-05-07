package ru.geracimov.leetcode.top_interview_questions.easy.strings;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * First Unique Character in a String
 * <p>Given a string s, return the first non-repeating character in it and return its index.
 * If it does not exist, return -1.</p>
 * Constraints:
 * <ul>
 *     <li>1 <= s.length <= 10^5</li>
 *     <li>s consists of only lowercase English letters.</li>
 * </ul>
 * <p>
 */
public class FirstUniqueCharacterInString {

    public int firstUniqChar(String s) {
        Map<Character, CharStat> charStats = new HashMap<>();
        char[] chars = s.toCharArray();
        for (var i = 0; i < chars.length; i++) {
            if (charStats.containsKey(chars[i])) {
                charStats.get(chars[i]).inc();
            } else {
                charStats.put(chars[i], new CharStat(i));
            }
        }
        return charStats.values().stream()
                .sorted(Comparator.comparing(a -> a.index))
                .filter(charStat -> charStat.count == 1)
                .map(stat -> stat.index)
                .findFirst().orElse(-1);
    }

    private static class CharStat {
        int index;
        int count;

        CharStat(int index) {
            this.index = index;
            this.count = 1;
        }

        void inc() {
            count++;
        }
    }

}

