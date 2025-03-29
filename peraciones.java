import java.util.Scanner;

public class EcuacionCuadratica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        
        do {
            System.out.print("Introduce el valor de a (no puede ser 0): ");
            a = scanner.nextDouble();
            if (a == 0) {
                System.out.println("El valor de 'a' no puede ser cero en una ecuación cuadrática.");
            }
        } while (a == 0);
      
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Introduce el valor de b: ");
            b = scanner.nextDouble();
            System.out.print("Introduce el valor de c: ");
            c = scanner.nextDouble();
            validInput = true; 
        }
        
        double discriminante = b * b - 4 * a * c;

        for (int i = 0; i < 1; i++) {
            if (discriminante > 0) {
                // Dos soluciones reales distintas
                double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Las soluciones reales son: ");
                System.out.println("Raíz 1: " + raiz1);
                System.out.println("Raíz 2: " + raiz2);
                break; //
            } else if (discriminante == 0) {
            }
                double raiz = -b / (2 * a);
                System.out.println("La solución real es: " + raiz);
                break;
            } else {
                System.out.println("No hay soluciones reales.");
                break;
            }
        }
        
        for (int i = 0; i < 3; i++) {
        
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                continue; 
            }
            System.out.println("Iteración " + i);
        }
    }
}
