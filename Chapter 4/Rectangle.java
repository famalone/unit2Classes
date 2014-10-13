import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the length for the rectangle: ");
        double length = input.nextDouble();
        
        System.out.println("enter the width for the rectangle: ");
        double width = input.nextDouble();
        
        
        double area = length * width;
        double perimeter = (2 * length) + (2 * width);
        double diagonalLength = Math.sqrt(Math.pow(length,2) + Math.pow(width,2));
        diagonalLength = Math.round(diagonalLength);
        
        System.out.println("Area: ");
        System.out.println(area);
        
        System.out.println("Perimeter: ");
        System.out.println(perimeter);
        
        System.out.println("Diagonal Length: ");
        System.out.println(diagonalLength);
    }
}