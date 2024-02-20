import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score;
        int finalscoredct=0;
        String capital;
        ArrayList<String> names=new ArrayList<>();
        ArrayList<Integer> scores=new ArrayList<>();
        System.out.println("hello welcome to the country game\n");
        int i=0;
        ///////////////////
        readfile();
        System.out.println("\n");
        //////////////////
        while (i<3)
        {
            score=0;
            System.out.println("hello player please enter your name");
            String name=sc.next();
            names.add(name);
            System.out.println("what is the capital of egypt");
            capital=sc.next();
            if(capital.equals("cairo"))
            {
                score++;
            }
            System.out.println("what is the capital of usa");
            capital=sc.next();
            if(capital.equals("ws"))
            {
                score++;
            }
            System.out.println("what is the capital of uk");
            capital=sc.next();
            if(capital.equals("london"))
            {
                score++;
            }
            if(score==3)
            {
                finalscoredct++;
            }
            scores.add(score);
            i++;
        }
        System.out.println("players are "+names);
        System.out.println("scores are "+scores);
        int max=0;
        StringBuilder winner=new StringBuilder(" ");
        for(i=0;i<scores.size();i++)
        {
            if(scores.get(i)>max)
            {
                max=scores.get(i);
                winner=new StringBuilder(names.get(i));
            }
        }
        System.out.println("winner is "+winner);
        try (
                FileWriter fw=new FileWriter("winner.txt");
                BufferedWriter bw=new BufferedWriter(fw);
            )
        {
            bw.write("Leaderboard");
            bw.newLine();
            bw.write("last winner is "+winner);
            bw.newLine();
            bw.write("last player is "+names.get(names.size()-1));
            bw.newLine();
            bw.write("ammount of ppl scored final score equls "+finalscoredct);
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    private static void readfile() {
        try (
                FileReader fr = new FileReader("winner.txt");
                BufferedReader br=new BufferedReader(fr);
        )
        {
            while (true)
            {
                String line=br.readLine();
                if(line==null)
                {
                    break;
                }
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}