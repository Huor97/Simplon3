//exo4
import java.util.Scanner;

public class Doublon {
	public void main(String[] args) {
		try (Scanner Scanner = new Scanner(System.in)){
			System.out.print("rentrer");
			System.out.println("a =");
			int a = Scanner.nextInt();
			System.out.println("b =");
			int b = Scanner.nextInt();
			System.out.println("c =");
			int c = Scanner.nextInt();
			Scanner.close();
			if (a == b && b == c && a == c)
			{
				System.out.println("ce n'est pas different :");
			}else if (a != b && b != c && a != c);
			{
				System.out.println("c'est different :");
			}
			
		}
	}

}
	
