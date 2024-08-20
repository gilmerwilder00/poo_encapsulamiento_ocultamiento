package modelos;

public class Rectangulo {
    
    // Atributos privados 
    private double ancho;
    private double alto;

    // Constructores
    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo(){

    }

    // getters and setters
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    // metodo público para obtener el area
    public double area(){
        return ancho*alto;
    }

    // metodo público para oobtener el perímetro
    public double perimetro(){
        return 2*(ancho+alto);
    }

    // metodo público para imprimir datos;
    public void imprimirDatos(){
        System.out.println();
        System.out.println("Datos del rectángulo:");
        System.out.println("Ancho: " + this.ancho);
        System.out.println("Alto: " + this.alto);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
        System.out.println();
    }

    

}
