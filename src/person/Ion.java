package person;

public class Ion extends Person {

    String surname;

    public Ion(int age, String name, String surname) {
        super(age, name);
        this.surname = surname;
    }

    public void salutDeLaIon() {
        System.out.println("Salut de la Ion");
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int getAge() {
        return 1;
    }


   @Override
    public String getName() {
        return "A";
    }

}
