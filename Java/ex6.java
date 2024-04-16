//Faça um programa que receba dez números, calcule e mostre a soma dos números pares, dos números ímpares e dos divisíveis por 3.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaPares = 0, somaImpares = 0, somaDiv3 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número:");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                somaPares += num;
            } else {
                somaImpares += num;
            }
            if (num % 3 == 0) {
                somaDiv3 += num;
            }
        }

        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);
        System.out.println("Soma dos números divisíveis por 3: " + somaDiv3);
    }
}
