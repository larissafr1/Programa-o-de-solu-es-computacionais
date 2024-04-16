//Faça um programa que exiba todos os números entre 1000 e 2000 que quando divisíveis por 5 produzam resto 3.

public class Main {
    public static void main(String[] args) {
        for (int i = 1000; i <= 2000; i++) {
            if (i % 5 == 3) {
                System.out.println(i);
            }
        }
    }
}
