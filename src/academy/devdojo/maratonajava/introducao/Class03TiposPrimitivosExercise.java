package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

//Já estava um pouco avançada devido a ter cursado a matéria de orientação à objetos na faculdade, então quis já adicionar outras coisas a mais

public class Class03TiposPrimitivosExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite o salário: ");
        double salario = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite a data: ");
        String dataRecebimentoSalario = scanner.nextLine();

        System.out.println("Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de R$"+salario+", na data "+dataRecebimentoSalario);

        scanner.close();
    }
}

