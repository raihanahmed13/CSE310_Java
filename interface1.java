interface add_sum {
    void add(double x, double y);

    void sub(double x, double y);
}

interface mul_div {
    void mul(double x, double y);

    void div(double x, double y);

}

interface calculate extends add_sum, mul_div {
    default void result(double res) {
        System.out.println(res);
    }
}

class MyCalculator implements calculate {
    public void add(double x, double y) {
        result(x + y);
    }

    public void sub(double x, double y) {
        result(x - y);
    }

    public void mul(double x, double y) {
        result(x * y);
    }

    public void div(double x, double y) {
        result(x / y);
    }
}

class interface1 {   //main class
    public static void main(String args[]) {
        MyCalculator c = new MyCalculator();
        c.add(7.5, 8.3);
        c.sub(7.5, 8.3);
        c.mul(7.5, 8.3);
        c.div(7.5, 8.3);
    }
}
