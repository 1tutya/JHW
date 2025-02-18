public class Phone {
    String model;
    String number;
    int weight;

    static String CountryManufacturer;

    public Phone(String model, String number, int weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    public Phone() {

    }

    public void receiveCall(String name) {
        System.out.println("Звонит абонент по имени " + name);
    }

    public void receiveCall(String name, String phone) {
        System.out.println("Звонит абонент по имени " + name + ", номер " + phone);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", number='" + number + '\'' +
                ", weight=" + weight +
                '}';
    }
}
