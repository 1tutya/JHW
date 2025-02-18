public class Cpu {
    private int frequency;
    private int coresCount;
    private Manufacturer manufacturer;
    private int weight;

    public Cpu(int frequency, int coresCount, Manufacturer manufacturer, int weight) {
        this.frequency = frequency;
        this.coresCount = coresCount;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getCoresCount() {
        return coresCount;
    }

    public void setCoresCount(int coresCount) {
        this.coresCount = coresCount;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "frequency=" + frequency +
                ", coresCount=" + coresCount +
                ", manufacturer=" + manufacturer +
                ", weight=" + weight +
                '}';
    }
}
