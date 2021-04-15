package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //  Для введенного числа t (температура на улице) вывести
        //  Если t>–5, то вывести «Тепло»
        //  Если –5>= t > –20, то вывести «Нормально»
        //  Если –20>= t, то вывести «Холодно»

        Scanner in = new Scanner(System.in);
        int temperature = in.nextInt();

        if (temperature > -5) {
            System.out.println("Тепло");
        } else if ((temperature <= -5) && (temperature > -20)) {
            System.out.println("Нормально");

        } else System.out.println("Холодно");
    }
}



