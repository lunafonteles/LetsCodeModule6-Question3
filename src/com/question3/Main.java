package com.question3;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanCelsius = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius");
        float celsius = scanCelsius.nextFloat();

        float fahrenheit = Convertor.calculaFahrenheit(celsius);
        System.out.printf("F é %.2f \n", fahrenheit);

    }
}
