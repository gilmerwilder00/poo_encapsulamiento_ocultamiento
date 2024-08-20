import java.util.Scanner;

import modelos.Rectangulo;
import modelos.Triangulo;
import modelos.Circulo;
import modelos.Punto;
import modelos.Libro;

public class App {

    public static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Avanzando con las figuras geométricas
        // actividad1();

        // Plano X - Y
        // actividad2();

        // Ejercicio Complementario
        ejercicioComplementario();

        myScanner.close();
    }

    public static void actividad1() {
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
    }

    // Plano X - Y
    public static void actividad2() {
        Punto puntoA = new Punto();
        Punto puntoB = new Punto();
        Punto puntoC = new Punto();

        puntoA.setX(1);
        puntoA.setY(2);

        puntoB.setX(2);
        puntoB.setY(4);

        puntoC.setX(3);
        puntoC.setY(6);

        System.out.println();

        System.out.println("Distancia desde origen (0,0) al punto A(1,2): " + puntoA.distanciaDesdeOrigen());
        System.out.println("Distancia entre punto A(1,2) y B(2,4) es : " + Punto.calcularDistancia(puntoA, puntoB));

        if (Punto.estanAlineados(puntoA, puntoB, puntoC)) {
            System.out.println("Los puntos A(1,2), B(2,4) y C(3,6) estan alineados.");
        } else {
            System.out.println("Los puntos A(1,2), B(2,4) y C(3,6) no estan alineados.");
        }

        System.out.println();
    }

    public static void ejercicioComplementario() {
        Libro[] libros = new Libro[4];

        // Primer libro
        Libro libro1 = new Libro();
        libro1.setTitle("La ciudad y los perros");
        libro1.setAuthor("Mario Vargas Llosa");
        libro1.setPages(80);
        libros[0] = libro1;

        // Segundo libro
        Libro libro2 = new Libro();
        libro2.setTitle("Cien años de soledad");
        libro2.setAuthor("Gabriel García Márquez");
        libro2.setPages(41);
        libros[1] = libro2;

        // Tercer libro
        Libro libro3 = new Libro();
        libro3.setTitle("Don Quijote de la Mancha");
        libro3.setAuthor("Miguel de Cervantes");
        libro3.setPages(86);
        libros[2] = libro3;

        // Cuarto libro
        Libro libro4 = new Libro();
        libro4.setTitle("El amor en los tiempos del cólera");
        libro4.setAuthor("Gabriel García Márquez");
        libro4.setPages(34);
        libros[3] = libro4;

        // Imprimir libros
        imprimirLibros(libros);
        
    }

    public static void imprimirLibros(Libro[] libros){
        System.out.println();
        System.out.println("Libros: ");
        for (Libro libro : libros) {
            System.out.println("-" + libro.getTitle());
        }
        System.out.println();
    }

}
