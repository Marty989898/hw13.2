package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EpicTest {
    @Test
    public void testSimpleTaskfound() {
        SimpleTask simpleTask = new SimpleTask(5, "Молоко, Яйца, Хлеб");

        boolean actual = simpleTask.matches("Молоко");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testSimpleTaskNOTfound() {
        SimpleTask simpleTask = new SimpleTask(5, "Молоко, Яйца, Хлеб");

        boolean actual = simpleTask.matches("Мясо");
        Assertions.assertFalse(actual);
    }
}