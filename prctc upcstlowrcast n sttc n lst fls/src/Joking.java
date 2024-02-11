public interface Joking {
    void jokes();
    default void kidding()
    {
        System.out.println("im kidding");
    }
}
