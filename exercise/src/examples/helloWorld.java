package examples;

public class helloWorld {
    String hw = "Hello World";

    public void exemple01(String hello) {
        this.hw = hello;
    }

    public String getHw() {
        return hw;
    }

    @Override
    public String toString() {
        return getHw();
    }
}
