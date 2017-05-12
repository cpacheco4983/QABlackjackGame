import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    String name;
    int monies;
    ArrayList<Card> hand;

    public Player() {
        name = "";
        monies = 0;
        hand = new ArrayList<>();
    }

    public Player(String name, int monies) {
        this.name = name;
        this.monies = monies;
        hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonies() {
        return monies;
    }

    public void setMonies(int monies) {
        this.monies = monies;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public Card getHand(int index) {
        return this.getHand().get(index);
    }

    public void addCard(Card c) {
        hand.add(c);
    }

    public int handValue() {
        int hValue = 0;
        for(Card c : hand) {
            switch (c.getRank()) {
                case 1:
                    Scanner in = new Scanner(System.in);
                    System.out.println("Ace: 1 or 11");
                    int cValue = in.nextInt();
                    while(!(cValue == 1 || cValue == 11)) {
                        System.out.println("Ace: 1 or 11");
                        cValue = in.nextInt();
                    }
                    hValue += cValue;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    hValue += c.getRank();
                    break;
                case 11:
                case 12:
                case 13:
                    hValue += 10;
                    break;
                default:
                    System.out.println("Error");
                    return 0;
            }
        }
        return hValue;
    }

    public int handValueTestMethod() {//to test handValue method with set input
        int hValue = 0;
        for(Card c : hand) {
            switch (c.getRank()) {
                case 1:
                    Scanner in = new Scanner(System.in);
                    System.out.println("Ace: 1 or 11");
                    int cValue = 11;
                    while(cValue != 1 && cValue != 11) {
                        System.out.println("Ace: 1 or 11");
                        cValue = in.nextInt();
                    }
                    hValue += cValue;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    hValue += c.getRank();
                    break;
                case 11:
                case 12:
                case 13:
                    hValue += 10;
                    break;
                default:
                    System.out.println("Error");
                    return 0;
            }
        }
        return hValue;
    }

    public String toString() {
        return "Name: " + name + "\nMonies: " + monies +
                "\nHand: " + hand.toString();
    }
}
