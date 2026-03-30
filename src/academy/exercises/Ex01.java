package academy.exercises;
/* Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
 */
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        System.out.println(A+B);

        if ((A+B) < C){
            System.out.println("A soma de A e B é menor que C");
        }
        else{
            System.out.println("A soma de A e B é maior que C");
        }
    }
}
