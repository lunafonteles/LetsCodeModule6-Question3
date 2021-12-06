package com.question3;

public class Convertor {

    static final float CALC_FAHRENHEIT = 1.8f;

    static float calculaFahrenheit(float celsius) {
        float fahrenheit = (celsius * CALC_FAHRENHEIT) + 32f;
        return fahrenheit;
    }
}
