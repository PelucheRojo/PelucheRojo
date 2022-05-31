import java.util.Scanner;

public class Figura
{
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la figura: ");
        int n=lea.nextInt();

        for(int i=0;i<n;i++)
        {
                System.out.print("*");
            }
            System.out.println("");
        

        for(int i=0;i<n-2;i++)
        {
            System.out.print("*");
            for (int l=0;l<n-2;l++)
            {
                System.out.print("");
            }
            System.out.println("*");
        }
        for(int i=0;i<n;i++)
        {
                System.out.print("*");
            }
            System.out.println("");
        
    }
}
