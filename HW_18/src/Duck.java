public class Duck extends Animal{
    public Duck(double weight, int age, String name) {
        super(weight, age, name);
    }

    public Duck() {
    }

    public void move() {
        System.out.println("Duck named " + super.getName() + " is flying in the sky!");
    }
}
