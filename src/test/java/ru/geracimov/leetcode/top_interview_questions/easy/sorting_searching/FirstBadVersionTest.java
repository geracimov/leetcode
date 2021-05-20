package ru.geracimov.leetcode.top_interview_questions.easy.sorting_searching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {
    private   FirstBadVersion firstBadVersion;

    @Test
    void firstBadVersion() {
        firstBadVersion = new FirstBadVersion(4);
        assertThat(firstBadVersion.firstBadVersion(5)).isEqualTo(4);
    }
    @Test

    void firstBadVersion2() {
        firstBadVersion = new FirstBadVersion(1702766719);
        assertThat(firstBadVersion.firstBadVersion(2126753390)).isEqualTo(1702766719);
    }
}