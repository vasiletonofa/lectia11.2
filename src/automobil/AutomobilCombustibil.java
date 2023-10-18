package automobil;

public class AutomobilCombustibil implements Automobil {
    @Override
    public void accelereaza() {
        System.out.println("Accelereaza din AutomobilCombustibil");
    }

    public void alimenteazaRezervor() {
        System.out.println("alimenteaza din AutomobilCombustibil");
    }
}
