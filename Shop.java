import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import java.util.ArrayList;
import java.util.Collections;

public class Shop {
    private ArrayList<Toy> queue = new ArrayList<>();
    private ArrayList<Toy> stock = new ArrayList<>();
    

    public void  addToy(Toy toy){
        this.stock.add(toy);
        try(FileWriter writer = new FileWriter("ToysInStock.txt", false))
        {
            for(Toy iToy:this.stock){
                writer.write(iToy.toString());
                writer.append('\n');}
            writer.flush();
        }
        catch(IOException ex){   
            System.out.println(ex.getMessage());
    }}

    public void changeFrequency(String id, int frequency){
        for(Toy toy : stock){
            if(toy.getId().equals(id)){
                toy.setFrequency(frequency);
        }
            else{
                System.out.println("Игрушек с таким id не найдено");
            }
        }
    }

    public void makeQueue(){

        ArrayList<Toy> random = new ArrayList<>();
        for(Toy toy: this.stock){
            for(int i=0;i<toy.getFrequency();i++){
                random.add(toy);
            }
        }
        Collections.shuffle(random);
        int sum = 0;
        for(Toy j: this.stock){
            sum+=j.getCurrentAmount();
        }
        Toy toy;
        while(sum!=0){
            toy = random.get(0);
            if(toy.getCurrentAmount()>0){
                this.queue.add(toy);
                this.stock.get(this.stock.indexOf(toy)).reduceCurrentAmount();
            }
            random.remove(0);
            random.add(toy);
            for(Toy j: this.stock){
            sum+=j.getCurrentAmount();
        }
        }
    }

    public void getToy() throws FileNotFoundException, UnsupportedEncodingException{
        makeQueue();
        Toy toyWon = this.queue.get(0);
        this.queue.remove(0);
        try(FileWriter writer = new FileWriter("ToysWon.txt", true))
        {
            writer.write(toyWon.toString());
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){   
            System.out.println(ex.getMessage());
    }
        System.out.println("Вы выйграли: "+toyWon);
    }

    public void showStock(){
        for(Toy i:this.stock){
            System.out.println(i.toString());
        }
    }
}
