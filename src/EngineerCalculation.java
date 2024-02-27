
public class EngineerCalculation extends BaseSalaryColculation {

    public EngineerCalculation() {
        super(1000, 200);
    }

    @Override
    public void salaryCalculation() {
        this.maas = (this.maas * oran / 20);
        System.out.println("Engineer Salary: " + this.maas);
    }
}
