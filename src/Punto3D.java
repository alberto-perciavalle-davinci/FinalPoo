public class Punto3D {

    //ATRIBUTOS
    double x, y, z;

    //CONSTRUCTORES
    public Punto3D (double x, double y , double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Punto3D(double w){
        this.x = w;
        this.y = w;
        this.z = w;
    }

    public Punto3D(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    //METODOS
    public double calcularDistanciaOrigen(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    public double calcularDistanciaOtroPunto(double x, double y, double z){
        return Math.sqrt(Math.pow(x-this.x,2)+ Math.pow(y-this.y,2) + Math.pow(z-this.z,2));
    }

    public double calcularDistanciaOtroPunto(Punto3D punto3D){
        return Math.sqrt(Math.pow(punto3D.x-this.x,2) + Math.pow(punto3D.y-this.y,2) + Math.pow(punto3D.z-this.z,2));
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ", " + z + ")";}
    }



