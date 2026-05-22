public class EmpWageBuilder {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private CompanyEmpWage companyEmpWage;

    public void addCompanyEmpWage(String company,
                                  int empRatePerHour,
                                  int numOfWorkingDays,
                                  int maxHoursPerMonth) {

        companyEmpWage = new CompanyEmpWage(company,
                empRatePerHour,
                numOfWorkingDays,
                maxHoursPerMonth);
    }

    public void computeEmpWage() {

        int empHours = 0;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;

        while (totalEmpHours <= companyEmpWage.maxHoursPerMonth
                && totalWorkingDays < companyEmpWage.numOfWorkingDays) {

            totalWorkingDays++;

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_PART_TIME:
                    empHours = 4;
                    break;

                case IS_FULL_TIME:
                    empHours = 8;
                    break;

                default:
                    empHours = 0;
            }

            totalEmpHours += empHours;
        }

        int totalEmpWage =
                totalEmpHours * companyEmpWage.empRatePerHour;

        companyEmpWage.setTotalEmpWage(totalEmpWage);

        System.out.println(companyEmpWage);
    }
}