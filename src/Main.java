public class Main {

    static int fib(int n) {
        if (n <= 1) // when n = 1 or n = 0
            return n;

        return Main.fib(n - 1) + Main.fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Hello World! " + Main.fib(31));
    }
}
