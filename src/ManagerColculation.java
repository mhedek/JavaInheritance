
public class ManagerColculation extends BaseSalaryColculation {

    public ManagerColculation() {
        super(1000, 300);
    }

    @Override
    public void salaryCalculation() {
        this.maas = (this.maas * oran / 20);
        System.out.println("Manager Salary: " + this.maas);
    }
}
