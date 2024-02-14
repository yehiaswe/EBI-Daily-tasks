import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String srchkey;
        int incrmnt,index;
        System.out.println("welcome to the contact app \n");
        ArrayList<Integer> scores=new ArrayList<>();
        Collections.addAll(scores,0,0,0,0,0);                               ////// search history scores list incrmntd when srchd
        ArrayList<String> names=new ArrayList<>();
        Collections.addAll(names,"mark","john","sam","chester","jeff");     ////// names list
        ArrayList<String> nums=new ArrayList<>();
        Collections.addAll(nums,"011","012","013","014","015");             ////// numbers list
        Scanner sc=new Scanner(System.in);
        System.out.println("////////////////////////////////////////hello user enter your name");
        String uinput= sc.next();
        System.out.println("hello "+uinput+" to search by no or by name please enter");
        while (true)
        {
            System.out.println("/////////////////////////////////////////// enter input");
            uinput= sc.next();
            char firstChar = uinput.charAt(0);
            if(Character.isDigit(firstChar)==true && !uinput.equals("exit") && nums.contains(uinput))
            {
                //// chck if number is entered - first character if is digit & not eqwl exit and check avlblty
                index = nums.indexOf(uinput);
                srchkey = names.get(index);
                System.out.println("/////////////////////////////////////////// srch is "+srchkey);
                incrmnt=scores.get(index)+1;
                scores.set(index,incrmnt);
            }
            else if(Character.isDigit(firstChar)==false && !uinput.equals("exit") && names.contains(uinput))
            {
                //// chck if name is entered - first character if is character & not eqwl exit and check avlblty
                index = names.indexOf(uinput);
                srchkey = nums.get(index);
                System.out.println("/////////////////////////////////////////// srch is "+srchkey);
                incrmnt=scores.get(index)+1;
                scores.set(index,incrmnt);
            }
            else if(uinput.equals("exit")){
                System.out.println("//////////////////////////////////////////////////////program closed");
                break;
            }
            else {
                System.out.println("/////////////////////////////////////////////not found invalid input");
            }
        }
        System.out.println("///////////////////////////////////////////////////////////Search history is");
        for(int i=0;i< names.size();i++)
        {
            System.out.println(names.get(i)+" was searched "+scores.get(i)+" times");
        }
        System.out.println("////////////////////////////////////////////////////////////////////////////");
    }
}