/*
Importar libreria de la clase
Scanner para leer la entrada de datos
 */
import java.util.Scanner;

//Clase PrimosFibonnaci
public class PrimosFibonnaci {
    //Variable global
    static int posicion=0;

    //Clase principal
    public static void main(String[] arg) {
        //Instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);

        //Imprimir mensajes y llamar métodos
        int cantidadCalcular;
        System.out.print("\n"+"Ingresa la cantidad de números primos a calcular: ");
        cantidadCalcular = sc.nextInt();
        System.out.println("-.-.-.-.-Números primos-.-.-.-.- ");
        imprimir(primo(cantidadCalcular));

        System.out.print("\n"+"Ingresa la cantidad de números fibonacci a calcular: ");
        cantidadCalcular = sc.nextInt();
        System.out.println("-.-.-.-.-Sucesión Fibonacci-.-.-.-.- ");
        imprimir(fibonacci(cantidadCalcular));
    }

    //Método para calcular números primos
    private static int[] primo(int cantidadCalcular){
        int  contador = 2;
        int sucesion[] = new int[cantidadCalcular];

        do {
            boolean respuesta = true;
            int m = 2;
            while ((respuesta) && (m < contador)) {
                if ((contador % m) == 0) {
                    respuesta = false;
                } else {
                    m = m + 1;
                }
            }
            if (respuesta) {
                sucesion[posicion] = contador;
                posicion++;
            }
            contador++;
        } while (posicion < cantidadCalcular);
        return sucesion;
    }

    //Método de la suceción Fibonacci
    private static int[] fibonacci(int cantidadCalcular) {

        int num1 = 0, num2 = 1, suma = 1;
        posicion = 0;
        int sucesion[] = new int[cantidadCalcular];
        sucesion[posicion] = num1;

        for (int i = 0; i < cantidadCalcular - 1; i++) {
            posicion++;
            sucesion[posicion] = suma;
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
        posicion++;
        return sucesion;
    }

    //Método para imprimir los arreglos
    private static void imprimir(int sucesion[]){
        for (int i = 0; i < posicion; i++) {
            System.out.print(sucesion[i] + ", ");
        }
        System.out.println();
    }
}
