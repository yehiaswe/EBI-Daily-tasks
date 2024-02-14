import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner sc=new Scanner(System.in);
//        ArrayList<String> mvs = new ArrayList<String>();                              ///////////////////with arrylst
//        Collections.addAll(mvs,"saw","batman","lol","it","barbie","avatar");
//        ArrayList<String> gnrs = new ArrayList<String>();
//        Collections.addAll(gnrs,"horror","action","comedy","horror","comedy","action");
//        ArrayList<Integer> scores=new ArrayList<Integer>();
//        Collections.addAll(scores,0,0,0,0,0,0);
//        System.out.println("please enter to search by movie name or genere");
//        while (true)
//        {
//            String input=sc.next();
//            if(input.equals("exit"))
//            {
//                System.out.println("you entered exit...program is closing");
//                break;
//            }
//            if (mvs.contains(input)) {
//                int index = mvs.indexOf(input);
//                System.out.println("movie genere is " + gnrs.get(index));
//                scores.set(index,((scores.get(index))+1));
//            } else if (gnrs.contains(input)) {
//                for (int i = 0; i < gnrs.size(); i++) {
//                    if (gnrs.get(i).equals(input)) {
//                        System.out.println("movie name is " + mvs.get(i));
//                    }
//                }
//            } else {
//                System.out.println("not found - invalid input");
//            }
//        }
//        System.out.println("//////////search history is");/////////////////////////////srch history is
//        for(int i=0;i<mvs.size();i++)
//        {
//            System.out.println(mvs.get(i)+" movie was searched "+scores.get(i)+" times");
//        }
        /////////////////////////////////////////////// ^^^^ with array list ^^^^
        LinkedHashMap<String,String> gnrsNmmvs=new LinkedHashMap<>();   ///////////////////with hashmap
        gnrsNmmvs.put("saw","horror");
        gnrsNmmvs.put("it","horror");
        gnrsNmmvs.put("lol","comedy");
        gnrsNmmvs.put("barbie","comedy");
        gnrsNmmvs.put("avatar","action");
        gnrsNmmvs.put("batman","action");
        System.out.println(gnrsNmmvs);
        System.out.println("please enter to search by movie name or genere");
        while (true)
        {
            String input = sc.next();
            if (input.equals("exit")) {
                System.out.println("you entered exit...program is closing");
                break;
            }
            if (gnrsNmmvs.containsKey(input))
            {
                System.out.println("movie genere is " + gnrsNmmvs.get(input));
            }
            else if (gnrsNmmvs.containsValue(input))
            {
                for (Map.Entry<String, String> entry : gnrsNmmvs.entrySet())
                {
                    if (entry.getValue().equals(input))
                    {
                        System.out.println("movie name is " + entry.getKey());
                    }
                }
            }
            else
            {
                System.out.println("not found - invalid input");
            }
        }//////////////////for frqwncs make another hashmap of mvs and zeros and if fwnd mvs incrmnt zeros
        /////////////////////////////////////////////// ^^^^ with hash map ^^^^
        //////////////////// na2s most srchd fl tra2ten arry lst n hashmap
    }
}