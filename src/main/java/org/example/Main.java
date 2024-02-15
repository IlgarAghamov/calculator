package org.example;

public class Main {
    public static void main(String[] args) {
        // Пример использования класса Calculator
        int intSum = Calculator.sum(5, 3);
        System.out.println("Sum of integers: " + intSum);

        double doubleProduct = Calculator.multiply(2.5, 4.0);
        System.out.println("Product of doubles: " + doubleProduct);

        // Пример использования метода compareArrays
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        boolean arraysEqual = Calculator.compareArrays(array1, array2);
        System.out.println("Arrays are equal: " + arraysEqual);

        // Пример использования класса Pair
        Pair<String, Integer> pair = new Pair<>("Key", 10);
        System.out.println("First element of pair: " + pair.getFirst());
        System.out.println("Second element of pair: " + pair.getSecond());
        System.out.println("Pair: " + pair);
    }
}