package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(man(5, -35));
        System.out.println(man(15, 20));
        System.out.println(man(20, 25));
        System.out.println(man(46, 24));
        System.out.println(man(1, 0));


    }

    public static String man(int age, int temp) {
        String result = "Age : " + age + " , Temperature : " + temp + "°";
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30) {
            return "Можно идти гулять";

        } else if (age < 20 && temp >= 0 && temp <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temp >= -10 && temp <= 25) {
            return "Можно идти гулять";
        } else {
            System.out.println("Оставайтесь дома");
        }
        return result;


    }


}
