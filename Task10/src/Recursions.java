package Task10.src;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Recursions {
    public String GetTriangleSequence(int n) {
        int sum = 0;
        int j = 0;

        if (1 == n) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            --n;
            System.out.print(GetTriangleSequence(n) + " " + j);
        }
        return "";
    }

    public String FromOneToN(final int n){
        if (1 == n) {
            return "1";
        }

        return this.FromOneToN(n - 1) + " " + n;
    }

    public static String FromAToB(final int a, final int b) {

        if (a > b) {

            if (a == b) {
                return Integer.toString(a);
            }

            return a + " " + Recursions.FromAToB(a - 1, b);
        } else {

            if (a == b) {
                return Integer.toString(a);
            }

            return a + " " + Recursions.FromAToB(a + 1, b);
        }
    }

    public int SumOfNumbers(final int len, final int sum, final int k, final int s){

        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        final int c = (0 == len ? 1 : 0);
        int res = 0;

        for (int i = c; 10 > i; i++) {
            res += this.SumOfNumbers(len + 1, sum + i, k, s);
        }
        return res;
    }

    public int SumOfNumbersFromNumber(int n) {

        if (10 > n) {
            return n;
        } else {
            return n % 10 + this.SumOfNumbersFromNumber(n / 10);
        }
    }

    public boolean IsSimple(final int n, final int i){
        if (2 > n) {
            return false;
        }
        else if (2 == n) {
            return true;
        }
        else if (0 == n % i) {
            return false;
        }
        else if (i < n / 2) {
            return this.IsSimple(n, i + 1);
        } else {
            return true;
        }
    }

    public void Factorization(final int n, int k){

        if (k > n / 2) {
            System.out.println(n);
            return;
        }

        if (0 == n % k) {
            System.out.println(k);
            this.Factorization(n / k, k);
        }
        else {
            ++k;
            this.Factorization(n, k);
        }
    }

    public String Palindrom(final String s){
        if (1 == s.length()) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1))) {
                if (2 == s.length()) {
                    return "YES";
                }
                 return this.Palindrom(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }

    public int WithoutTwoZero(final int a, final int b){

        if (a > b + 1) {
            return 0;
        }

        if (0 == a || 0 == b) {
            return 1;
        }

        return this.WithoutTwoZero(a, b - 1) + this.WithoutTwoZero(a - 1, b - 1);
    }

    public int Reverse(final int n, final int i){
        return (0 == n) ? i : this.Reverse( n/10, i*10 + n%10 );
    }

    public static int CountOne() {
        final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);
        final int n = in.nextInt();

        if (1 == n) {
            final int m = in.nextInt();

            if (1 == m) {

                return Recursions.CountOne() + 1 + 1;
            } else {
                final int k = in.nextInt();

                if (1 == k) {

                    return Recursions.CountOne() + n + m + 1;
                } else {
                    return n + m + k;
                }
            }
        } else {
            final int m = in.nextInt();

            if (1 == m) {

                return Recursions.CountOne() + n + 1;
            } else {
                return n + m;
            }
        }
    }

    public void OddNumbers() {
        final java.util.Scanner in = new java.util.Scanner(System.in, StandardCharsets.UTF_8);
        final int n = in.nextInt();
        if (0 < n) {
            if (1 == n % 2) {
                System.out.println(n);
                this.OddNumbers();
            } else {
                this.OddNumbers();
            }
        }
    }

    public void OddIndexes() {
        java.util.Scanner in = new java.util.Scanner(System.in, StandardCharsets.UTF_8);
        int n = in.nextInt();

        if (0 < n) {
            final int m = in.nextInt();
            System.out.println(n);

            if (0 < m) {

                OddIndexes();
            }
        }
    }

    public String FromLeftToRight(int n) {

        if (10 > n) {
            return Integer.toString(n);
        }
        else {
            return FromLeftToRight(n / 10) + " " + n % 10;
        }
    }

    public int FromRightToLeft(int n) {

        if (n < 10) {
            return n;
        }
        else {
            System.out.print(n % 10 + " ");
            return FromRightToLeft(n / 10);
        }
    }

    public void CountElementsEqualsMax(int max, int count) {

        java.util.Scanner in = new java.util.Scanner(System.in, StandardCharsets.UTF_8);

        int n = in.nextInt();

        if (n > 0) {

            if (n > max) {
                CountElementsEqualsMax(n, 1);
            }
            else if (n == max) {
                CountElementsEqualsMax(max, ++count);
            }
            else {
                CountElementsEqualsMax(max, count);
            }
        } else {
            System.out.println(count);
        }
    }

    public static int MaxSequence() {
        java.util.Scanner in = new java.util.Scanner(System.in, StandardCharsets.UTF_8);
        int n = in.nextInt();
        if (n == 0) {
            return 0;
        }
        else {
            return Math.max(n, MaxSequence());
        }
    }
}
