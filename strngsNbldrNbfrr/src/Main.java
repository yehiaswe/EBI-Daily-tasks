public class Main {
    public static void main(String[] args) {
//        System.out.println("i love java i love backend");
//        String s="normal string";
//        StringBuilder sb=new StringBuilder("builder string");
        String word ="i love java i love backend";
        System.out.println("\neach word have chars no equals\n");
        int count=0;
        for (int i=0;i<word.length();i++)
        {
            if(word.charAt(i)!=' ')
            {
                count++;
            }
            if(word.charAt(i)==' ' || i==word.length()-1)
            {
                System.out.println("word chars eqwals :"+count);
                count=0;
            }
        }
    }
}