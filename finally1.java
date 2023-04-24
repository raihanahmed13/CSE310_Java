public class finally1 {
    public static void main(String args[]) {
        try {
            int x = 125 / 0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Done");
        }
    }
}
