import java.util.Random;

public class EmployeeWage {

    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int WAGE_PER_HOUR = 20;
    static final int WORKING_DAYS = 20;

    public static void calculateMonthlyWage() {

        int totalWage = 0;
        Random random = new Random();

        for (int day = 1; day <= WORKING_DAYS; day++) {

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

            int dailyWage = empHours * WAGE_PER_HOUR;
            totalWage += dailyWage;
        }

        System.out.println("Total Monthly Wage: " + totalWage);
    }
}
