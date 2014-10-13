import java.util.Scanner;

public class PhoneNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a ten digit number:");
        String numString = input.next();
        
        String part1 = numString.substring(0,3);
        String part2 = numString.substring(3,6);
        String part3 = numString.substring(6);
        
        String areaCode = "(" + part1 + ") ";
        String formattedNum = areaCode + part2 + "-" + part3;
        
        System.out.println(formattedNum);
    }
}