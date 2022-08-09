import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        checkTriangle(a, b, c);
    }

    public static void checkTriangle(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0 || a + b < c || b + c < a || a + c < b) throw new IllegalArgumentException();
    }
}
