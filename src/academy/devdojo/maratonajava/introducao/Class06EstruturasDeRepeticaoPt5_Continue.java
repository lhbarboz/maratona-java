package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

// Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
// Condicao do valorParcela >= 1000
public class Class06EstruturasDeRepeticaoPt5_Continue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorCarro = Double.parseDouble(scanner.nextLine());

        for (int parcela = (int)valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if(valorParcela <= 1000) {
                continue;
            }
            System.out.println("Esse carro pode ser parcelado em " + parcela + " parcelas de " + valorParcela);
        }
    }
}

