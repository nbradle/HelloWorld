import java.util.Scanner;
import java.lang.Math; 
public class PaintEstimator {
	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      double wallHeight;
	      double wallWidth;
	      double wallArea;
	      double gallonsNeeded;
	      int cansNeeded;
	      
	      System.out.println("Enter wall height (feet):");
	      wallHeight = scnr.nextDouble();
	       System.out.println("Enter wall width (feet):");
	      wallWidth = scnr.nextDouble();                     // FIXME (1): Prompt user to input wall's width
	      wallArea = wallWidth*wallHeight;
	      System.out.println(""+"Wall area: "+ wallArea +" square feet" );
	      gallonsNeeded=wallArea/350;
	      System.out.println(""+ "Paint needed: " + gallonsNeeded +" gallons");
	      cansNeeded = (int)(gallonsNeeded);
	      System.out.println(""+"Cans needed: "+ (cansNeeded+1) +" can(s)");
}
}
