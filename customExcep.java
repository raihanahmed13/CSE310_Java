import java.util.*;

class UnexpectedTrouserSizeException extends Exception {
    public UnexpectedTrouserSizeException() {
        super();
    }
}

public class customExcep {
    static void check(int size) throws UnexpectedTrouserSizeException {
        if (size < 18 || size > 40) {
            throw new UnexpectedTrouserSizeException();
        } else {
            System.out.println("try and shop");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        try {
            customExcep.check(size);
        } catch (UnexpectedTrouserSizeException e) {
            System.out.println("the demanded size is out of stock");
        }
        sc.close();

    }
}
