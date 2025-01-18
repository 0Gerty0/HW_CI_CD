package ru.netology.rest;

package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FailingTest {

    @Test
    void testWithError() {
        // Намеренная ошибка
        assertEquals(1, 2, "Этот тест должен провалиться");
    }
}
