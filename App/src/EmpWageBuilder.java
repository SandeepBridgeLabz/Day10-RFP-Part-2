public class EmpWageBuilder implements IEmpWageBuilder {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private CompanyEmpWage[] companyEmpWageArray;
    private int numOfCompanies;

    public EmpWageBuilder() {
        companyEmpWageArray = new CompanyEmpWage[5];
        numOfCompanies = 0;
    }

    @Override
    public void addCompanyEmpWage(String company,
                                  int empRatePerHour,
                                  int numOfWorkingDays,
                                  int maxHoursPerMonth) {

        companyEmpWageArray[numOfCompanies] =
                new CompanyEmpWage(company,
                        empRatePerHour,
                        numOfWorkingDays,
                        maxHoursPerMonth);

        numOfCompanies++;
    }

    @Override
    public void computeEmpWage() {

        for (int i = 0; i < numOfCompanies; i++) {

            CompanyEmpWage company = companyEmpWageArray[i];

            int empHours = 0;
            int totalEmpHours = 0;
            int totalWorkingDays = 0;

            while (totalEmpHours <= company.maxHoursPerMonth
                    && totalWorkingDays < company.numOfWorkingDays) {

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
                    totalEmpHours * company.empRatePerHour;

            company.setTotalEmpWage(totalEmpWage);

            System.out.println(company);
        }
    }
}