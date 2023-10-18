package device;

public class Smartphone extends CuBaterie implements Device {
    @Override
    public void acceseazaInternet() {
        System.out.println("acceseaza internet din Smartphone");
    }

    public void sunaPeTelefonFix() {
        System.out.println("suna pe telefon fix");
    }

    @Override
    public void incarcaBateria() {
        System.out.println("Incarca Bateria din Smartphone");
    }
}
