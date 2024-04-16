//Escreva um algoritmo que calcule o Fatorial de um número.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial:");
        int n = scanner.nextInt();
        long fatorial = 1;

        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + n + " é " + fatorial);
    }
}
