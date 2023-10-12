package com.quiz;

import java.util.ArrayList;

class subarry{
    public static void main(String[] args) {
        int []a={10,8,9,3};
        int target =18;
        int n=a.length;
        ArrayList<Integer>list;
        list=find(a,n,target);
        System.out.println(list);

    }

    private static ArrayList<Integer> find(int[] a, int n, int target) {
        int start=0;
        int total=a[0];
        int curr=1;
        ArrayList<Integer>list=new ArrayList<>();
        while (true)
        {
            if (total==target)
            {
                list.add(start+1);
                list.add(curr);

                return list;
            }
            if (total>target&&start<curr-1) {

                total=total-a[start];
                start++;
                continue;
            }
            if(curr>n-1)
            {
                list.add(-1);
                return list;
            }
            total=total+a[curr];
            curr++;


        }

        }
    }
