package com.Stackprob;

import java.util.Arrays;
import java.util.Scanner;


public class Game {
    static int game(int x,int [] a, int []b)
    {
        return game(x,a,b,0,0)-1;
    }
    public static  int  game(int x,int []a,int []b,int s, int c)
    {
        if(s>x)
        {
            return c;
        }
        if(a.length==0||b.length==0)
        {
            return c;
        }
        int ans1=game(x, Arrays.copyOfRange(a,1,a.length),b,s+a[0],c+1);
        int ans2=game(x,a,Arrays.copyOfRange(b,1,b.length),s+a[0],c+1);
        return Math.max(ans1,ans2);

    }

    public static void main(String[] args) {


        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int m = sc.nextInt();
                int n = sc.nextInt();
                int x = sc.nextInt();
                int[] a = new int[n];
                int[] b = new int[m];
                for (int j = 0; j < n; j++) {
                    a[j] = sc.nextInt();
                }
                for (int j = 0; j < m; j++) {
                    b[j] = sc.nextInt();
                }
                System.out.println(game(x, a, b));
            }

        }
    }
}
