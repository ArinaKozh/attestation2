public class PlasticToy extends Toy {
    private String color;

    public PlasticToy(String id, String name, int frequency, int amount, String color){
        super(id, name, frequency, amount);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Пластиковая " + super.toString() + String.format("Цвета '%s'", this.color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
