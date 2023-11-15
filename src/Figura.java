import java.util.ArrayList;
import java.util.List;

public class Figura {

    public double permitro,area,volumen;

    public List<Punto> listaPuntos = new ArrayList<>();



    public Figura(double permitro, double area, double volumen, List<Punto> listaPuntos) {
        this.permitro = permitro;
        this.area = area;
        this.volumen = volumen;
        this.listaPuntos = listaPuntos;
    }

    public Figura() {
    }


    public void imprimirArea(String figura){
        System.out.println("El area del "+figura+" es: "+area);
    }

    public void imprimirPerimetro(String figura){
        System.out.println("El perimetro del "+figura+" es: "+permitro);
    }

    public void imprimirVolumen(String figura){
        System.out.println("El volumen del "+figura+" es: "+volumen);
    }


    double calculoDistancia(Punto punto1, Punto punto2){
        //con el punto que instancio menos otro unbto
        double dist = Math.sqrt(Math.pow(punto1.getX()- punto2.getX(),2)+Math.pow(punto1.getY()- punto2.getY(),2));
        return dist;
    }


    public double getPermitro() {
        return permitro;
    }

    public void setPermitro(double permitro) {
        this.permitro = permitro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolumen() {return volumen;}

    public void setVolumen(double volumen) {this.volumen = volumen;}

    public List<Punto> getListaPuntos() {
        return listaPuntos;
    }

    public void setListaPuntos(List<Punto> listaPuntos) {
        this.listaPuntos = listaPuntos;
    }
}
