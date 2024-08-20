package modelos;

public class Punto {
    private double x;
    private double y;


    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double distanciaDesdeOrigen(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static double calcularDistancia (Punto puntoA, Punto puntoB ){
        return Math.sqrt(Math.pow(puntoA.x - puntoB.x, 2) + Math.pow( puntoA.y - puntoB.y , 2));
    }

   

    
}
