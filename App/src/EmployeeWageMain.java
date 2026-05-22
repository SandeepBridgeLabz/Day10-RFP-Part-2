public class EmployeeWageMain {

    public static void main(String[] args) {

        EmpWageBuilder empWageBuilder = new EmpWageBuilder();

        empWageBuilder.addCompanyEmpWage("TCS", 20, 20, 100);
        empWageBuilder.addCompanyEmpWage("Infosys", 25, 22, 120);

        empWageBuilder.computeEmpWage();
    }
}