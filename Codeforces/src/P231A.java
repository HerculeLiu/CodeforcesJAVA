import java.util.Scanner;

public class P231A {
    /**
     * https://codeforces.com/problemset/problem/231/A
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        while (num > 0)
        {
            int sol1 = scanner.nextInt();
            int sol2 = scanner.nextInt();
            int sol3 = scanner.nextInt();
            count += (sol1 + sol2 + sol3)/2;
            num--;
        }
        System.out.println(count);

    }
}
