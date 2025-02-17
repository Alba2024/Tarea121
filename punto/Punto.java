public class Punto {
    private float x;
   private float y;

   public Punto(float x, float y) {
       this.x = x;
       this.y = y;
   }

   public float[] coord_cartesianas() {
       return new float[]{x, y};
   }

   public double[] coord_polares() {
       double r = Math.sqrt(x * x + y * y);
       double theta = Math.toDegrees(Math.atan2(y, x)); // Ángulo en grados
       return new double[]{r, theta};
   }

   @Override
   public String toString() {
       return "Punto(" + x + ", " + y + ")";
   }
}
