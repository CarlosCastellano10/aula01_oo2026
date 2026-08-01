import java.util.Scanner;
import java.util.Random;

public class Tarefa01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeroAleatorio = aleatorio.nextInt(20);
        int palpite = 0;
        int tentativa = 0;

        System.out.println("Tente adivinhar o número secreto de 1 a 20:");
        
        while (palpite != numeroAleatorio) {
            System.out.print("O seu palpite: ");
            palpite = teclado.nextInt();
            tentativa++;

            if (palpite == numeroAleatorio) {
                break;
            }
            if(palpite < numeroAleatorio) {
                System.out.println("O palpite deve ser maior");
            } else { 
                System.out.println("O palpite deve ser menor");
            }
        }
         System.out.println("Acertou!");
         System.out.println("Descobriu em " + tentativa + " tentativas");
    }   
}