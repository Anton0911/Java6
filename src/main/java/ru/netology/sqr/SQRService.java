package ru.netology.sqr;

public class SQRService {

    public int calcSqrt(int min, int max) {
        int quantity = 0;
        for (int i = 10; i <= 99; i++) {
            if (min <= i * i && i * i <= max) {
                quantity++;
            }
        }
        return quantity;
    }
}
