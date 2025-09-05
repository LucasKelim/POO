public class SalaryCalculator {

    private double hourlyWage;
    private double hoursWorked;
    private double grossSalary;
    private double netSalary;

    private double irRate = 0.11;
    private double inssRate = 0.08;
    private double sindicatoRate = 0.05;

    public SalaryCalculator(double hourlyWage, double hoursWorked) {
        setHourlyWage(hourlyWage);
        setHoursWorked(hoursWorked);

        calculateGrossSalary();
        calculateNetSalary();
    }

    public double getIrRate() {
        return irRate;
    }

    public double getInssRate() {
        return inssRate;
    }

    public double getSindicatoRate() {
        return sindicatoRate;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        if (hourlyWage > 0) {
            this.hourlyWage = hourlyWage;
        }
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked > 0) {
            this.hoursWorked = hoursWorked;
        }
    }

    private void calculateGrossSalary() {
        grossSalary = hourlyWage * hoursWorked;
    }

    public double calculateIrRate() {
        return grossSalary * irRate;
    }

    public double calculateInssRate() {
        return grossSalary * inssRate;
    }

    public double calculateSindicatoRate() {
        return grossSalary * sindicatoRate;
    }

    public double totalDiscounts() {
        return calculateIrRate() + calculateInssRate() + calculateSindicatoRate();
    }

    private void calculateNetSalary() {
        netSalary = grossSalary - totalDiscounts();
    }
}
