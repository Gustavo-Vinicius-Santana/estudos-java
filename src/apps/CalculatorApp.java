package apps;

import models.Calculator;
import java.util.Scanner;

public class CalculatorApp {
    private Calculator calculator;
    private Scanner scanner;

    public CalculatorApp(){
        this.calculator = new Calculator();
        this.scanner = new Scanner(System.in);
    }

    public void ChoiceOperation(double number1, double number2){
        System.out.print("\nDigite o numero da operação que você deseja: ");
        int choice = scanner.nextInt();

        double result;
        switch (choice) {
            case 1:
                result = calculator.add(number1, number2);
                System.out.print("\n" + number1 + " + " + number2 + " = " + result);
                break;
            case 2:
                result = calculator.subtract(number1, number2);
                System.out.print("\n" + number1 + " - " + number2 + " = " + result);
                break;
            case 3:
                result = calculator.multiply(number1, number2);
                System.out.print("\n" + number1 + " x " + number2 + " = " + result);
                break;
            case 4:
                result = calculator.division(number1, number2);
                System.out.print("\n" + number1 + " / " + number2 + " = " + result);
                break;
            default:
                System.out.println("\nEscolha inválida. Tente novamente.");

                System.out.print("\nDigite o valor do primeiro numero: ");
                double n1 = scanner.nextDouble();

                System.out.print("\nDigite o valor do segundo numero: ");
                double n2 = scanner.nextDouble();

                ChoiceOperation(n1, n2);
        }
    }

    public void Start(){

        System.out.println("\nCALCULADORA INICIADA!");

        System.out.print("\nDigite o valor do primeiro numero: ");
        double n1 = scanner.nextDouble();

        System.out.print("\nDigite o valor do segundo numero: ");
        double n2 = scanner.nextDouble();

        System.out.print("\n-------------------------------------------------");

        System.out.print("\nLISTA DE OPERAÇÕES MATEMATICAS: ");

        System.out.print("\n1-SOMA\n2-SUBTRAÇÃO\n3-MULTIPLICAÇÃO\n4-DIVISÃO");
        ChoiceOperation(n1, n2);

        System.out.print("\nEscolah de continuação:\n1-CONTINUAR\n2-PARAR\nDigite a opção:");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                Start();
                break;
            case 2:
                break;
        }
    }
}
