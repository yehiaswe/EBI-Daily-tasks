public class Parent implements Joking {
     static int pSTATICAGE=90;
     int pnonsttcage=50;
    void greeting()
    {
        System.out.println("hello im a parent");
    }
    void working()
    {
        System.out.println("im parent working");
    }
    @Override
    public void jokes()
    {
        System.out.println("im parent i joke rarely");
    }
}
