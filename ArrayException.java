import java.util.*;

public class ArrayException {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try {
            n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("array size must be numeric");
        }
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ind = sc.nextInt();
        if (ind > n) {
            throw new ArrayIndexOutOfBoundsException("array index out of bounds");
        } else {
            for (int i = 0; i < ind; i++) {
                System.out.println(arr[i]);
            }
        }

    }
}
