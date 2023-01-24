package firstTask;

import java.util.Scanner;

/**
    Чи́сла Фибона́ччи — элементы числовой последовательности 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, …,
 в которой первые два числа равны 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел.
    Написать функцию, которая вычисляет и возвращает число Фибона́ччи по переданному порядковому номеру.
 */

public class FibonacciNumbers {

    public long getFibonacciByIndex(int index) {
        if (index == 0) {
            return 0;
        }
        if (index < 0 || index > 92) {
            throw new IndexOutOfBoundsException(index);
        }
        long n0 = 0L;
        long n1 = 1L;
        for (int i = 2; i <= index; i++) {
            long n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        return n0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ordinal Fibonacci number, no more than 92");

        int sc = scanner.nextInt();
        FibonacciNumbers fibonacci = new FibonacciNumbers();
        System.out.println(fibonacci.getFibonacciByIndex(sc));
    }

}