public class EmployeeWageMain {

    public static void main(String[] args) {

        EmpWageBuilder empWageBuilder = new EmpWageBuilder();

        empWageBuilder.addCompanyEmpWage("TCS", 20, 20, 100);

        empWageBuilder.addCompanyEmpWage("Infosys", 25, 22, 120);

        empWageBuilder.computeEmpWage();

        System.out.println("\nQueried Wage:");

        System.out.println("TCS Total Wage = "
                + empWageBuilder.getTotalWage("TCS"));

        System.out.println("Infosys Total Wage = "
                + empWageBuilder.getTotalWage("Infosys"));
    }
}