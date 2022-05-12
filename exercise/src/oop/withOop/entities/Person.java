package oop.withOop.entities;

import oop.withOop.utils.Fly;

public class Person {
    private int position = 0;
    private int seMover = 0;
    private final Fly levantarVoo = new Fly();

    public Person(){}
    public Person(int position){
        this.position = position;
    }


    public int moverPersonagem(){
        if(this.seMover >= 0){
            this.position ++;
        }
        return this.seMover ++;
    }

    public int pegarVoo(){
        return levantarVoo.Flying() - 10;
    }
    @Override
    public String toString() {
        return "Viking{" +
                "poisition=" + position +
                ", seMover=" + moverPersonagem() +
                ", levantarVoo=" + pegarVoo() +
                '}';
    }

}
