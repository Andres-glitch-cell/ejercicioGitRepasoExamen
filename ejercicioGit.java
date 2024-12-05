import java.util.Scanner;

import static java.lang.System.in;

public class ejercicioGit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        int opcion;
        int num1;
        int num2;
        int resultado;


        do {

            System.out.println("");
            System.out.println("Elige una opcion: ");
            System.out.println("");

            System.out.println("1. Sumar dos números:");
            System.out.println("2. Restar dos números.");
            System.out.println("3. Multiplicar dos números.");
            System.out.println("4. Dividir dos números.");
            System.out.println("5. Salir.");
            opcion = sc.nextInt();

            switch (opcion) {


                case 1:


                case 2:


                case 3:


                case 4:
                    System.out.println("Introduce un número para dividir: ");
                    num1 = sc.nextInt();
                    System.out.println("Introduce el segundo número para dividir: ");
                    num2 = sc.nextInt();
                    resultado = num1 / num2;
                    System.out.println("El resultado de tu división es "+resultado);

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Has introducido un número incorrecto");
                    break;
            }

        } while (opcion != 5);

    }
}
