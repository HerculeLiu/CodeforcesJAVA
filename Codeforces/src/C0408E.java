import java.util.Scanner;

public class C0408E {

    /**
     * https://codeforces.com/contest/1665/problem/E
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while(cases > 0)
        {
            int length = scanner.nextInt();
            int[] arr = new int[length];
            for(int i = 0 ; i < length; i++)
            {
                arr[i] = scanner.nextInt();
            }
            int run = scanner.nextInt();
            for (int i = 0; i < run; i++)
            {
                int start = scanner.nextInt() - 1;
                int end = scanner.nextInt();
                int min = Integer.MAX_VALUE;
                for(;start < end - 1;start++)
                {
                    for (int temp = start + 1; temp < end; temp++)
                    {
                        min = Math.min(min,bitwise(arr[start],arr[temp]));
                    }
                }
                System.out.println(min);
            }
            cases--;
        }


    }

    public static int bitwise (int a, int b)
    {
        String stra = Integer.toBinaryString(a);
        String strb = Integer.toBinaryString(b);
        int la = stra.length();
        int lb = strb.length();
        String result = "";
        int lr = 0;
        if(la > lb)
        {
            // la > lb
            result += stra.substring(0,la - lb);
            for (int i = 0; i < lb; i++)
            {
                if(stra.charAt(la + i - lb) == '1' || strb.charAt(i) == '1')
                {
                    result += "1";
                } else
                {
                    result += "0";
                }
            }

        } else
        {
            // lb > la
            result += strb.substring(0,lb - la);
            for (int i = 0; i < la; i++)
            {
                if(strb.charAt(lb + i - la) == '1' || stra.charAt(i) == '1')
                {
                    result += "1";
                } else
                {
                    result += "0";
                }
            }

        }


        return Integer.parseInt(result,2);

    }
}
/*
2
5
6 1 3 2 1
4
1 2
2 3
2 4
2 5
4
0 2 1 1073741823
4
1 2
2 3
1 3
3 4
 */