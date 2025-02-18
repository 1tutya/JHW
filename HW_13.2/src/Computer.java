public class Computer {
    private Cpu cpu;
    private Ram ram;
    private Drive drive;
    private Screen screen;
    private Keyboard keyboard;
    private final String vendor;
    private final String name;

    public Computer(Cpu cpu, Ram ram, Drive drive, Screen screen, Keyboard keyboard, String vendor, String name) {
        this.cpu = cpu;
        this.ram = ram;
        this.drive = drive;
        this.screen = screen;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public int countTotalWeight() {
        return cpu.getWeight() + ram.getWeight() + drive.getWeight() + screen.getWeight() + keyboard.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", ram=" + ram +
                ", drive=" + drive +
                ", screen=" + screen +
                ", keyboard=" + keyboard +
                ", vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
