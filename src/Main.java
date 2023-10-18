import automobil.Automobil;
import automobil.AutomobilCombustibil;
import automobil.AutomobilElectric;
import device.Device;
import device.DeviceService;
import device.Smartphone;
import device.Tablet;
import person.Ion;
import person.Person;

public class Main {
    public static void main(String[] args) {

//        Ion ion = new Ion(20, "Ion", "Rusu");
//        ion.getAge();
//        ion.getName();
//        ion.salutDeLaIon();
//
//        Person person = new Ion(30, "Ion", "Rusu"); // Person poate apela metodele din Ion doar cele la care s-a facut Override
//        System.out.println(person.getAge()); // 1
//        System.out.println(person.getName()); // A
//
//        System.out.println("------------------");
//
//        Person person1 = new Person(21, "Andrei");
//        System.out.println(person1.getAge()); // 25
//        System.out.println(person1.getName());


        // Daca Ion a facut override la metode, le utilizam pe ele, daca nu utilizam cele din Person


//        AutomobilElectric automobilElectric = new AutomobilElectric();
//        automobilElectric.accelereaza(); // accelereaza din AutomobilElectric
//        automobilElectric.incarcaBateria();
//
//        AutomobilCombustibil automobilCombustibil = new AutomobilCombustibil();
//        automobilCombustibil.accelereaza();
//        automobilCombustibil.alimenteazaRezervor();
//
//        Automobil automobil = new AutomobilElectric();
//        automobil.accelereaza(); // accelereaza din AutomobilElectric
//
//        Automobil automobil1 = new AutomobilCombustibil();
//        automobil1.accelereaza(); // Accelereaza din AutomobilCombustibil

//        Smartphone smartphone = new Smartphone();
//        smartphone.acceseazaInternet(); // acceseaza internet din Smartphone
//        smartphone.incarcaBateria();  // Incarca Bateria din Device
//        smartphone.sunaPeTelefonFix(); // suna pe telefon fix
//
//        Tablet tablet = new Tablet();
//        tablet.acceseazaInternet(); // acceseaza internet din Tablet
//        tablet.incarcaBateria(); // Incarca Bateria din Device
//        tablet.test(); // test Tablet
//
//        DeviceService deviceService = new DeviceService();
//        deviceService.afisareInfoDevice(smartphone);
//        deviceService.afisareInfoDevice(tablet);

//        Device deviceSmartphone = new Smartphone();
//        deviceSmartphone.acceseazaInternet(); // acceseaza internet din Smartphone
//        deviceSmartphone.incarcaBateria(); // Incarca Bateria din Smartphone
//
//        Device tabletDevice = new Tablet();
//        tabletDevice.acceseazaInternet(); // acceseaza internet din Tablet
//        tabletDevice.incarcaBateria(); // Incarca Bateria din Device


        Smartphone smartphone = new Smartphone();
        Tablet tablet = new Tablet();

        DeviceService deviceService = new DeviceService();
        deviceService.afisareInfoDevice(smartphone);
        deviceService.afisareInfoDevice(tablet);

        deviceService.afiseazKw(tablet);
        deviceService.afiseazKw(smartphone);

    }
}