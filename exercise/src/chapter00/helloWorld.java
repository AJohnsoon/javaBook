package chapter00;

public class helloWorld {
    String hw = "Hello World";

    public String getHw() {
        return hw;
    }

    @Override
    public String toString() {
        return getHw();
    }
}
