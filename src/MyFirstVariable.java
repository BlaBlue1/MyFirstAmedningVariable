import java.util.Scanner;

public class MyFirstVariable {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int num1, num2;
        int annualSalary = 62000;
        float increment = 0.1F;
        float firstYearSalary = annualSalary + (annualSalary* increment);
        float secondYearSalary = firstYearSalary + (firstYearSalary * increment);
        float thirdYearSalary = secondYearSalary + (secondYearSalary * increment);
        float fourthYearSalary = thirdYearSalary + (thirdYearSalary * increment);
        float fifthYearSalary = fourthYearSalary + (fourthYearSalary * increment);
        System.out.print("Fifth year salary is: " + fifthYearSalary );
        keyboard.nextLine();

        System.out.print("What is your current Salary? ");
        num1 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("How many years did you work? ");
        num2 = keyboard.nextInt();
        keyboard.nextLine();



    }
}
