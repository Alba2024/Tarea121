public class PuntoMain {
   
    public static void main(String[] args) {
        Punto p = new Punto(3, 4);
        System.out.println("Coordenadas Cartesianas: " + java.util.Arrays.toString(p.coord_cartesianas()));
        System.out.println("Coordenadas Polares: " + java.util.Arrays.toString(p.coord_polares()));
        System.out.println(p);
    }   
}