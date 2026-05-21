public class EmployeeWageComputation {

    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int WORKING_DAYS = 20;
    public static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {

        int totalWage = WORKING_DAYS * FULL_DAY_HOUR * EMP_RATE_PER_HOUR;

        System.out.println("Monthly Wage : " + totalWage);
    }
}