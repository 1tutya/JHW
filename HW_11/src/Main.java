public class Main {
    public static void main(String[] args) {
        Phone.CountryManufacturer = "USA";

        Phone phone1 = new Phone("iPhone", "79008007654", 229);
        System.out.println(phone1.toString());
        System.out.println(phone1.CountryManufacturer);
        phone1.receiveCall("Anton");
        phone1.receiveCall("Anton", "89008007654");

        Phone phone2 = new Phone();
        phone2.model = "Android";
        phone2.number = "84005006789";
        phone2.weight = 322;
        System.out.println(phone2.toString());
        System.out.println(phone2.CountryManufacturer);
    }
}
