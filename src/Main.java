import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ---------- Ejercicio 1 ----------
        int numero = 1;
        do {
            System.out.printf("Iteración %d\n", numero);
            numero++;
        } while (numero <= 50);

        /*
        // ---------- Ejercicio 2 ----------
        
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa un número");
        numero = sc.nextInt();

        // Parte 1
        for (int i = 0; i <= numero + 2; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Parte 2
        for (int i = 1; i <= numero + 4; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

        // ---------- Ejercicio 3 ----------

        Scanner sc = new Scanner(System.in);
        int numero;
        int resultado = 0;

        System.out.println("Ingresa un número");
        numero = sc.nextInt();

        // Parte 1
        for (int i = 0; i <= numero ; i++) {
            if(i % 2 == 1) {
                resultado+=i;
            }
        }

        System.out.printf("El resultado es: %d", resultado);

        // Parte 2
        int numero1;
        int numero2;
        int resultado = 0;

        System.out.println("Ingresa el primer número");
        numero1 = sc.nextInt();

        System.out.println("Ingresa el segundo número");
        numero2 = sc.nextInt();

        for (int i = numero1; i <= numero2 ; i++) {
            if(i % 2 == 1) {
                resultado+=i;
            }
        }

        System.out.printf("El resultado del intérvalo %d a %d es: %d", numero1, numero2, resultado);

        // ---------- Ejercicio 4 ----------

        Scanner sc = new Scanner(System.in);
        int n_anterior = 0;
        int n_actual = 1;

        System.out.println("Ingresa un número");
        int numero = sc.nextInt();

        for (int i = 0; i <= numero; i++) {
            System.out.print(n_anterior + " ");

            int n_siguiente = n_anterior + n_actual;
            n_anterior = n_actual;
            n_actual = n_siguiente;
        }
        */
    }
}