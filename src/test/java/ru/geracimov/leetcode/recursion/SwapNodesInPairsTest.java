package ru.geracimov.leetcode.recursion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwapNodesInPairsTest {
    private final SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();

    @Test
    void swapPairs() {
        ListNode node4 = new ListNode(4, null);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode.print(node1);
        ListNode swap = swapNodesInPairs.swapPairs(node1);
        ListNode.print(swap);
        assertThat(swap).hasFieldOrPropertyWithValue("val", 2)
                .hasFieldOrPropertyWithValue("next", node1);
        assertThat(swap.next).hasFieldOrPropertyWithValue("val", 1)
                .hasFieldOrPropertyWithValue("next", node4);
        assertThat(swap.next.next).hasFieldOrPropertyWithValue("val", 4)
                .hasFieldOrPropertyWithValue("next", node3);
        assertThat(swap.next.next.next).hasFieldOrPropertyWithValue("val", 3)
                .hasFieldOrPropertyWithValue("next", null);
    }
}