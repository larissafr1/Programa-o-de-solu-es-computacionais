//Implemente um programa que solicite ao usuário um número. Exiba a tabuada de 0 a 100 deste número.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para ver sua tabuada:");
        int num = scanner.nextInt();

        for (int i = 0; i <= 100; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
