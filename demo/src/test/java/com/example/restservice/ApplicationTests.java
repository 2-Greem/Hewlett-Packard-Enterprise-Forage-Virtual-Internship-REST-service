package com.example.restservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void sampleTest() {
        int sum = 2 + 3;
        assertEquals(5, sum);
    }
}