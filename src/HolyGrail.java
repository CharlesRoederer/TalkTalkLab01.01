import java.util.Scanner;

/**
 * Simple I/O project using scanner
 * @version 09.23.2022
 * @author Charles Roederer
 */
public class HolyGrail {
    /**
     * Main methods of class HOlyGrail
     *
     * @param args command line argument, if needed
     */
    public static void main(String[] args) {
        //declaring local variables
        String name, quest, color;
        Scanner in = new Scanner(System.in);

        System.out.println("* A chat with the bridge keeper *\n" +
                "Who would cross the Bridge of Death must answer me these\n" +
                "questions three, ere the other side he see.");
        //getting user input
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.print("What is your quest? ");
        quest = in.nextLine();
        System.out.print("What is your favorite color? ");
        color = in.nextLine();
        //summarizing the conversation
        //System.out.println(movie + " is a terrible movie! I hate it.");
        System.out.println("King Arthur says, \"You have to know these things when you're a\n" +
                "king, you know.\"");
        System.out.println("Your name is: " + name);
        System.out.println("Your quest is: " + quest);
        System.out.println("Your Favorite color is: " + color);
    }
}

