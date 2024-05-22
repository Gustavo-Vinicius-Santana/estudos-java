import apps.CalculatorApp;
import apps.PessoasApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // DEFINIÇÃO DE ENTRADA
        Scanner scanner = new Scanner(System.in);

        // INTERAÇÃO COM O USUARIO
        System.out.println("\n-------------------------------------------------");

        System.out.println("\nESCOLHA UM DOS SISTEMAS ABAIXO");

        System.out.println("\n1-CALCULADORA");
        System.out.println("\n2-LISTA PESSOAS");

        System.out.print("\nDigite o numero da sua escolha: ");
        int choiceAplication = scanner.nextInt();

        System.out.println("\n-------------------------------------------------");

        ChoiceApp(choiceAplication);

        System.out.println("\n-------------------------------------------------");
        System.out.print("\nDeseja escolher outro App?\n1-Sim\n2-Não\nDigite a opção:");
        int choiceRestart = scanner.nextInt();
        switch (choiceRestart){
            case 1:
                main(new String[0]);
                break;
            case 2:
                break;
        }
    }
    public static void ChoiceApp(int choiceParam){
        // DEFINIÇÃO DE APPS
        CalculatorApp calc = new CalculatorApp();
        PessoasApp pessoas = new PessoasApp();
        // DEFINIÇÃO DE ENTRADA
        Scanner scanner = new Scanner(System.in);

        switch(choiceParam){
            case 1:
                calc.Start();
                break;
            case 2:
                pessoas.Start();
                break;
            default:
                System.out.print("Numero invalido. Digite novamente: ");
                int choice = scanner.nextInt();
                ChoiceApp(choice);
                break;
        }

    }
}