import java.util.Scanner;

public class MyFirstVariable {
    public static void main(String[] args)
    {

        int annualSalary = 62000;
        float increment = 0.1F;
        float firstYearSalary = annualSalary + (annualSalary* increment);
        float secondYearSalary = firstYearSalary + (firstYearSalary * increment);
        float thirdYearSalary = secondYearSalary + (secondYearSalary * increment);
        float fourthYearSalary = thirdYearSalary + (thirdYearSalary * increment);
        float fifthYearSalary = fourthYearSalary + (fourthYearSalary * increment);
        System.out.print(fifthYearSalary);
        


    }
}
