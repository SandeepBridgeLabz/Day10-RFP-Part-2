class CompanyEmpWage {

    String company;
    int empRatePerHour;
    int workingDays;
    int maxHours;
    int totalWage;

    public CompanyEmpWage(String company,
                          int empRatePerHour,
                          int workingDays,
                          int maxHours) {

        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.workingDays = workingDays;
        this.maxHours = maxHours;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public String toString() {
        return company + " Total Wage : " + totalWage;
    }
}