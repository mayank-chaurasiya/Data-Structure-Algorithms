package preparation_street.sprint_02;

import java.util.Scanner;

import revision.stackoperations.ValidParentheses;

public class P11_Balanced_Bracket_seq {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = scan.nextLine();
        System.out.println(ValidParentheses.isValid(str));
        scan.close();
    }
}
