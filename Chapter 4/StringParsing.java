import java.util.Scanner;

public class StringParsing
{
    public static void main(String[] args)
    {
        Scanner numIn = new Scanner(System.in);
        
        System.out.println("Enter a number between 1,000 and 999,999: ");
        String stringNum = numIn.next();
        int length = stringNum.length();
        int commaIndex = stringNum.indexOf(",");
        
        String thousand = new String();
        thousand = stringNum.substring(0,length - 4);
        String hundred = new String();
        hundred = stringNum.substring(commaIndex + 1);
        stringNum = thousand + hundred;
        
        System.out.println(stringNum);
    }
}