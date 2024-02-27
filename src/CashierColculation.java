
public class CashierColculation extends BaseSalaryColculation{
    public CashierColculation(){
        super(1000,100);
    }
    @Override
    public void salaryCalculation(){
        this.maas = (this.maas * oran/20 + 500);
        System.out.println("Cashier Salary: " + this.maas);
    }
}
