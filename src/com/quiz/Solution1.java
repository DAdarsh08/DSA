package com.quiz;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        String s="AAABABB";
        System.out.println(winnerOfGame(s));

    }
    public static boolean winnerOfGame(String colors) {
        char[]ans=colors.toCharArray();
        System.out.println(Arrays.toString(ans));
        int a=0;
        int b=0;
        int i=0;
        int n=ans.length;
        while (i<n)
        {
            int p=0;
            int q=0;
            while (i<n&&ans[i]=='A')
            {
                p++;
                i++;
            }

            while (i<n&&ans[i]=='B')
            {
                q++;
                i++;
            }
            if(p>2)
            {
                a+=p-2;
            }
            if(q>2)
            {
                b+=q-2;
            }


        }
        System.out.println(a);
        System.out.println(b);

        if(a>b)
        {
            return true;
        }
        if(a<b)
        {
            return false;
        }




        return false;
    }
}
