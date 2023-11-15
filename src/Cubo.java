public class Cubo extends Cuadrado{

    public Cubo() {
    }

    double calcularVolumen(){
        calcularArea();
        double lado = Math.sqrt(area);
        this.volumen = Math.pow(lado,3);
        return volumen;
    }

}
