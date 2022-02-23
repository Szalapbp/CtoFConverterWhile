import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
	double degreesC = 0;

        System.out.print("");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter degrees C to be converted to degrees F: ");
        degreesC = in.nextDouble();

        System.out.println(degreesC + " degrees C is " + (degreesC * 1.8 + 32) + " in degrees F.");



    }
}
