package academy.exercises;

import java.util.Scanner;

// Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
// Condicao do valorParcela >= 1000
public class Class06ParcelasDeUmCarroAPartirDoValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorCarro = Double.parseDouble(scanner.nextLine());

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            /*if (valorParcela >= 1000) {
                System.out.println("Esse carro pode ser parcelado em " + parcela + " parcelas de " + valorParcela);
            }else{
                break;
            }*/
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Esse carro pode ser parcelado em " + parcela + " parcelas de " + valorParcela);
        }
    }
}
