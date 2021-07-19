package ru.geracimov.leetcode.arrays101;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ReplaceElementsWithGreatestElementOnRightSideTest {
    ReplaceElementsWithGreatestElementOnRightSide test = new ReplaceElementsWithGreatestElementOnRightSide();

    @Test
    void replaceElements() {
        assertThat(test.replaceElements(new int[]{17, 18, 5, 4, 6, 1})).containsExactly(18, 6, 6, 6, 1, -1);
    }
}