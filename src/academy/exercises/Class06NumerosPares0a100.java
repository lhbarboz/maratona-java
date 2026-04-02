package academy.exercises;

//Imprima todos os números pares de 0 até 100 usando for ou while

public class Class06NumerosPares0a100 {
    static void main() {
        for(int contador = 0; contador<101; contador++){
            if(contador % 2 == 0) {
                System.out.println("Número " + contador);
            }
        }
    }
}