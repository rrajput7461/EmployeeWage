import java.util.Random;

public class EmployeeWage {

    public static void calculateDailyWage() {
        int IS_PRESENT = 1;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;

        Random random = new Random();
        int empCheck = random.nextInt(2);

        int dailyWage = (empCheck == IS_PRESENT)
                ? WAGE_PER_HOUR * FULL_DAY_HOUR
                : 0;

        System.out.println("Daily Employee Wage: " + dailyWage);
    }
}
