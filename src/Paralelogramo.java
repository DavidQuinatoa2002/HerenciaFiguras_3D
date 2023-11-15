import java.util.Scanner;

public class Paralelogramo extends Rectangulo{

    public Paralelogramo() {
    }

    double calcularVolumen(){
        calcularArea();

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura: ");
        double altura = sc.nextDouble();

        this.volumen = area*altura;
        return this.volumen;
    }
}
