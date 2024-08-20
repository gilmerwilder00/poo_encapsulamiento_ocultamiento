package modelos;

public class Circulo {

    // Atributo
    private double radio;

    // constructores
    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    // Getters y setters

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // método para calcular el área
    public double area(){
        return Math.PI * Math.pow(radio, 2);
    }

    // método para calcular el perímetro 
    public double perimetro(){
        return 2*Math.PI*radio;
    }


    // metodo para imprimir datos
    public void imprimirDatos(){
        System.out.println();
        System.out.println("Datos del círculo:");
        System.out.println("Radio: " + this.radio);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
        System.out.println();
    }

}
