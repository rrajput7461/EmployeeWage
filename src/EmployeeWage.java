import java.util.Random;

public class EmployeeWage {

    public static void calculatePartTimeWage() {
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int WAGE_PER_HOUR = 20;

        int empHours = 0;
        Random random = new Random();
        int empCheck = random.nextInt(3);

        if (empCheck == IS_FULL_TIME)
            empHours = 8;
        else if (empCheck == IS_PART_TIME)
            empHours = 4;
        else
            empHours = 0;

        int wage = empHours * WAGE_PER_HOUR;
        System.out.println("Employee Wage: " + wage);
    }
}
