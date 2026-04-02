package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;
//Switch
public class Class05EstruturasCondicionaisPt5 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        byte numDiaSemana = scanner.nextByte();

        switch (numDiaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido!");
        }
        scanner.close();
    }
}