package ru.netology.sqr;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void TestCounterSquareRoot(String nameTest, int min, int max, int resultSQR) {
        SQRService service = new SQRService();
        int actual = service.calcSqrt(min, max);
        assertEquals(resultSQR, actual);
    }
}

