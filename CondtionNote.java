//exo3
import java.util.Scanner;

public class CondtionNote {
	public void main(String[] args) {
		try(Scanner Scaner = new Scanner(System.in)){
			System.out.print("rentre des nombre SVP :\n");
			int a = Scaner.nextInt();
			
			if (a < 8)
			{
				System.out.printf("ajourné");
			}else if (a <= 10)
			{
				System.out.printf("rattrapage");
			}else
			{
				System.out.printf("admis");
			}
		}
	}
}
