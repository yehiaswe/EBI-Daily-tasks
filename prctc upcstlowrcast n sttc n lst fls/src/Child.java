public class Child extends Parent implements Joking{
    int fun=10;
    @Override
    void greeting() {
        System.out.println("hello im child greeting ovrdn");
    }


    public void jokes() {
        System.out.println("im a child i joke alot");
    }

    void playing()
    {
        System.out.println("hello im child playing");
    }
}
