import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class CalculadoraAPP {
    public static void main(String[] args) {
        System.out.println("****Aplicación Calculadora****");
        System.out.println("Proporciona un valor para el operando 1: ");
        Scanner entrada = new Scanner(System.in);

        var operando1 = Integer.parseInt(entrada.nextLine());
        var operando2 = 20;
        var resultado = operando1+operando2;

        System.out.println("Resusltado = " + resultado);
    }
}
