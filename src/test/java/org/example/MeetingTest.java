package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeetingTest {
    @Test
    public void testSimpleTaskfound() {
        SimpleTask simpleTask = new SimpleTask(5, "Выкатка 3й версии приложения");

        boolean actual = simpleTask.matches("Выкатка");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testSimpleTaskNOTfound() {
        SimpleTask simpleTask = new SimpleTask(5, "Выкатка 3й версии приложения");

        boolean actual = simpleTask.matches("4й");
        Assertions.assertFalse(actual);
    }

}