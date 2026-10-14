// Versión 1.0 - Práctica de Entornos de Desarrollo
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double num1, num2 = 0, resultado;
            int operacion;

            System.out.println("=== ¡BIENVENIDO A LA CALCULADORA! ===");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.print("Elige una operación (1-6): ");

            try {
                operacion = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número válido.");
                return;
            }

            System.out.print("Ingresa el primer número: ");
            try {
                num1 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: El primer valor no es un número válido.");
                return;
            }

            if (operacion != 6) {
                System.out.print("Ingresa el segundo número: ");
                try {
                    num2 = scanner.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Error: El segundo valor no es un número válido.");
                    return;
                }
            }

            switch (operacion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                case 5:
                    resultado = Math.pow(num1, num2);
                    System.out.println("Resultado: " + num1 + " ^ " + num2 + " = " + resultado);
                    break;
                case 6:
                    if (num1 >= 0) {
                        resultado = Math.sqrt(num1);
                        System.out.println("Resultado: raíz cuadrada de " + num1 + " = " + resultado);
                    } else {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
