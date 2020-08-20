import java.lang.reflect.Array;

public class Question7Point1 {
    public static void main(String[] args) {

    }
    public class deck{
        int numberOfCards;
        card[] cardDeck = new card[numberOfCards];

        deck(int n, card[] deckOf){
            numberOfCards = n;
            cardDeck = deckOf;
        }
    }
    public class card{
        int value;

        card(int v){
            value = v;
        }
    }
}
