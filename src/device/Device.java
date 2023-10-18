package device;

public interface Device {

    public abstract void acceseazaInternet();

    public default void incarcaBateria() {
        System.out.println("Incarca Bateria din Device");
    }

}
