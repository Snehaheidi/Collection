import java.util.*;
public class ChatBot
{
    static Stack<SelectedOptions> backStack = new Stack<SelectedOptions>();
    public static void main(String args[]) {
        int choice;
        backStack.push(new SelectedOptions(0, 0));
        print(0, 0);
        do {
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("Enter your option : ");
            choice = input.nextInt();
            if (choice == 9) {
                backStack.pop();

                if (backStack.isEmpty()) {
                    break;
                }
            } else {
                backStack.push(new SelectedOptions(backStack.peek().level + 1, choice));

            }
            SelectedOptions top = backStack.peek();
            print(top.level, top.choice);

        } while (choice != 0);
        System.out.println("Thank you for visiting our website...");
    }
    private static void print(int level, int choice) {

        for (String choiceString : getChoices(level, choice)) {
            System.out.println(choiceString);
        }
    }
    static ArrayList<String> getChoices(int level, int choice) {
        ArrayList<String> choiceList = new ArrayList();
        if (level == 0) {
            choiceList.add(Level1.OPTION_1.toString());
            choiceList.add(Level1.OPTION_2.toString());
            choiceList.add(Level1.OPTION_3.toString());
            choiceList.add(Level1.OPTION_4.toString());
            choiceList.add(Level1.OPTION_5.toString());
        } else if (level == 1) {

            switch (choice) {
                case 1:
                    choiceList.add(Level2.OPTION_1.toString());
                    choiceList.add(Level2.OPTION_2.toString());
                    choiceList.add(Level2.OPTION_3.toString());
                    choiceList.add(Level2.OPTION_4.toString());
                    choiceList.add(Level2.OPTION_5.toString());
                    choiceList.add(Level2.OPTION_6.toString());
                    break;
                case 2:
                    choiceList.add(Level3.OPTION_1.toString());
                    choiceList.add(Level3.OPTION_2.toString());
                    choiceList.add(Level3.OPTION_3.toString());
                    choiceList.add(Level3.OPTION_4.toString());
                    break;
            }
        } else if (level == 2) {
            switch (choice) {
                case 1:
                    choiceList.add(Recharge.OPTION_1.toString());
                    choiceList.add(Recharge.OPTION_2.toString());
                    choiceList.add(Recharge.OPTION_3.toString());
                    choiceList.add(Recharge.OPTION_4.toString());
                    break;
                case 2:
                    choiceList.add(Caller_Tune.OPTION_1.toString());
                    choiceList.add(Caller_Tune.OPTION_2.toString());
                    choiceList.add(Caller_Tune.OPTION_3.toString());
                    choiceList.add(Caller_Tune.OPTION_4.toString());
                    choiceList.add(Caller_Tune.OPTION_5.toString());
                    choiceList.add(Caller_Tune.OPTION_6.toString());
                    break;
                case 3:
                    choiceList.add(Dth.OPTION_1.toString());
                    choiceList.add(Dth.OPTION_2.toString());
                    choiceList.add(Dth.OPTION_3.toString());
                    choiceList.add(Dth.OPTION_4.toString());
                    choiceList.add(Dth.OPTION_5.toString());
                    break;
                case 4:
                    choiceList.add(NewOffers.OPTION_1.toString());
                    choiceList.add(NewOffers.OPTION_2.toString());
                    choiceList.add(NewOffers.OPTION_3.toString());
                    choiceList.add(NewOffers.OPTION_4.toString());
                    choiceList.add(NewOffers.OPTION_5.toString());
                    choiceList.add(NewOffers.OPTION_6.toString());
                    break;
            }
        } else if (level == 3) {
            System.out.println("Your Option set Successfully");
            System.out.println("9-Back");
            System.out.println("0-Exit");
        }

        return choiceList;
    }

    static class SelectedOptions {
        private int level;
        private int choice;

        SelectedOptions(int level, int choice) {
            this.level = level;
            this.choice = choice;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getChoice() {
            return choice;
        }

        public void setChoice(int choice) {
            this.choice = choice;
        }

    }

    public enum Level1 {
        OPTION_1("1.English"), OPTION_2("2.Tamil"), OPTION_3("3.Hindi"), OPTION_4("4.Telugu"), OPTION_5("0-Exit");

        private final String text;

        Level1(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }

    public enum Level2 {
        OPTION_1("1.Rechare"), OPTION_2("2.Caller_Tune"), OPTION_3("3.DTH"), OPTION_4("4.New Offers"),
        OPTION_5("9-Back"), OPTION_6("0.Exit");

        private final String text;

        Level2(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }

    public enum Level3 {
        OPTION_1("1.ரீஜார்ச்"), OPTION_2("2.காலர் டியுன்"), OPTION_3("3.டிடிஎச்"), OPTION_4("4.புதிய ஆஃபர்");

        private final String text;

        Level3(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }

    public enum Recharge {
        OPTION_1("1.Rechare through Airtel Payments Bank Account"), OPTION_2("2.Coupon Recharge"), OPTION_3("9.Back"),
        OPTION_4("0.Exit");

        private final String text;

        Recharge(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }

    public enum Caller_Tune {
        OPTION_1("1.Arabic Kuthu"), OPTION_2("2.Mudhal Nee Mudivu Nee"), OPTION_3("3.Naaga Vera Maari"),
        OPTION_4("4.Two Two Two"), OPTION_5("9.Back"), OPTION_6("0-Exit");

        private final String text;

        Caller_Tune(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }

    public enum Dth {
        OPTION_1("1.Airtel DTH HD Plan Rs.251=49Channels+30D"), OPTION_2("2.Airtel DTH ₹ 285 Pack = 68 Channels+30D"),
        OPTION_3("3.Airtel DTH ₹ 252 Pack = 78 Channels+30D"), OPTION_4("9.Back"), OPTION_5("9.Exit"),;

        private final String text;

        Dth(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }

    public enum NewOffers {
        OPTION_1("1.265=UL call+1GB/D,28D"), OPTION_2("2.479=UL call+1.5GB/D,56D"),
        OPTION_3("3.299=UL call+1.5GB/D28D"), OPTION_4("4.549=UL call+25GB/D,56D"), OPTION_5("9.Back"),
        OPTION_6("0.Exit");

        private final String text;

        NewOffers(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }
}
