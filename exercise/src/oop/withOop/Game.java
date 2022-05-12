package oop.withOop;

import oop.withOop.entities.Person;

public class Game {
    public static void main(String[] args){
        Person odin = new Person();
        odin.pegarVoo();
        odin.pegarVoo();
        odin.moverPersonagem();
        odin.pegarVoo();
        System.out.println(odin);
    }
}
