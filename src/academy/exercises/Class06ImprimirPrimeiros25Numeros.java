package academy.exercises;

import java.util.Scanner;

// Imprima os primeiros 25 numeros de um dado valor, por exemplo 50
public class Class06ImprimirPrimeiros25Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorMax = scanner.nextInt();

        for (int i = 1; i < valorMax; i++) {
            if (i <= 25) {
                System.out.println("Número " + i);
            } else {
                break;
            }
        }
    }
}
