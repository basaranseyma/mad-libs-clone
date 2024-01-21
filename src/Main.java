import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        String adjective1;
        String girlsName;
        String adjective2;
        String occupation1;
        String placeName;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boysName;
        String mansName;

        System.out.print("Please enter an adjective:\t");
        adjective1 = enter.nextLine();

        System.out.print("Please enter a girl's name:\t");
        girlsName = enter.nextLine();

        System.out.print("Please enter another adjective:\t");
        adjective2 = enter.nextLine();

        System.out.print("Please enter an occupation:\t");
        occupation1 = enter.nextLine();

        System.out.print("Please enter the name of a place:\t");
        placeName = enter.nextLine();

        System.out.print("Please enter the name of a piece of clothing:\t");
        clothing = enter.nextLine();

        System.out.print("Please enter the name of a hobby:\t");
        hobby = enter.nextLine();

        System.out.print("Please enter another adjective:\t");
        adjective3 = enter.nextLine();

        System.out.print("Please enter another occupation:\t");
        occupation2 = enter.nextLine();

        System.out.print("Please enter a boy's name:\t");
        boysName = enter.nextLine();

        System.out.print("Please enter a man's name:\t");
        mansName = enter.nextLine();

        System.out.println();

        System.out.println("There was once a "+ adjective1 + " girl named " + girlsName + " who was a " + adjective2 + " " + occupation1 + " in the Kingdom of " + placeName + ".");
        System.out.println("She loved to wear " + clothing + " and to " + hobby + ". She wanted to marry " + adjective3 + " " + occupation2 + " named " + boysName + " but her father, King " + mansName + " forbid her from seeing him.");
    }
}