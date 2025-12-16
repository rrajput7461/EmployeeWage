import java.util.Random;

public class EmployeeWage {

    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int WAGE_PER_HOUR = 20;
    public static void calculateWageUsingSwitch() {
        int empHours;
        Random random = new Random();
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
        int wage = empHours * WAGE_PER_HOUR;
        System.out.println("Employee Wage: " + wage);
    }
}
