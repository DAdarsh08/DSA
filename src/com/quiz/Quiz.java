package com.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Question{
   private String question,opta,optb,optc,optd;
 private    int answer;

    public Question(String question, String opta, String optb, String optc, String optd, int answer) {
        this.question = question;
        this.opta = opta;
        this.optb = optb;
        this.optc = optc;
        this.optd = optd;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getOpta() {
        return opta;
    }

    public String getOptb() {
        return optb;
    }

    public String getOptc() {
        return optc;
    }

    public String getOptd() {
        return optd;
    }

    public int getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", opta='" + opta + '\'' +
                ", optb='" + optb + '\'' +
                ", optc='" + optc + '\'' +
                ", optd='" + optd + '\'' +
                ", answer=" + answer +
                '}';
    }
}
public class Quiz {



    int correct=0;
  // final int wrong=0;
   String name;

    public Quiz(String name) {
        this.name = name;
    }
     String[]question={"Who is the 'Bharat Ka Veer Putra Aaccording to the title of a 2013 TV Series?","which is know as red planet"};
     String[]ans={"Maharana pratap","Mars"};

   static List<List<String>>opt=new ArrayList<>();


    static {
        opt.add(new ArrayList<>(List.of("tipu","chadra","Maharana pratap")));
        opt.add(new ArrayList<>(List.of("Mars","Earth","Venus")));
    }




    public void start()
    {
        System.out.println("HELLO "+this.name);

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=1;i++)
        {
            int temp;
            System.out.println(this.question[i]);
            System.out.println("1:"+opt.get(i).get(0));
            System.out.println("2:"+opt.get(i).get(1));
            System.out.println("3:"+opt.get(i).get(2));
            int a=sc.nextInt();
            if(a==1)
            {
                if(opt.get(i).get(0).equals(this.ans[i]))
                {
                    System.out.println("right ans");
                }
                else {
                    System.out.println("Wrong ans");
                }
                continue;

            }

            if(a==2)
            {
                if(opt.get(i).get(1).equals(this.ans[i]))
                {
                    System.out.println("right ans");

                }
                else {
                    System.out.println("Wrong ans");
                }
                continue;


            }
            if(a==3)
            {
                if(opt.get(i).get(2).equals(this.ans[i]))
                {
                    System.out.println("right ans");
                }
                else {
                    System.out.println("Wrong ans");
                }
                continue;

            }









        }










    }

    public static void main(String[] args) {
        Quiz person1= new Quiz("raj");
        person1.start();


    }

}
