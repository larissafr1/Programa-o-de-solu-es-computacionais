// Implemente um programa que solicite 10 números inteiros informados pelo usuário. Exiba a soma.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número inteiro:");
            int num = scanner.nextInt();
            soma += num;
        }

        System.out.println("A soma dos números é: " + soma);
    }
}
