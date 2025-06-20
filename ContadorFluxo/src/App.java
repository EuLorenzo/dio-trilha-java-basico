import java.util.Scanner;

import exceptions.ValidatorException;

public class App {
    private final static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("====== Contador de fluxo ======");

        System.out.print("Digite o primeiro número: ");
        int num1 = s.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = s.nextInt();

        counter(num1, num2);
    }

    private static void counter(int num1, int num2) throws ValidatorException{
        if(num2 < num1){
            throw new ValidatorException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int diffence = num2 - num1;

        for(var i = 1; i <= diffence; i++ ){
            System.out.println("Imprimindo número " + i);
        }
        
    }
}
