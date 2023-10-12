package com.quiz;

import java.util.Arrays;

class Solution {


    public static void main(String[] args) {
        String s="god dining";
        String ans="";
      String[] ch=  s.split(" ");
        System.out.println(Arrays.toString(ch));
      for(int i=0;i<ch.length;i++)
        {
            ans += swap2(ch[i])+" ";

        }


        System.out.println("'"+ans+"'");

    }
    public static  String swap2(String s)
    {
        char[]ans=s.toCharArray();
        int i=0;
        int j=ans.length-1;
        while(i<=j)

        {
            char temp=ans[i];
            ans[i]=ans[j];
            ans[j]=temp;
            i++;
            j--;

        }
        return String.valueOf(ans);



    }
    public static char[] reverseWords(String s) {

        char[]ans=s.toCharArray();

       System.out.println(Arrays.toString(ans));
        int  c=0;
        for(int i=0;i<ans.length;i++)
        {
            if(ans[i]==' ')
            {
                 swap(ans,c,i-1);

                c=i+1;
            }
            if(i==ans.length-1)
            {
                swap(ans,c,i);

            }

        }

        return ans;



    }
    public static  void swap(char[] ch , int c, int i)
    {
        while(c<=i)
        {
            char temp=ch[c];
            ch[c]=ch[i];

            ch[i]=temp;
            c++;
            i--;
        }


    }
}