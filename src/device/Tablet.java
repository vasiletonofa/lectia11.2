package device;

public class Tablet extends CuBaterie implements Device {
    @Override
    public void acceseazaInternet() {
        System.out.println("acceseaza internet din Tablet");
    }

    public void test() {
        System.out.println("test Tablet");
    }

    @Override
    public int getKw() {
        return 10;
    }

    @Override
    public void incarcaBateria() {
        System.out.println("Incarca bateria din Tablet");
    }
}
