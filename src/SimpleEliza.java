import java.util.Scanner;

public class SimpleEliza
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Good day!");
        System.out.println("What is your problem?" + "\n" + "Enter your response here or Q to quit.");
        String response = keyboard.nextLine();



        while ((!response.equalsIgnoreCase("q")) && (!response .equals("I am feeling great"))) {
            System.out.println(response + "?");
            System.out.println("Enter your response here or Q to quit.");
            response=keyboard.nextLine();
        }
        keyboard.close();


    }
}





