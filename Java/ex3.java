//Implemente um programa que solicite 10 números inteiros ao usuário. Informe quantos números são pares.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número inteiro:");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                countPares++;
            }
        }

        System.out.println("Quantidade de números pares: " + countPares);
    }
}
