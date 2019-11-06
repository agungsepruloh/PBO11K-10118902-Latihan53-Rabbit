package com.pbo;

public class Main {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Peter",false, "grass", 4, "grey");

        System.out.println(String.format("Hello, His name is %s", rabbit.getName()));
        System.out.println(String.format("%s is Vegetarian? %s", rabbit.getName(), rabbit.isVegetarian()));
        System.out.println(String.format("%s eats %s", rabbit.getName(), rabbit.getEats()));
        System.out.println(String.format("%s has %d legs", rabbit.getName(), rabbit.getNoOfLegs()));
        System.out.println(String.format("%s color is %s", rabbit.getName(), rabbit.getColor()));
    }
}
