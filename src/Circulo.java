import java.util.Scanner;

public class Circulo extends Figura{

    public Circulo() {
    }

    void ingresarPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        for(int i=0; i<2; i++){
            System.out.println("Ingrese el componente X el punto: "+i);
            double x = sc.nextDouble();
            System.out.println("Ingrese el componente y el punto: "+i);
            double y = sc.nextDouble();
            Punto punto = new Punto(x,y);
            this.listaPuntos.add(punto);
        }

    }

    double calcularPerimetro(){
        //extraigo puntos
        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);


        //mando a llamar desde p1 a p2 pa la distancia
        double r = p1.calculoDistancia(p2);

        this.permitro = 2*r*Math.PI;
        return this.permitro;
    }

    double calcularArea(){
        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);

        //mando a llamar desde p1 a p2 pa la distancia
        double r = p1.calculoDistancia(p2);

        this.area = Math.PI*Math.pow(r,2);
        return this.area;


    }
}