package Anya_programist.collection.list.linkedList;

import Anya_programist.typeinfo.pets.Pet;
import Anya_programist.typeinfo.pets.Pets;
import Anya_programist.typeinfo.pets.Rat;

import java.util.LinkedList;

public class LinkedListFeature {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<Pet>(Pets.arrayList(5));
        System.out.println(pets);
            //идентично
            System.out.println("pets.getFirst(): " + pets.getFirst());
            System.out.println("pets.element(): " + pets.element());

            //отличается только поведение для пустого списка
            System.out.println("pets.peek(): " + pets.peek());

            //идентично; удаление и возвращение первого элемента
            System.out.println("pets.remove(): " + pets.remove());
            System.out.println("pets.removeFirst(): " + pets.removeFirst());

            //
            System.out.println("pets.poll(): " + pets.poll());
            System.out.println(pets);
            pets.addFirst(new Rat());
            System.out.println("После addFirst(): " + pets);
            pets.offer(Pets.randomPet());
            System.out.println("После offer(): " + pets);
            pets.add(Pets.randomPet());
            System.out.println( "После add(): " + pets);

    }
}
