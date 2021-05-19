import java.util.*;
public class ACT4E4 {
public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	int num, cociente, resto; 
	
	System.out.println("Introduce un número");
		num = sc.nextInt();
		
		cociente = num/12;
		resto = num%12;
			
		System.out.println(num + " unidades son " + cociente + " docenas y " + resto + " unidades.");

	}
}