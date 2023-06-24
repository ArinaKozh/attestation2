public abstract class Toy{
    private String name;
    private int frequency;
    private int amount;
    private int currentAmount;
    private String id;

    public Toy(String id, String name, int frequency, int amount) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
        this.amount = amount;
        this.currentAmount = amount;
           }

    public int getAmount() {
        return amount;
    }
    
    public int getFrequency() {
        return frequency;
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }
    public void reduceCurrentAmount(){
        this.currentAmount-=1;
    }

    @Override
    public String toString() {
        return String.format("Игрушка '%s' id: %s в количестве %d ", this.name,this.id,this.amount);
    }
}

