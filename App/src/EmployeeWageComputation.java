public class EmployeeWageComputation {

    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {

        int dailyWage = EMP_RATE_PER_HOUR * FULL_DAY_HOUR;

        System.out.println("Daily Employee Wage : " + dailyWage);
    }
}