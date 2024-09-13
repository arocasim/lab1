package org.example;

/**
 * Клас Фінобоначі, який обраховує число.
 */

public class Fibonacci {
    private int number;
    private int number2;

    /**
     * Конструктор класу Fibonacci.
     *
     * @param n Ціле число для обчислення числа Фібоначчі.
     */
    public Fibonacci(int n) {
        this.number = n;
        this.number2 = Calculate(n);
    }

    /**
     * Обчислює n-е число Фібоначчі.
     *
     * @param n Ціле число, для якого потрібно обчислити число Фібоначчі.
     * @return n-е число Фібоначчі.
     */
    private int Calculate(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 2;
        int fib1 = 1, fib2 = 2, fibNum = 0;
        for (int i = 3; i <= n; i++) {
            fibNum = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibNum;
        }
        return fibNum;
    }

    /**
     * Перевіряє умову задачі.
     *
     * @return true, якщо умова виконується, false - якщо ні.
     */
    public boolean Check() {
        int fibPlus2 = Calculate(this.number + 2);
        int TwoN = (int) Math.pow(2, this.number);
        return fibPlus2 < TwoN;
    }

    /**
     * Повертає вхідне число n.
     *
     * @return Вхідне число n.
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * Повертає розраховане число Фібоначчі.
     *
     * @return Розраховане число Фібоначчі.
     */
    public int getNumber2() {
        return this.number2;
    }

    /**
     * Виводить результати обчислення числа Фібоначчі та перевірку умови.
     */
    public void Print() {
        System.out.print("\nЗначення числа Фібоначі: " + this.number2);
        System.out.print("\nПеревірка умови задачі: " + Check());
    }
}

