public class Main {
    public static void main(String[] args) {

        /*
        Circulo c1 = new Circulo();
        c1.ingresarPuntos();
        double areaC1 = c1.calcularArea();
        double perimetroC1 = c1.calcularPerimetro();
        c1.imprimirArea("Circulo 1");
        c1.imprimirPerimetro("Circulo 1");
        */
////////////////////////
        /*
        Triangulo t1 = new Triangulo();
        t1.ingresarPuntos();
        t1.calcularPerimetro();
        t1.calcularArea();

        Prisma p1 = new Prisma();
        p1.calcularVolumen();
        t1.imprimirPerimetro("Triangulo 1");
        t1.imprimirArea("Triangulo 1");
        t1.imprimirVolumen("Triangulo 1");
        */
///////////////////////////////////

        //Triangulo t1 = new Triangulo();
        Prisma p1 = new Prisma();
        System.out.println("Ingrese datos del triangulo: ");
        p1.ingresarPuntos();
        double periP1 = p1.calcularPerimetro();
        double areaP1 = p1.calcularArea();
        double volP1 = p1.calcularVolumen();

        p1.imprimirPerimetro("Triangulo 1");
        p1.imprimirArea("Triangulo 1");
        p1.imprimirVolumen("Triangulo 1");

    }
}