import java.util.Scanner;

public class c4A {

        public static void main(String[] args) {
            // write your code here

            Scanner scan = new Scanner(System.in);
            int weight = scan.nextInt();

            if(weight%2 == 0 && weight != 2)
            {
                System.out.println("YES");
            } else
            {
                System.out.println("NO");
            }
        }

}
