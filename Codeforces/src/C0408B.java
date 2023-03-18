import java.util.HashMap;
import java.util.Scanner;

public class C0408B {

    /**
     * https://codeforces.com/contest/1665/problem/B
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases > 0) {
            HashMap<Integer, Integer> freq = new HashMap<>();
            int len = scanner.nextInt();
            int max = 1;
            int steps = 0;
            for (int i = 0; i < len; i++)
            {
                int n = scanner.nextInt();
                if(freq.containsKey(n))
                {
                    freq.put(n,freq.get(n) + 1);
                    //System.out.println("new freq[" + n + "] : " + freq.get(n));
                    max = Math.max(max,freq.get(n));
                } else
                {
                    freq.put(n,1);
                }
            }
            //System.out.println("max : " + max);
            while (max < len)
            {
                steps ++;
                steps += max;
                max *= 2;
                //System.out.println("--" + steps);
            }
            steps -= (max - len);
            cases--;
            System.out.println(steps);
        }

    }
}
