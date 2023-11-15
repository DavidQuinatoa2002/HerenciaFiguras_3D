public class Esfera extends Circulo{

    public Esfera() {
    }

    double calcularVolumen(){
        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);

        //mando a llamar desde p1 a p2 pa la distancia
        double r = p1.calculoDistancia(p2);

        this.volumen = Math.PI*Math.pow(r,3)*4/3;
        return this.volumen;
    }

}
