import java.util.Scanner;

public class Circulo
{
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int n1;
    int c1;
    double d2;
    double r3;

	System.out.print("Escriba el Radio del circulo:");
	n1=entrada.nextInt();

    c1=n1*2;
    d2=(n1*33.14159)*2;
    r3=(n1*n1)*3.14159;

	System.out.printf("La circunferencia es: %d\n",c1);
    System.out.printf("El diametro es: %f\n",d2);
    System.out.printf("El radio es: %f",r3);
}
}
