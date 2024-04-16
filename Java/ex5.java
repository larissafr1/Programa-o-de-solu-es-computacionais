// Escreva um algoritmo que receba a idade, a altura e o peso de 25 pessoas. Calcule e exiba.
// a) Quantidade de pessoas com idade superior a 50 anos.
// b) A média das alturas das pessoas com idade entre 10 e 20 anos;
// c) A porcentagem de pessoas com peso inferior a 40 quilos entre todas as analisadas.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count50plus = 0;
        double somaAlturas = 0;
        int countAlturas = 0;
        int count40minus = 0;

        for (int i = 0; i < 25; i++) {
            System.out.println("Digite a idade:");
            int idade = scanner.nextInt();
            System.out.println("Digite a altura:");
            double altura = scanner.nextDouble();
            System.out.println("Digite o peso:");
            double peso = scanner.nextDouble();

            if (idade > 50) {
                count50plus++;
            }
            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                countAlturas++;
            }
            if (peso < 40) {
                count40minus++;
            }
        }

        System.out.println("Quantidade de pessoas com mais de 50 anos: " + count50plus);
        System.out.println("Média das alturas das pessoas entre 10 e 20 anos: " + (countAlturas > 0 ? somaAlturas / countAlturas : 0));
        System.out.println("Porcentagem de pessoas com peso inferior a 40kg: " + (count40minus / 25.0 * 100) + "%");
    }
}
