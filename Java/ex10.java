//Escreva um algoritmo que identifique se um número é primo ou não.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é primo:");
        int num = scanner.nextInt();
        boolean isPrimo = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrimo = false;
                break;
            }
        }

        if (isPrimo && num > 1) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }
    }
}
