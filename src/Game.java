import java.util.Scanner;
import java.util.Stack;

public class Game {

    Players[] players;
    CircularQ playersCircularQ;
    Deck deckk = new Deck();
    Stack<Cards> cardsStack = new Stack<>();

    public void InitializePlayers(Deck deck){


        Scanner user = new Scanner(System.in);
        Scanner names = new Scanner(System.in);

        System.out.println("Enter the number of players(min 2):");
        int input = user.nextInt();
        playersCircularQ = new CircularQ();

        players = new Players[input];


        for (int i = 0; i < input; i++) {
            System.out.println("Enter the name of the person: ");
            String name = names.nextLine();
            players[i] = new Players(i,name);
        }


        for (int i=0; i<input;i++)
        {
            Players player = players[i];
            deck.serveCards(player);
        }

        for(int i=0; i<players.length;i++)
        {
            playersCircularQ.enQueue(players[i]);

        }
        playersCircularQ.displayQueue();

        cardsStack.push(deck.drawCard());

    }



    public void turn(){

        Players player;
        Cards card;
        Cards playerCard;
        int size = playersCircularQ.size();


           CircularQ.Node temp = playersCircularQ.rear;
           while (!(size - playersCircularQ.size() == 1))
           {
              temp =  playersCircularQ.next(temp);
              player = temp.data;
               System.out.println(player.name);

               card = cardsStack.peek();
               System.out.println("CARDS STACK: " + card.toString());

              player.ShowCards();
              playerCard = player.input();

               System.out.println("after");

              LegalCard(card,playerCard);

            //matching the cards


           }


    }

    public boolean LegalCard(Cards match, Cards playerCard){

        return true;
    }


}
