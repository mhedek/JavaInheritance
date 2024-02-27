
public class Main {

    public static void main(String[] args) {
        /*
        EngineerCalculation engineerCalculation = new EngineerCalculation();
        engineerCalculation.salaryCalculation();
        
        ManagerColculation managerColculation = new ManagerColculation();
        managerColculation.salaryCalculation();
        
        CashierColculation cashierColculation = new CashierColculation();
        cashierColculation.salaryCalculation();
         */

        // run-time Polymorphsim
        BaseSalaryColculation baseSalaryColculation = new EngineerCalculation();
        baseSalaryColculation.salaryCalculation();
    }
}
