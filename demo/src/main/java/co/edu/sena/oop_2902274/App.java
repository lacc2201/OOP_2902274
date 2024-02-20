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
        // entradas
        System.out.println( "1.Calcular el area de un triangulo" );
        System.out.println( "Ingrese la base del triangulo" );

        Scanner src = new Scanner(System.in);
        double base = src.nextDouble();

        System.out.println( "Ingrese la altura del triangulo" );
        double height = src.nextDouble();

        //proceso
        double result = (base * height) / 2;

        //salida
        System.out.println("El area del triangulo es:" );
    }

    public static void main( String[] args )
    {
        // entradas
        System.out.println( "1.Calcular el area de un triangulo" );
        System.out.println( "Ingrese la base del triangulo" );

        Scanner src = new Scanner(System.in);
        double base = src.nextDouble();

        System.out.println( "Ingrese la altura del triangulo" );
        double height = src.nextDouble();

        //proceso
        double result = (base * height) / 2;

        //salida
        System.out.println("El area del triangulo es:" );
    }
}
