import apps.CalculatorApp;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // DEFINIÇÃO DE APPS
        CalculatorApp calc = new CalculatorApp();
        // DEFINIÇÃO DE ENTRADA
        Scanner scanner = new Scanner(System.in);

        // DEFINIÇÃO DE VARIAVEIS
        int choice = 0;

        // INTERAÇÃO COM O USUARIO
        System.out.println("\n-------------------------------------------------");

        System.out.println("\nESCOLHA UM DOS SISTEMAS ABAIXO");

        System.out.println("\n1-CALCULADORA");

        System.out.print("\nDigite o numero da sua escolha: ");
        choice = scanner.nextInt();

        System.out.println("\n-------------------------------------------------");
        switch(choice){
            case 1:
                calc.Start();

        }

        // CHECAGEM DE ESCOLHA
        while(choice != 1){
            System.out.print("\nNumero invalido. Digite novamente: ");
            choice = scanner.nextInt();
        }

        System.out.println("\n-------------------------------------------------");
    }
}