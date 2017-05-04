import java.util.Scanner;

public class BJGame {
    public static void main(String[] args) {
        int playerMonies = 1000;
        int houseMonies =10000;
        int bet;
        int hit;
        boolean pLose = false;
        boolean hWin = false;
        boolean hLose = false;

        //place bet $1 min totalMonies max
        System.out.println("***Whole numbers only***");
        System.out.println("How much would you like to bet: ");
        System.out.println("Your monies: " + playerMonies);
        System.out.println("House monies: " + houseMonies);

        Scanner in = new Scanner(System.in);//bet in
        Scanner in2 = new Scanner(System.in);//hit in
        bet = in.nextInt();
        //while (monies > 0 && < 2000) || player !quits -> play game

        while((playerMonies > 0 && playerMonies < 2000) && (bet >= 1 && bet <= playerMonies)) {
            //get deck
            Deck d = new Deck();
            d.shuffleDeck();

            //deal cards
            Hand playerHand = new Hand();
            Hand houseHand = new Hand();

            playerHand.addCard(d.dealCard());
            playerHand.addCard(d.dealCard());
            System.out.println("Cards in hand:");
            for(String s: playerHand.displayHand()) {
                System.out.println(s.toString());
            }
            for(int i = 0; i < playerHand.getHand().size(); i++) {
                if(playerHand.getHand().get(i).getRank() == 1) {
                    playerHand.getHand().get(i).aceVal();
                }
            }

            houseHand.addCard(d.dealCard());
            houseHand.addCard(d.dealCard());
            System.out.println("Dealer Cards");
//            for(int i = 0; i < houseHand.getHand().size(); i++) {
//                if(houseHand.getHand().get(i).getRank() == 1) {
//                    houseHand.getHand().get(i).aceVal();
//                }
//            }

            System.out.println(houseHand.getHand().get(0).toString());

            //player turn
            System.out.println("Your Turn!");
            System.out.println("Card? \n\'1\' for yae \'0\' for nae: ");
            hit = in2.nextInt();
            while(hit != 0 && pLose == false) {
                if(hit == 1) {
                    playerHand.addCard(d.dealCard());
                    if(playerHand.getHand().get(playerHand.getHand().size() - 1).getRank() == 1) {
                        playerHand.getHand().get(playerHand.getHand().size() - 1).aceVal();
                    }
                    for(String s: playerHand.displayHand()) {
                        System.out.println(s.toString());
                    }
                    if(playerHand.getHandValue() > 21) {
                        //hit = 0;
                        pLose = true;
                        hWin = true;
                    }
                }
                else if(hit == 0) {
                    break;
                }
                else {
                    System.out.println("Please enter 0 or 1");
                    hit = in2.nextInt();
                }
                hit = in2.nextInt();
            }
            //dealer turn
            System.out.println("Dealers Turn!");
            while(hWin == false && pLose == false && hLose == false && houseHand.getHandValue() < 17) {
                System.out.println("House cards: ");
                for(String s: houseHand.displayHand()) {
                    System.out.println(s);
                }
                houseHand.addCard(d.dealCard());
                if(houseHand.getHand().get(houseHand.getHand().size() - 1).getRank() == 1) {
                    if(houseHand.getHandValue() == 10) {
                        hWin = true;
                        System.out.println("House Wins!");
                    }
                    else if(houseHand.getHandValue() <= 5) {
                        houseHand.getHand().get(houseHand.getHand().size() - 1).setValue(11);
                    }
                    else {
                        houseHand.getHand().get(houseHand.getHand().size() - 1).setValue(1);
                    }
                }
                if(houseHand.getHandValue() > 21) {
                    hLose = true;
                    System.out.println("House loses");
                }
            }

            //award winnings to winner
            if(houseHand.getHandValue() == 21) {
                System.out.println("House Wins!");
                houseMonies += bet;
                playerMonies -= bet;
            }
            else if(playerHand.getHandValue() == 21) {
                System.out.println("Player Wins!1");
                playerMonies += bet;
                houseMonies -= bet;
            }
            else if(houseHand.getHandValue() > playerHand.getHandValue() || pLose) {
                System.out.println("House Wins!");
                houseMonies += bet;
                playerMonies -= bet;
            }
            else if(playerHand.getHandValue() > houseHand.getHandValue() || hLose){
                System.out.println("Player Wins!");
                playerMonies += bet;
                houseMonies -= bet;
            }
            //check if game over

            //ask if keep playing
            System.out.println("New game bet: ");
            System.out.println("0 or more monies than you have to exit");
            bet = in.nextInt();
        }

    }

}
