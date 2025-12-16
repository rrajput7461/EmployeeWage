import java.util.Random;

public class EmployeeWage {

    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int WAGE_PER_HOUR = 20;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    public static void calculateWageTillCondition() {

        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        Random random = new Random();

        while (totalDays < MAX_WORKING_DAYS && totalHours < MAX_WORKING_HOURS) {

            totalDays++;
            int empHours;
            int empCheck = random.nextInt(3);

            switch (empCheck) {
                case IS_FULL_TIME:
                    empHours = 8;
                    break;

                case IS_PART_TIME:
                    empHours = 4;
                    break;

                default:
                    empHours = 0;
            }

            if (totalHours + empHours > MAX_WORKING_HOURS) {
                empHours = MAX_WORKING_HOURS - totalHours;
            }

            totalHours += empHours;
            totalWage += empHours * WAGE_PER_HOUR;
        }

        System.out.println("Total Working Days: " + totalDays);
        System.out.println("Total Working Hours: " + totalHours);
        System.out.println("Total Monthly Wage: " + totalWage);
    }
}
