import java.util.Scanner;

public class CalculadoraAPP {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("****Aplicación Calculadora****");
        System.out.println("""
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                5. Salir""");

        System.out.print("Ingresa un operación: ");
        var operacion = Integer.parseInt(entrada.nextLine());

        if(operacion >= 1 && operacion <= 4) {
            switch (operacion) {
                case 1->{
                    System.out.print("Proporciona un valor para el operando 1: ");


                    var operando1 = Integer.parseInt(entrada.nextLine());
                    var operando2 = 20;
                    var resultado = operando1 + operando2;

                    System.out.println("Resultado = " + resultado);
                }

            }

        }
    }
}
