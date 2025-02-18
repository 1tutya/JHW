public class Drive {
    private DriveType type;
    private int size;
    private int weight;

    public Drive(DriveType type, int size, int weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public DriveType getType() {
        return type;
    }

    public void setType(DriveType type) {
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
        return "Drive{" +
                "type=" + type +
                ", size=" + size +
                ", weight=" + weight +
                '}';
    }
}
