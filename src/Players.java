import java.util.LinkedList;
import java.util.Scanner;

public class Players {

    int id;
    String name;
    LinkedList<Cards> cards = new LinkedList<>();

    public Players(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void ShowCards(){
        for(int i=-0;i<cards.size();i++)
        {
            System.out.println(i + " " + cards.get(i).number + " " +cards.get(i).color + " " + cards.get(i).type );

        }

    }


    public Cards input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your card by index: ");
        int inp = input.nextInt();

        System.out.println("You chose: " + cards.get(inp));   //remove the card from the list
        return cards.get(inp);


    }


}
