package com.swedbank.itacademy.tdd;

import com.swedbank.itacademy.tdd.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {

    private Stack stack;

    @BeforeEach
    public void init() {
        stack = new Stack();
    }

    @Test
    public void newStack_isEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterOnePush_IsNotBeEmpty() {
        stack.push(0);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void willThrowUnderflow_WhenEmptyStackIsPopped() {
        assertThrows(Stack.Underflow.class, () -> stack.pop());
    }

    @Test
    public void afterOnePushAndOnePop_WillBeEmpty() {
        stack.push(99);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterTwoPushesAndOnePop_WillNotBeEmpty() {
        stack.push(10);
        stack.push(22);
        stack.pop();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void afterPushingX_WillPopX() {
        stack.push(8);
        assertEquals(8, stack.pop());
    }

    @Test
    public void afterPushingXAndY_WillPopYAndX() {
        stack.push(8);
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals(8, stack.pop());
    }
}
