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

        // Euros a dolares
        // entradas
        // Definir el valor actual de conversión de euros a dólares
        final double tasaConversion = 1.13;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca la cantidad en euros
        System.out.print("Introduce la cantidad en euros: ");
        double euros = scanner.nextDouble();

        // Calcular la cantidad equivalente en dólares
        double dolares = euros * tasaConversion;

        // Mostrar el resultado
        System.out.println(euros + " euros equivale a " + dolares + " dólares.");

        // Cerrar el scanner
        scanner.close();


        // Lado del cuadrado
        // entrada
        // Crear un objeto BufferedReader para leer la entrada del usuario
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Declarar variable para almacenar el lado del cuadrado
        double lado = 0;

        // Intentar leer la longitud del lado del cuadrado
        try {
            System.out.print("Introduce la longitud del lado del cuadrado: ");
            lado = Double.parseDouble(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer la entrada. Asegúrate de ingresar un número válido.");
            return; // Salir del programa si ocurre un error
        }

        // Calcular el área y el perímetro del cuadrado
        double area = lado * lado;
        double perimetro = 4 * lado;

        // Mostrar el área y el perímetro del cuadrado
        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);

        // Calculo del aréa de un cilindro
        // Definir los valores del radio y la altura del cilindro
        double radio = 3.0; // Ejemplo: radio de 3 unidades
        double altura = 5.0; // Ejemplo: altura de 5 unidades

        // Calcular el área lateral del cilindro
        double areaLateral = 2 * Math.PI * radio * altura;

        // Calcular el área total del cilindro
        double areaTotal = 2 * Math.PI * radio * (radio + altura);

        // Calcular el volumen del cilindro
        double volumen = Math.PI * radio * radio * altura;

        // Mostrar el resultado
        System.out.println("El área lateral del cilindro es: " + areaLateral);
        System.out.println("El área total del cilindro es: " + areaTotal);
        System.out.println("El volumen del cilindro es: " + volumen);

        //RADIO
         // Definir el radio de la circunferencia
        double radio = 5.0; // Por ejemplo, un radio de 5 unidades

        // Calcular la longitud de la circunferencia
        double longitud = 2 * Math.PI * radio;

        // Calcular el área del círculo inscrito
        double areaCirculoInscrito = Math.pow(Math.PI * radio, 2);

        // Mostrar los resultados
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área del círculo inscrito es: " + areaCirculoInscrito);
    }
    public class PromedioTresNumeros {
        public static void main(String[] args) {
            // Obtener la consola del sistema
            java.io.Console console = System.console();
    
            // Verificar si la consola está disponible
            if (console == null) {
                System.out.println("Ingresa los tres numero a continuacion");
                return;
            }
    
            // Pedir al usuario que ingrese los tres números uno por uno
            String input1 = console.readLine("Ingrese el primer número: ");
            String input2 = console.readLine("Ingrese el segundo número: ");
            String input3 = console.readLine("Ingrese el tercer número: ");
    
            // Convertir los valores de cadena a números
            double numero1 = Double.parseDouble(input1);
            double numero2 = Double.parseDouble(input2);
            double numero3 = Double.parseDouble(input3);
    
            // Calcular el promedio
            double promedio = (numero1 + numero2 + numero3) / 3;
    
            // Mostrar el resultado
            System.out.println("El promedio de los tres números es: " + promedio);
        }
    }
    
}
