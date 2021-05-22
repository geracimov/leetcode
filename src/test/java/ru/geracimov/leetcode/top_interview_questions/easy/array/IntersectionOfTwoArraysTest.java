package ru.geracimov.leetcode.top_interview_questions.easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntersectionOfTwoArraysTest {
    private final IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();

    @Test
    void intersect() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        assertThat(intersectionOfTwoArrays.intersect(nums1, nums2)).containsExactly(2, 2);
    }

    @Test
    void intersect2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        assertThat(intersectionOfTwoArrays.intersect(nums1, nums2)).containsExactlyInAnyOrder(4, 9);
    }

    @Test
    void intersect3() {
        int[] nums1 = {1, 2};
        int[] nums2 = {1, 1};
        assertThat(intersectionOfTwoArrays.intersect(nums1, nums2)).containsExactlyInAnyOrder(1);
    }

    @Test
    void intersect4() {
        int[] nums1 = {0, 5, 8, 7, 2, 9, 7, 5};
        int[] nums2 = {1, 4, 8, 9};
        assertThat(intersectionOfTwoArrays.intersect(nums1, nums2)).containsExactlyInAnyOrder(8, 9);
    }

    @Test
    void intersect5() {
        int[] nums1 = {3, 1, 2};
        int[] nums2 = {1, 1};
        assertThat(intersectionOfTwoArrays.intersect(nums1, nums2)).containsExactlyInAnyOrder(1);
    }

    @Test
    void intersect6() {
        int[] nums1 = {4, 7, 9, 7, 6, 7};
        int[] nums2 = {5, 0, 0, 6, 1, 6, 2, 2, 4};
        assertThat(intersectionOfTwoArrays.intersect(nums1, nums2)).containsExactlyInAnyOrder(4, 6);
    }

    @Test
    void intersect7() {
        int[] nums1 = {1, 3, 8, 9, 3};
        int[] nums2 = {1, 0};
        assertThat(intersectionOfTwoArrays.intersect(nums1, nums2)).containsExactlyInAnyOrder(1);
    }
}