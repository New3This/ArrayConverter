import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class arrayConverter {
    private static String check = "default";
    private static boolean start = true;
    private static final String op1 = "Copy and paste it all at once";
    private static final String op2 = "Input one word at a time";



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (start) {
            System.out.println("Enter all the words you want to add into an array");
            System.out.println("Select your option:\n1. " + op1+"\n2. "+op2);
            int option = sc.nextInt();
            String message = "Once done, to print the list, type 1";
           
            if (option == 1) {
                System.out.println("You have chosen to "+ op1.toLowerCase() +"\n"+message);

                System.out.println("If you wish to proceed, type Y. If not, type N");
                char confirmation = sc.next().toUpperCase().charAt(0);
                if (confirmation == 'Y') {
                    System.out.println("Enter your words and once finished, enter 1 to print the array");
                    while (!check.equals("1")) {
                        check = String.valueOf(sc.next());
                        String[] splitter = check.split(" ,|\\.");
                        System.out.println(Arrays.toString(splitter));
                        // for (String word : splitter) {


                        // }
                        
                    
                    }
                }

            }
            if (option == 2) {
                System.out.println("You have chosen to " + op2.toLowerCase() +"\n"+message);
                System.out.println("If you wish to proceed, type Y. If not, type N");
                char confirmation = sc.next().toUpperCase().charAt(0);
                if (confirmation == 'Y') {
                    System.out.println("Enter your words and type 1, once finished to print the array");
                    while (!check.equals("1")) {
                        check = String.valueOf(sc.next());
                        if (!check.equals("1")) {
                            list.add(check);
                        }
                    }
                System.out.println(list);
                start=false;
                }
                if (confirmation == 'N') {
                    continue;
                }
            }
        }
        
    }

}