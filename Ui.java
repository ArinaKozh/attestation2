import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Ui {
    public void run() throws FileNotFoundException, UnsupportedEncodingException{
        Shop shop = new Shop();
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Введите команду: ");
            String command = in.nextLine();
            if (command.toLowerCase().equals("add toy")){
                System.out.println("Игрушка пластиковая(1) или плюшевая(2)?");
                int answer = Integer.parseInt(in.nextLine());
                System.out.println("Введите id: ");
                String id = in.nextLine();
                System.out.println("Введите название: ");
                String name = in.nextLine();
                System.out.println("Введите вес: ");
                int frequency = Integer.parseInt(in.nextLine());;
                System.out.println("Введите количество: ");
                int amount = Integer.parseInt(in.nextLine());
                if(answer == 2){
                    System.out.println("Введите тип: ");
                    String type = in.nextLine();
                    shop.addToy(new PlushToy(id,name,frequency,amount,type));
                }
                else if(answer == 1){
                    System.out.println("Введите цвет: ");
                    String color = in.nextLine();
                    shop.addToy(new PlasticToy(id, name, frequency, amount, color));
                }
            

            }
            else if(command.toLowerCase().equals("change weight")){
                while(true){
                    System.out.println("Введите id: ");
                    String id = in.nextLine();
                    System.out.println("Введите вес: ");
                    int frequency = in.nextInt();
                    shop.changeFrequency(id, frequency);
                    System.out.println("Ещё? yes/no ");
                    String answer = in.nextLine();
                    if(answer.toLowerCase().equals("no")){
                        break;
                    }
            }}
            else if(command.toLowerCase().equals("play")){
                shop.getToy();
            }
            else if(command.toLowerCase().equals("show")){
                shop.showStock();
            }
            else if(command.toLowerCase().equals("stop")){
                break;
            }
     

        }
    }
}
