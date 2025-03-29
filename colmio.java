import java.util.Scanner;

public class NumeroVampiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el límite inferior del rango:");
        int limiteInferior = scanner.nextInt();
        System.out.println("Ingrese el límite superior del rango:");
        int limiteSuperior = scanner.nextInt();

        int numeroVampiro = encontrarNumeroVampiro(limiteInferior, limiteSuperior);
        if (numeroVampiro != -1) {
            System.out.println("El primer número vampiro dentro del rango es: " + numeroVampiro);
        } else {
            System.out.println("No se encontró ningún número vampiro dentro del rango.");
        }
    }

    public static int encontrarNumeroVampiro(int limiteInferior, int limiteSuperior) {
        int numeroVampiro = -1;
        do {
            limiteInferior++;
            if (esNumeroVampiro(limiteInferior)) {
                numeroVampiro = limiteInferior;
                break;
            }
        } while (limiteInferior <= limiteSuperior);
        return numeroVampiro;
    }

    public static boolean esNumeroVampiro(int numero) {
        int longitud = String.valueOf(numero).length();
        if (longitud % 2 != 0) {
            return false;
        }
        int mitadLongitud = longitud / 2;
        for (int i = (int) Math.pow(10, mitadLongitud - 1); i < (int) Math.pow(10, mitadLongitud); i++) {
            int posibleColmillo2 = numero / i;
            if (posibleColmillo2 * i == numero && esColmilloValido(i, posibleColmillo2, numero)) {
                return true;
            }
        }
        return false;
    }

    public static boolean esColmilloValido(int colmillo1, int colmillo2, int numero) {
        String concatenacion = String.valueOf(colmillo1) + String.valueOf(colmillo2);
        String numeroCadena = String.valueOf(numero);
        for (char c : numeroCadena.toCharArray()) {
            if (!concatenacion.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}
