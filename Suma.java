import java.util.Scanner;

public class Suma
{
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int n1;
	int n2;
	int n3;

	System.out.println("Escriba el primer numero:");
	n1=entrada.nextInt();

	System.out.println("Esceriba el segundo numero:");
	n2=entrada.nextInt();

	n3=n1+n2;

	System.out.printf("La suma es %d%n",n3);

}
}
