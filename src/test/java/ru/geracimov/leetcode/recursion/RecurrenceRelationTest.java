package ru.geracimov.leetcode.recursion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RecurrenceRelationTest {
    private final RecurrenceRelation recurrenceRelation = new RecurrenceRelation();

    @Test
    void recurrenceRelation() {
        assertThat(recurrenceRelation.recurrenceRelation(16, 8)).isEqualTo(6435);
        assertThat(recurrenceRelation.recurrenceRelation(17, 9)).isEqualTo(12870);
        assertThat(recurrenceRelation.recurrenceRelation(5, 3)).isEqualTo(6);
        assertThat(recurrenceRelation.recurrenceRelation(4, 2)).isEqualTo(3);
        assertThat(recurrenceRelation.recurrenceRelation(10, 5)).isEqualTo(126);
    }
}