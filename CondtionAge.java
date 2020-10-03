//exo1
import java.util.Scanner;
public class CondtionAge {
	public static void main(final String[] args) {
		
		//exo1
		try (Scanner Scane = new Scanner(System.in)){
			System.out.print("vous êtes 'mineur' 'majeur' ou 'adulte' ? pour savoir rentre un numbre SVP :\n");
		int age = Scane.nextInt();
		if (age < 8)
		{
			System.out.printf("mineur\n");
		}else if (age <= 10)
		{
			System.out.printf("majeur\n");
		}else
		{
			System.out.printf("adulte\n");
		}
	}
		/*switch (age) {
		case 10:
		System.out.println("Mineur");
		break;
		case 18:
		System.out.println("Majeur");
		break;
		case 30:
		System.out.println("Adult");
        break;
		}*/		
		//exo2
		
		
		//exo3

		/*try (Scanner Scaner = new Scanner(System.in)){
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
		}*/
		//exo4
			
		//exo5
		}
	
}

