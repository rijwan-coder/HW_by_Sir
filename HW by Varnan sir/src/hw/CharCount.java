package hw;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Enter the string: ");
        String inputString = sc.nextLine();

        System.out.println("Enter the character to count: ");
        char ch = sc.next().charAt(0);

        
        int count = 0;
        for (char c : inputString.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }

        System.out.println("Character '" + ch + "' occurs " + count + " times in the string.");
    }
}
