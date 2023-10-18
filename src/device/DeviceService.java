package device;

public class DeviceService {

    public void afiseazKw(CuBaterie cuBaterie) { // Tablet, Smartphone
        System.out.println(cuBaterie.getKw());
    }


    public void afisareInfoDevice(Device device) { // Smartphone, Tablet ... 1000000
     device.acceseazaInternet();
     device.incarcaBateria();
    }

    public void afisareInfoDevice(Smartphone smartphone) { // Smartphone a = new Smartphone();
        smartphone.acceseazaInternet();
        smartphone.incarcaBateria();
        smartphone.sunaPeTelefonFix();
    }

    public void afisareInfoDevice(Tablet tablet) {
        tablet.acceseazaInternet();
        tablet.incarcaBateria();
        tablet.test();
    }

}
