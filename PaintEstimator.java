import java.util.Scanner;
import java.lang.Math;     // Note: Needed for math functions in part (3)
public class PaintEstimator {
   public static void main(String[] args) {
      try(Scanner scnr = new Scanner(System.in)){
         double wallHeight;
         double wallWidth;
         double wallArea;
         final double GALLONS_NEEDED;
         int gallonsToBuy;
         
         //   Get wall height from User
         System.out.println("Enter wall height (feet):");
         wallHeight = scnr.nextDouble();
         
         //   Get wall width from User
         System.out.println("Enter wall width (feet):");
         wallWidth = scnr.nextDouble();                     
         
         // Calculate and output wall area (A = W*H)
         wallArea = (wallWidth * wallHeight);  
         System.out.println("Wall area: " + wallArea);    
         
         //  Assume a gallon of paint covers 350 square feet.
         GALLONS_NEEDED = (wallArea / 350); /* It might make sense to Round Up Here */
         System.out.println("Paint Needed: " + GALLONS_NEEDED + " gallons");
         
         // Calculate and output the number of 1 gallon cans needed to paint
         gallonsToBuy = (int)Math.ceil(GALLONS_NEEDED); /* Math.ceil rounds a float up to the nearest whole number */
         System.out.println(gallonsToBuy + " can(s)");
       }
      }
}