package co.edu.sena.oop_2902274;

import java.util.Scanner;

/**
 * Hello world!
 *
30 */
public class App 
{
    public static void main( String[] args )
    {
        // Area del triangulo
        // entradas
        System.out.println( "1.Calcular el area de un triangulo" );
        System.out.println( "Ingrese la base del triangulo" );

        Scanner src = new Scanner(System.in);
        double base = src.nextDouble();

        System.out.println( "Ingrese la altura del triangulo" );
        double height = src.nextDouble();

        //proceso
        double result1 = (base * height) / 2;

        //salida
        System.out.println("El area del triangulo es:" + result1);


        //Suma de numeros
        System.out.println( "2.Ingresar dos numeros por tecaldo y sumarlos" );
        System.out.println( "Ingrese el primer número" );

        Scanner suma = new Scanner(System.in);
        double num1 = src.nextDouble();

        System.out.println( "Ingrese el segundo número" );
        double num2 = src.nextDouble();

        //proceso
        double result2 = (num1 + num2);

        //salida
        System.out.println("La suma de los dos numeros ingresados son:" + result2);


        //Numero elevado al cuadrado
        System.out.println( "3. Ingresar un numero y visualizar el numero elevado al cuadrado " );
        System.out.println( "Ingrese el número" );

        Scanner elevado = new Scanner(System.in);
        double numelev = src.nextDouble();

        //proceso
        double result3 = (numelev * numelev);

        //salida
        System.out.println("El resultado del numero elevado al cuadrado es:" + result3);20
    }

}
