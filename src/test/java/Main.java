package test.java;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int sum = sum(1, 2);
        int minus= minus(sum, 10);
        System.out.println(minus);
    }

    private static int sum(int a, int b) {

        return a + b;
    }
    private static int minus(int a, int b){
                return a - b;
    }
}
