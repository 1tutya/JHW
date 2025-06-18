public class Dog extends Animal {
    public Dog(double weight, int age, String name) {
        super(weight, age, name);
    }

    public Dog() {
    }

    public void move() {
        System.out.println("Dog named " + super.getName() + " is running on the ground!");
    }
}
