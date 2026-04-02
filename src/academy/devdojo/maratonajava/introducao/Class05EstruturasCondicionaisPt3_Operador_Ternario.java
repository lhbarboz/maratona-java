package academy.devdojo.maratonajava.introducao;

//Operador ternário -> (condicao) ? verdadeiro : falso;

import java.util.Scanner;

public class Class05EstruturasCondicionaisPt3_Operador_Ternario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //comprar se salario > 5000
        System.out.print("Qual é o seu salário? ");
        double salario = Double.parseDouble(scanner.nextLine());

        String ps5Comprar = "você pode comprar um ps5";
        String ps5NaoComprar = "você não pode comprar um ps5";
        String resultado = salario > 5000 ? ps5Comprar : ps5NaoComprar;

        /*
        if (salario > 5000){
            resultado = ps5Comprar;
        }else{
            resultado = ps5NaoComprar;
        }
        */
        System.out.println(resultado);

        scanner.close();
    }
}
