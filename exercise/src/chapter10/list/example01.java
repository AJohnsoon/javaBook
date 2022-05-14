package chapter10.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class example01 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Allan");
        list.add("M. Mayara");
        list.add("Pedro Henrique");
        list.add("Theo Leal");
        list.add("Maria Clara");
        list.add(2, "Alexandre");
        list.add(5, "Maria do Carmo");
        list.add("Boto cor-de-rosa");

        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println("Contain: "+list.contains("Theo Leal"));
        System.out.println("Change position value: " + list.set(1, "Maria Mayara"));
        System.out.println("Remove(name): " + list.remove("Boto cor-de-rosa"));
        list.add("The boto is back!");
        System.out.println("Remove(position): " + list.remove(7));

        System.out.println("_____________");

        for (String peopleList : list){
            System.out.println(peopleList);
        }
        System.out.println("_____________");

        list.add("Boto News");
        System.out.println("Predicate[used Lambda]: "+ list.removeIf(x -> x.charAt(0) == 'B'));
        System.out.println("Element position: "+ list.indexOf("Pedro Henrique"));

        List<String> resultFilter = list.stream().filter(x -> x.contains("Maria do Carmo")).collect(Collectors.toList());

        for (String containName: resultFilter) {
            System.out.println("List Stream [with lambda function]:" + containName);
        }

        System.out.println("_____________");
        String name = list.stream().filter(x->x.charAt(0) == 'P').findFirst().orElse("Element not exist");
        String notExistInList = list.stream().filter(value -> value.contains("z")).findFirst().orElse(null);
        System.out.println("Find Stream[for first letter]: " + name);
        System.out.println("FindStream[Not Exist Value]: "+ notExistInList);
//        String validator = String.valueOf(list.stream().filter(x-> x.getId().equals(finalEmployer.getId())).findAny().orElse(null));

    }
}
