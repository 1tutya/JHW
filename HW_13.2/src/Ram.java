public class Ram {
    private RamType type;
    private int size;
    private int weight;

    public Ram(RamType type, int size, int weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public RamType getType() {
        return type;
    }

    public void setType(RamType type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "type=" + type +
                ", size=" + size +
                ", weight=" + weight +
                '}';
    }
}
