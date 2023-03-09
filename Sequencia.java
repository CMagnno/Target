import java.util.Scanner;

public class Sequencia {
    public static void main(String[] args) {
        int num, primeiro = 0, segundo = 1, proximo = 0;
        boolean pertence = false;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite um numero: ");
            num = entrada.nextInt();
        }
        while (proximo <= num) {
            if (num == proximo) {
                pertence = true;
                break;
            }
            primeiro = segundo;
            segundo = proximo;
            proximo = primeiro + segundo;
        }

        if (pertence) {
            System.out.println("O numero " + num + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println("O numero " + num + " não pertence a sequencia de Fibonacci.");
        }
    }
}