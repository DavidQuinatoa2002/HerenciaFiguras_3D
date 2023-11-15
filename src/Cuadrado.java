import java.util.Scanner;

public class Cuadrado extends Figura {

    public Cuadrado() {
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


        //mando a llamar desde p1 a p2 pa la distancia
        double l1 = p1.calculoDistancia(p2);


        this.permitro = l1*4;
        return this.permitro;
    }

    double calcularArea(){
        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);


        //mando a llamar desde p1 a p2 pa la distancia
        double l1 = p1.calculoDistancia(p2);


        this.area = Math.pow(l1,2);
        return this.area;
    }
}
