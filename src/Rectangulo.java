import java.util.List;
import java.util.Scanner;

public class Rectangulo extends Figura{
    //extends, palabera reservada pa heredar

    /*public Rectangulo(double permitro, double area, List<Punto> listaPuntos) {
        super(permitro, area, listaPuntos);
        //super es para incializar los valores queheredo

    }*/

    public Rectangulo() {
    }

    void ingresarPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        for(int i=0; i<4; i++){
            System.out.println("Ingrese el componente X el punto: "+i+1);
            double x = sc.nextDouble();
            System.out.println("Ingrese el componente y el punto: "+i+1);
            double y = sc.nextDouble();
            Punto punto = new Punto(x,y);
            this.listaPuntos.add(punto);
        }

    }

    double calcularPerimetro(){
        //extraigo puntos
        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);
        Punto p3 = this.listaPuntos.get(2);
        Punto p4 = this.listaPuntos.get(3);

        //mando a llamar desde p1 a p2 pa la distancia
        double l1 = p1.calculoDistancia(p2);
        double l2 = this.calculoDistancia(p1,p3);

        this.permitro = l1*2+l2*2;
        return this.permitro;
    }

    double calcularArea(){
        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);
        Punto p3 = this.listaPuntos.get(2);


        //mando a llamar desde p1 a p2 pa la distancia
        double l1 = p1.calculoDistancia(p2);
        double l2 = this.calculoDistancia(p1,p3);

        this.area = l1+l2;
        return this.area;
    }

}
