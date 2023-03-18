import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/71/A
 */
public class P71A {

    public static void main(String[] args) {
        // write your code here

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        while (num > 0)
        {
            String str = scan.next();
            int length = str.length();
            if(length <= 10) {
                System.out.println(str);
            } else {
                System.out.println(str.charAt(0) + "" + (length - 2) + "" + str.charAt(length - 1));
            }
            num--;
        }

    }
}
/*
4
word
localization
internationalization
pneumonoultramicroscopicsilicovolcanoconiosis

word
l10n
i18n
p43s
 */