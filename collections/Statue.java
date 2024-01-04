package com.xworkz.practice.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Statue {
    public static void main(String[] args) {

        Collection<String> statue = new ArrayList<String>();
        statue.add("Gandhi");
        statue.add("Padmasambhava");
        statue.add("Basaveshwara");
        statue.add("Hanuman");
        statue.add("Lord shiva");
        statue.add("Paritala Anjaneya");
        statue.add("Unity");
        statue.add("Murugan");
        statue.add("Vishno devi");
        statue.add("Valluvar");

        statue.add("Dhyan Buddha");
        statue.add("Adiyogi");
        statue.add("Jatayu Earth");
        statue.add("Swami vivekananda");
        statue.add("Murudeshwara");
        statue.add("Basava");
        statue.add("Ambedkar");
        statue.add("Tathagata Tsal");
        statue.add("panchamukhi hanuman");
        statue.add("thanthai periyar");

        statue.add("Christ the Redeemer");
        statue.add("The Great Sphinx of Giza ");
        statue.add(" Statue of David");
        statue.add("  The Terracotta Army");
        statue.add(" The Pieta");
        statue.add("   The Charging Bull");
        statue.add(" Angel of the North");
        statue.add(" The Little Mermaid");
        statue.add("  The Motherland Calls ");
        statue.add("  The King Sejong");

        statue.add("  The Ushiku Daibutsu");
        statue.add(" The Bronze Horseman");
        statue.add(" The Michael Jackson");
        statue.add("  The Lion of Lucerne");
        statue.add(" Mount Rushmore");
        statue.add("thanthai periyar");
        statue.add("The Venus de Milo");
        statue.add("The Manneken Pis");
        statue.add(" The Four Dachshunds");
        statue.add(" The Equestrian");


        Iterator<String> iterator = statue.iterator();
        while (iterator.hasNext()) {
            String ref = iterator.next();
            System.out.println("statue name:" + ref);
            if (ref.endsWith("r")) {
                System.out.println("statue  name ends with:" + ref);
                System.out.println("=====================================");
            }


        }
    }
}
