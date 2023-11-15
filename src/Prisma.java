import java.util.Scanner;

public class Prisma extends Triangulo{

    public Prisma() {
    }


    double calcularVolumen(){
        calcularArea();

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura: ");
        double altura = sc.nextDouble();

        this.volumen = (area*altura)*1/3;
        return this.volumen;
    }

}
