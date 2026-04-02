package academy.exercises;

import java.util.Scanner;

// Dado um determinado salario noruegues, quanto deve se pagar de taxa de imposto?
public class CalculoImpostoNoruegues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o seu salário? ");
        double salario = Double.parseDouble(scanner.nextLine());
        String imposto;
        double taxa = 0;

        if (salario > 0 && salario <= 34712 ){
            imposto = "9.7%";
            taxa = 0.097;
        } else if (salario > 34712 && salario <= 68507) {
            imposto = "37.35%";
            taxa = 0.3735;
        } else if (salario > 68507){
            imposto = "49.5%";
            taxa = 0.495;
        } else {
            imposto = "Salário inválido!";
        }

        double calculoTaxa = salario * taxa;

        if (!imposto.equals("Salário inválido!")){
            System.out.printf("Você deve pagar %s de imposto. O que equivale a: $%.2f%n", imposto, calculoTaxa);
        }else {
            System.out.println(imposto);
        }
        scanner.close();
    }
}