//Implemente um programa que solicite 5 números do tipo ponto flutuante ao usuário. Exiba o maior número informado.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float maior = Float.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número flutuante:");
            float num = scanner.nextFloat();
            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior número informado foi: " + maior);
    }
}
