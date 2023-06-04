package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTaskTest {
    @Test
    public void testSimpleTaskfound() {
        SimpleTask simpleTask = new SimpleTask(5, "Купить Хлеб");

        boolean actual = simpleTask.matches("Купить");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testSimpleTaskNOTfound() {
        SimpleTask simpleTask = new SimpleTask(5, "Купить Хлеб");

        boolean actual = simpleTask.matches("продать");
        Assertions.assertFalse(actual);
    }
}