public class Main {

    public static void main(String[] args) {

        isBlackjack("ace", "queen");

    }




    public static int parseCard(String card) {

        if (card == "ace") {
            return 11;
        } else if (card == "two") {
            return 2;
        } else if (card == "three") {
            return 3;
        } else if (card == "four") {
            return 4;
        } else if (card == "five") {
            return 5;
        } else if (card == "six") {
            return 6;
        } else if (card == "seven") {
            return 7;
        } else if (card == "eight") {
            return 8;
        } else if (card == "nine") {
            return 9;
        } else if (card == "ten") {
            return 10;
        } else if (card == "jack") {
            return 10;
        } else if (card == "queen") {
            return 10;
        } else if (card == "king") {
            return 10;
        } else {
            return 0;
        }

    }

      /*
switch(card) {

            case "ace": {
          return 11;
            break;
}
            case "two" : {return 2;
            break;}
            case "three" : {return 3;
            break;}
            case "four" : {return 4;
            break;}
            case "five" : {return 5;
            break;}
            case "six" : {return 6;
            break;}
            case "seven" : {return 7;
            break;}
            case "eight" : {return 8;
            break;}
            case "nine" : {return 9;
            break;}
            case "ten" : {return 10;
            break;}
            case "jack" : {return 10;
            break;}
            case "queen" : {return 10;
            break;}
            case "king" : {return 10;
            break;}
            default : return 0;


        }
     */





    public static boolean isBlackjack(String card1, String card2) {
        int Card3 = parseCard(card1);
        int Card4 = parseCard(card2);
        int Sum = Card3 + Card4;
        if (Sum == 21) {
            System.out.println("21 BlackJack");
            return true;
        } else {
            System.out.println("Next time");
            return false;
        }
    }





}
