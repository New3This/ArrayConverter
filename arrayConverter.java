import java.util.Scanner;
import java.util.ArrayList;


public class arrayConverter {
    private static boolean exit = true;
    private static boolean start = true;
    private static final String op1 = "* Input all the words at once";
    private static final String op2 = "Input one word at a time";



    public static void main(String[] args) {
        while(exit) {
            String check = "default";
            Scanner sc = new Scanner(System.in);
            ArrayList<String> list = new ArrayList<>();
            String box = ("");
            start=true;
            while (start) {
                System.out.println("You can do the following with this program, to convert words into an array:\n" + op1+"\n* "+op2);
                System.out.println("How would you like your array, with curly brackets (maybe to initalise arrays in java) or square brackets?");
                System.out.println("1. Curly brackets\n2. Square brackets");
                System.out.println("Option 1 or 2?");
                char confirmation = sc.next().toUpperCase().charAt(0);
                if (confirmation == '1') {
                    System.out.println("Enter your words and type 1, once finished to print the array");
                    while (!check.equals("1")) {
                        check = String.valueOf(sc.next());
                        if (!check.equals("1")) {
                            box += "\""+String.valueOf(check)+"\""+", ";
                        }
                    }
                    if (box.length() > 2) {
                        System.out.println("{" + box.substring(0, box.length()-2) + "}");
                    }
                    else {
                        System.out.println("{"+"}");
                    }
                }
                
                if (confirmation == '2') {
                    System.out.println("Enter your words and type 1, once finished to print the array");
                    while (!check.equals("1")) {
                        check = String.valueOf(sc.next());
                        if (!check.equals("1")) {
                            list.add(check);
                        }
                    }
                System.out.println(list);
                }
                start = false;
            }
        }
    }
}
