package com.xworkz.practice.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class DanceForms {

    public static void main(String[] args) {

        Collection<String> danceforms = new ArrayList<>();
        danceforms.add("Bharathanatyam");
        danceforms.add("Kathak");
        danceforms.add("kathakali");
        danceforms.add("kuchipudi");
        danceforms.add("Garba");
        danceforms.add("Manipuri");

        System.out.println("Elements in the list:");
        for (String element : danceforms) {
            System.out.println(element);

        }
        System.out.println("============================");
        Iterator<String> iterator = danceforms.iterator();
        while (iterator.hasNext()) {
            String danceForm = iterator.next();
            System.out.println("Dance Form: " + danceForm);
        }
        System.out.println("============================");
        danceforms.remove("Garba");
        System.out.println("remove  one element from dance forms:" + danceforms);


        System.out.println("==================================");
        System.out.println("\nNumber of Dance Forms: " + danceforms.size());

        System.out.println("============================");
        System.out.println("Is the collection empty: " + danceforms.isEmpty());

        System.out.println("================================");
        System.out.println(" equals method :"
                + danceforms.equals(danceforms));

        System.out.println("=================================");
        if (danceforms.contains("Manipuri")) {
            System.out.println("manipuri dance form is present");
        } else {
            System.out.println("manipuri danceform is absent");
        }


        System.out.println("==========================");
        System.out.println("Initial collection value: " + danceforms);
        boolean b = Collections.addAll(danceforms, "salsa", "hip-hop", "break dance");
        System.out.println("Boolean Result: " + b);
        System.out.println("Final collection value: " + danceforms);


        System.out.println("==================================");
        Collection<String> danceforms1 = new ArrayList<>();
        danceforms1.add("kathakali");
        danceforms1.add("kathak");
        danceforms1.add("mohiniyattam");
        System.out.println(danceforms.containsAll(danceforms1));

        System.out.println("===============================");
        danceforms1.retainAll(danceforms);
        System.out.println(danceforms.containsAll(danceforms1));

        System.out.println("=============================");
        danceforms1.removeAll(danceforms1);
        System.out.println("danceforms remove method  "
                + danceforms1);

        System.out.println("========================");
        Object[] array = danceforms1.toArray();

        System.out.print("The Array contains : " + danceforms);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

            System.out.println("===================");
            
        }
    }
}











