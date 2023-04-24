interface factor {
    boolean test(int x, int y);
}

class lambdaExp {
    public static void main(String args[]) {
        factor f;
        f = (x, y) -> {
            if (x % y == 0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println((f.test(10, 5)) ? "Is factor" : "Not a factor");
    }

}
