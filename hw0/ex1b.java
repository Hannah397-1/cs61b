/*methods */
public class TriangleDrawer {
   public static void drawTriangle(int N) {
     int row = 0;
     int vol = 0;
     while (row < N) {
       vol = 0;
       while (vol <= row) {
         System.out.print('*');
         vol = vol + 1;
       }
       row = row + 1;
       System.out.println();
     }
   }
   
   public static void main(String[] args) {
      drawTriangle(5);
   }
}
