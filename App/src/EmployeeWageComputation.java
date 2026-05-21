public class EmployeeWageComputation {

    static final int EMP_RATE_PER_HOUR = 20;

    public static int computeEmpWage(int hours) {
        return hours * EMP_RATE_PER_HOUR;
    }

    public static void main(String[] args) {

        int wage = computeEmpWage(8);

        System.out.println("Employee Wage : " + wage);
    }
}