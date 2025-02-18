public class Person {
    private String name;
    private String post;
    private String work;
    private int age;
    private int salary;

    public Person() {

    };

    public Person(String name, String post, String work, int age, int salary) {
        this.name = name;
        this.post = post;
        this.work = work;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public String getWork() {
        return work;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
}
