import java.util.Scanner;
public class Annuity
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a periodic payment: ");
        int PMT = scanner.nextInt();
        
        System.out.println("Enter a periodic interest as a decimal: ");
        double i = scanner.nextDouble();
        
        System.out.println("Enter the number of payments: ");
        int n = scanner.nextInt();
        
        double PV = PMT * (((Math.pow((1+i), n-1) - 1)/i)/Math.pow((1+i),n-1)+1);
        PV = Math.round(PV);
        System.out.println(PV);
    }
}