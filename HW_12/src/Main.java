public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("John");
        person1.setAge(23);
        person1.setPost("Maintainer");
        person1.setWork("Google");
        person1.setSalary(10000);
        System.out.println(person1.getName() + " " + person1.getAge() + " " + person1.getPost() + " " + person1.getSalary() + " " + person1.getWork());

        Person person2 = new Person("Allen", "Developer", "Apple", 21, 7000);
        System.out.println(person2.getName() + " " + person2.getAge() + " " + person2.getPost() + " " + person2.getSalary() + " " + person2.getWork());
    }
}
