public class EmployeeWageComputation {

    public static int computeEmpWage(String company,
                                     int empRatePerHour,
                                     int workingDays,
                                     int maxHours) {

        int totalWage = empRatePerHour * workingDays * maxHours / 8;

        System.out.println(company + " Wage : " + totalWage);

        return totalWage;
    }

    public static void main(String[] args) {

        computeEmpWage("TCS", 20, 20, 100);
        computeEmpWage("Infosys", 25, 22, 120);
    }
}