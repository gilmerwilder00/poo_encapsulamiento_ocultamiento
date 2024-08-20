import java.util.Scanner;

import modelos.Rectangulo;
import modelos.Triangulo;
import modelos.Circulo;

public class App {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int option = 4;

        do {
            System.out.println();
            System.out.println("1.Crear rectángulo");
            System.out.println("2.Crear triángulo");
            System.out.println("3.Crear circulo");
            System.out.println("4.Salir");
            System.out.print("Ingresa un numero para seleccionar una opción:");

            try {
                option = myScanner.nextInt();
            } catch (Exception e) {
                System.out.println("Ingresa un numero entero valido.");
            }
            

            switch (option) {
                case 1:
                    // Se intancia el rectángulo
                    Rectangulo rectangulo = new Rectangulo();

                    // Lectura de datos
                    System.out.print("Ingresa el ancho del rectángulo:");
                    double ancho = myScanner.nextDouble();
                    System.out.print("Ingresa el alto del rectángulo:");
                    double alto = myScanner.nextDouble();

                    // Seteo de datos
                    rectangulo.setAncho(ancho);
                    rectangulo.setAlto(alto);

                    // Impresion de datos
                    rectangulo.imprimirDatos();

                    break;

                case 2:
                    // Se intancia el rectángulo
                    Triangulo triangulo = new Triangulo();

                    // Lectura de datos
                    System.out.print("Ingresa base del triángulo:");
                    double base = myScanner.nextDouble();
                    System.out.print("Ingresa la altura del triángulo:");
                    double altura = myScanner.nextDouble();

                    // Seteo de datos
                    triangulo.setBase(base);
                    triangulo.setAltura(altura);

                    // Impresion de datos
                    triangulo.imprimirDatos();
                    break;

                case 3:
                    // Se intancia el ciculo
                    Circulo circulo = new Circulo();

                    // Lectura de datos
                    System.out.print("Ingresa el radio del circulo:");
                    double radio = myScanner.nextDouble();

                    // Seteo de datos
                    circulo.setRadio(radio);

                    // Impresion de datos
                    circulo.imprimirDatos();
                    break;

                default:
                    break;
            }
        } while (option != 4);

        myScanner.close();

    }

}
