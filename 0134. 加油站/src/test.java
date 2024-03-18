public class test {
    public static void main(String[] args) {

    }

    public int fib(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (n == 2) return 3;


        return fib(n - 2) + fib(n - 1);

    }

    public int sum(int n) {
        if (n < 2) return n;

        return fib(n - 2) + fib(n - 1);

    }
}
