public class EmployeeWageComputation {

    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int MAX_HOURS = 100;
    public static final int MAX_DAYS = 20;

    public static void main(String[] args) {

        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < MAX_HOURS && totalDays < MAX_DAYS) {

            totalDays++;

            int empCheck = (int) (Math.random() * 3);

            int empHrs;

            switch (empCheck) {

                case 1:
                    empHrs = 4;
                    break;

                case 2:
                    empHrs = 8;
                    break;

                default:
                    empHrs = 0;
            }

            totalHours += empHrs;
        }

        int totalWage = totalHours * EMP_RATE_PER_HOUR;

        System.out.println("Total Wage : " + totalWage);
    }
}