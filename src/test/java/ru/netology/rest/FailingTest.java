package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FailingTest {

    @Test
    void testWithError() {
        assertEquals(1, 2, "Этот тест должен провалиться");
    }
}
