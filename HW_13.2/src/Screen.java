public class Screen {
    private int diagonal;
    private ScreenType type;
    private int weight;

    public Screen(int diagonal, ScreenType type, int weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public ScreenType getType() {
        return type;
    }

    public void setType(ScreenType type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "diagonal=" + diagonal +
                ", type=" + type +
                ", weight=" + weight +
                '}';
    }
}
