import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para verificar se pertence à sequência Fibonacci: ");
        int numero = scanner.nextInt();
        
        if (verificarFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência Fibonacci.");
        }
        
        scanner.close();
    }
    
    public static boolean verificarFibonacci(int numero) {
        int primeiro = 0;
        int segundo = 1;
        
        if (numero == primeiro || numero == segundo) {
            return true;
        }
        
        int proximo = primeiro + segundo;
        
        while (proximo <= numero) {
            if (proximo == numero) {
                return true;
            }
            primeiro = segundo;
            segundo = proximo;
            proximo = primeiro + segundo;
        }
        
        return false;
    }
}

