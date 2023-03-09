import java.util.Scanner;

public class Inverter {
    public static void main(String[] args) {
        String textoOriginal, textoInvertido = "";
        
        // Obtém o texto original informado pelo usuário
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite um texto: ");
            textoOriginal = entrada.nextLine();
        }
        
        // Inverte o texto caractere por caractere
        for (int i = textoOriginal.length() - 1; i >= 0; i--) {
            textoInvertido += textoOriginal.charAt(i);
        }
        
        // Exibe o texto invertido
        System.out.println("Texto invertido: " + textoInvertido);
    }
}
