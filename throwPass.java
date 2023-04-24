import java.util.Scanner;

class passCheck {
    public static void check(String pass) {
        boolean numCheck = false;
        for (int i = 0; i < pass.length(); i++) {
            // if (pass.charAt(i) == '0' || pass.charAt(i) == '1' || pass.charAt(i) == '2'
            // || pass.charAt(i) == '3'
            // || pass.charAt(i) == '3' || pass.charAt(i) == '4' || pass.charAt(i) == '5' ||
            // pass.charAt(i) == '6'
            // || pass.charAt(i) == '7' || pass.charAt(i) == '8' || pass.charAt(i) == '9') {
            // numCheck = true;
            // break;
            // }
            if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') { // checking for numeric value
                numCheck = true;
                break;
            }
        }
        if (pass.length() < 8) {
            throw new ArithmeticException("Length is less than 8");
        }

        else if (!numCheck) {
            throw new ArithmeticException("No numeric character present");
        }

        else {
            System.out.println("Password is good");
        }

    }
}

public class throwPass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        passCheck.check(s);
        sc.close();
    }

}
