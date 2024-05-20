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

    public void Start(){
        System.out.print("CALCULADORA INICIADA!");
    }

}
