public class EmpWageBuilder {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private ArrayList<CompanyEmpWage> companyEmpWageList;

    public EmpWageBuilder() {
        companyEmpWageList = new ArrayList<>();
    }

    @Override
    public void addCompanyEmpWage(String company,
                                  int empRatePerHour,
                                  int numOfWorkingDays,
                                  int maxHoursPerMonth) {

        CompanyEmpWage companyEmpWage =
                new CompanyEmpWage(company,
                        empRatePerHour,
                        numOfWorkingDays,
                        maxHoursPerMonth);

        companyEmpWageList.add(companyEmpWage);
    }

    @Override
    public void computeEmpWage() {

        for (CompanyEmpWage company : companyEmpWageList) {

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

                int dailyWage = empHours * company.empRatePerHour;

                company.dailyWageList.add(dailyWage);
            }

            int totalEmpWage =
                    totalEmpHours * company.empRatePerHour;

            company.setTotalEmpWage(totalEmpWage);

            System.out.println(company);
        }
    }

    public int getTotalWage(String companyName) {

        for (CompanyEmpWage company : companyEmpWageList) {

            if (company.company.equals(companyName)) {
                return company.totalEmpWage;
            }
        }

        return 0;
    }
}