// Escreva um algoritmo que receba a idade e o peso de sete pessoas. Calcule e exiba a quantidade de pessoas 
//com mais de 90 quilos. A média das idades das sete pessoas.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peso90 = 0;
        int somaIdades = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("Digite a idade:");
            int idade = scanner.nextInt();
            System.out.println("Digite o peso:");
            float peso = scanner.nextFloat();

            if (peso > 90) {
                peso90++;
            }
            somaIdades += idade;
        }

        System.out.println("Pessoas com mais de 90 quilos: " + peso90);
        System.out.println("Média das idades: " + (somaIdades / 7.0));
    }
}
