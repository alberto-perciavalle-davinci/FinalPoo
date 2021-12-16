public class Main {
    public static void main(String[] args) {

        //PUNTOS
        Punto3D primerPunto = new Punto3D(7,3,2);
        Punto3D segundoPunto= new Punto3D(2,3,7);
        Punto3D tercerPunto = new Punto3D(4);

        System.out.println(primerPunto);
        System.out.println(segundoPunto);
        System.out.println(tercerPunto);

        //DISTANCIA AL ORIGEN
        System.out.println(segundoPunto.calcularDistanciaOrigen());

        //DISTANCIA A OTRO PUNTO
        System.out.println(segundoPunto.calcularDistanciaOtroPunto(0, 0, 0));
        System.out.println(segundoPunto.calcularDistanciaOtroPunto(primerPunto));

        Vector3D primerVector = new Vector3D(primerPunto, segundoPunto);
        Vector3D segundoVector = new Vector3D(tercerPunto);

        System.out.println(primerVector);
        System.out.println(segundoVector);
        System.out.println(primerVector.calcularMagnitud());
        System.out.println(segundoVector.calcularMagnitud());
        primerVector.mostrarComponentes();
        segundoVector.mostrarComponentes();

    }
}
