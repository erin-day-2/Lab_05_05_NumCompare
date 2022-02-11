public class Main
{

    public static void main(String[] args)
    {
	int numInput1 = 10;
    int numInput2 = 10;
    boolean numbersEqual = false;


    System.out.println("Please input a number.");
    System.out.println("The number you selected is "  + numInput1);

    System.out.println("Please input another number.");
    System.out.println("The other number you selected is "  + numInput2);

    if (numInput1 == numInput2)
    {
        System.out.println("The two numbers are equal!");
    }
    else if (numInput1 > numInput2)
    {
        System.out.println(numInput1 + " is greater than " + numInput2);
    }
    else if (numInput2 > numInput1)
    {
        System.out.println(numInput2 + " is greater than " + numInput1);
    }
    }
}
