
public class BaseSalaryColculation {

    public int maas;
    public int oran;

    public BaseSalaryColculation() {

    }

    public BaseSalaryColculation(int maas, int oran) {
        this.maas = maas;
        this.oran = oran;
    }

    public void salaryCalculation() {
        this.maas = (this.maas * oran / 20); // fix format
        System.out.println(this.maas);
    }
}
