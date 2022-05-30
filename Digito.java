import java.util.Scanner;

public class Digitos
{
    public static void main(String[] args) {
        int n1=0;
        int d2=0;
        int d3=0;
        int d4=0;
        int d5=0;

        int r1=0;
        int r2=0;
        int r3=0;
        int r4=0;
        int r5=0;

         n1=leerDatosEnterodeConsola();

         r1=n1/10;
         d1=r1%10;

         r2=r1/10;
         d2=r2%10;
         
         r3=r2/10;
         d3=r3%10;

         r4=r3/10;
         d4=r4%10;

         System.out.printf("Los digitos separados son: %d %d %d %d\n",d1, d2, d3, d4);
    }
    public static int leerDatosEnterodeConsola()
    {
        int n1=0;
        Scanner entrada= new Scanner(System.in);
        System.out.print("Digite un numero: ");
        n1= entrada.nextInt();
        return n1;
    }
}
