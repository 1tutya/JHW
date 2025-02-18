public class Keyboard {
    private KeyboardType type;
    private Backlight backlight;
    private int weight;

    public Keyboard(KeyboardType type, Backlight backlight, int weight) {
        this.type = type;
        this.backlight = backlight;
        this.weight = weight;
    }

    public KeyboardType getType() {
        return type;
    }

    public void setType(KeyboardType type) {
        this.type = type;
    }

    public Backlight getBacklight() {
        return backlight;
    }

    public void setBacklight(Backlight backlight) {
        this.backlight = backlight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "type=" + type +
                ", backlight=" + backlight +
                ", weight=" + weight +
                '}';
    }
}
