package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FailingTest {

    @Test
    @Disabled("Отключено для проверки CI")
    void testWithError() {
        assertEquals(1, 2, "Этот тест должен провалиться");
    }
}