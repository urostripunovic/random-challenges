package venne;

public class ugly {
    public static void main(String[] args) {
        new ugly().run();
    }

    public void run() {
        System.out.println(isUgly(7) + " Better: " + isUglyCleaner(12));
    }

    public boolean isUgly(int n) {
        if (n <= 0)
            return false;
        int a = n;
        int b = 0;

        while (a % 2 == 0 || a % 3 == 0 || a % 5 == 0) {
            if (a % 2 == 0)
                b = 2;
            else if (a % 3 == 0)
                b = 3;
            else if (a % 5 == 0)
                b = 5;

            a /= b;
            System.out.println(a);
        }

        return a == 1 || a == 2 || a == 3 || a == 5 ? true : false;
    }

    public boolean isUglyCleaner(int n) {
        if (n < 1)
            return false;

        while (n != 1) {
            if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
                if (n % 2 == 0)
                    n = n / 2;
                else if (n % 3 == 0)
                    n = n / 3;
                else if (n % 5 == 0)
                    n = n / 5;
            } else
                return false;
        }
        return true;
    }
}