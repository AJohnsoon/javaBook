package chapter08.withOop.utils;

public class Fly {
    private int value = 0;
    public int Flying(){
        return this.value += 10;
    }

    @Override
    public String toString() {
        return "Fly{" +
                "value=" + value +
                '}';
    }
}
