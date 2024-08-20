package modelos;

public class Triangulo {
    
    // atributos
    private double base;
    private double altura;

    //constructores
    
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(){

    }

    // getters y setters

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // método publico para obtener el área

    public double area(){
        return (base*altura)/2;
    }

    // metodo para imprimir datos
    public void imprimirDatos(){
        System.out.println();
        System.out.println("Datos del triángulo:");
        System.out.println("Base: " + this.base);
        System.out.println("Altura: " + this.altura);
        System.out.println("Área: " + area());
        System.out.println();
    }
    

}
