public class Main {
    public static void main(String[] args) {
        Cpu cpu = new Cpu(2000, 4, Manufacturer.INTEL, 1);
        Ram ram = new Ram(RamType.DIMM, 8, 1);
        Drive drive = new Drive(DriveType.SSD, 256, 1);
        Screen screen = new Screen(21, ScreenType.IPS, 1);
        Keyboard keyboard = new Keyboard(KeyboardType.MECH, Backlight.NO, 1);
        Computer computer = new Computer(cpu, ram, drive, screen, keyboard, "Palit", "MyComp");
        System.out.println(computer);
        System.out.println(computer.countTotalWeight());
    }
}
