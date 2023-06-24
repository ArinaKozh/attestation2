public class PlushToy extends Toy {
    private String type;
    
    public PlushToy(String id, String name, int frequency, int amount, String type){
        super(id, name, frequency, amount);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return "Плюшевая " + super.toString() + String.format("Типа '%s'", this.type);
    }
}
