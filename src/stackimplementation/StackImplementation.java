package stackimplementation;

import java.util.Scanner;

public class StackImplementation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String names[] = new String[10];
        int top = -1;

        do
        {
            System.out.println("\n[1] add notebook"
                    + "\n[2] Check Notebook"
                    + "\n[3] Peek at Notebook"
                    + "\n[4] Check All"
                    + "\n[5] Exit\n");
            System.out.print("Input Choice: ");
            String choice = input.nextLine();
            if (choice.equals("1")) {
                System.out.print("Notebook Owner: ");
                String name = input.nextLine();
                names[++top] = name;
                System.out.println("notebook added!");
            } else if (choice.equals("2")) {
                System.out.println(names[top] + "'s notebook is being checked.");
                top--;
            } else if (choice.equals("3")) {
                System.out.println(names[top]);
            } else if (choice.equals("4")) {
                top = -1;
                System.out.println("all notebooks have been checked.");
            } else if (choice.equals("5")) {
                System.exit(0);
            }
        }while (true);
    }
}