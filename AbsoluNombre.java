//exo2
import java.util.Scanner;

public class AbsoluNombre {
	  public static void main(String[] args) {
		  try(Scanner Scaner = new Scanner(System.in)){
			  System.out.println("rentre un nombre SVP pour avoir la nombre 'absolue' : ");
			  int a = Scaner.nextInt();
			
	    System.out.println(Math.abs(a));  
	    /*System.out.println(Math.abs());  
	    System.out.println(Math.abs()); */ 
	  }
}
}