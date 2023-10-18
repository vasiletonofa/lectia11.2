package automobil;

public class AutomobilElectric implements Automobil {
    @Override
    public void accelereaza() {
        System.out.println("accelereaza din AutomobilElectric");
    }

    public void incarcaBateria() {
        System.out.println("Incarca bateria din AutomobilElectric");
    }
}
