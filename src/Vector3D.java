public class Vector3D {

    //ATRIBUTOS
    Punto3D puntoInicial = new Punto3D();
    Punto3D puntoFinal = new Punto3D();


    //CONSTRUCTORES
    public Vector3D(Punto3D puntoInicial, Punto3D puntoFinal) {
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;
    }

    public Vector3D(Punto3D puntoFinal) {
        this.puntoFinal = puntoFinal;
        puntoInicial.y=0;
        puntoInicial.x=0;
        puntoInicial.z=0;
    }

    //METODOS
    public double calcularMagnitud() {
        return Math.sqrt(Math.pow(this.puntoFinal.x-this.puntoInicial.x,2) + Math.pow(this.puntoFinal.y-this.puntoInicial.y,2) + Math.pow(this.puntoFinal.z-this.puntoInicial.z,2));
    }

    public void mostrarComponentes(){
        double vx, vy, vz;
        vx=puntoFinal.x-puntoInicial.x;
        vy=puntoFinal.y-puntoInicial.y;
        vz=puntoFinal.z-puntoInicial.z;
        System.out.println(vx);
        System.out.println(vy);
        System.out.println(vz);
    }

    @Override
    public String toString() {
        return "El vector comienza en el punto " + puntoInicial + " y termina en el punto " + puntoFinal;
    }
}