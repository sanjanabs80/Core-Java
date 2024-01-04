package com.xworkz.practice.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Park {
    public static void main(String[] args) {

        Collection<String> park = new ArrayList<String>();
        park.add(" pench");
        park.add(" Ranthambore");
        park.add(" gir");
        park.add(" Manas");
        park.add(" Namdapha");
        park.add(" Bandipur");
        park.add(" periyar");
        park.add("Kuno");
        park.add(" Sariska");
        park.add("Dudhwa");

        park.add("Great himalayan");
        park.add("Mouling");
        park.add(" Stpura");
        park.add(" Campbell");
        park.add(" papikonda");
        park.add("Saddle peak");
        park.add(" sri venkateshwara");
        park.add(" Tadoba");
        park.add(" Madhav");
        park.add(" Sundarbans");

        park.add("Anamudi shola ");
        park.add(" Balphakram");
        park.add(" Anshi  national park");
        park.add(" omkareshwara");
        park.add(" Bannerghatta");
        park.add(" Betla national park");
        park.add(" Bhitarkanika");
        park.add(" Bison national park");
        park.add("Blackbuck");
        park.add(" Buxa tiger reserve");

        park.add("Campbell bay");
        park.add("Chandoli");
        park.add("Clouded leopard");
        park.add("dachigam national park");
        park.add("Rajiv gandhi");
        park.add("Valmiki");
        park.add("pin valley");
        park.add("Hemis national park");
        park.add("silent valley");
        park.add("Kudremukh");

        park.add(" Central Park");
        park.add("  Hyde Park");
        park.add("Griffith ");
        park.add("Golden Gate");
        park.add("Stanley");
        park.add("Tiergarten");
        park.add("Yoyogi ");
        park.add("Chapultepec");
        park.add("Phoenix");
        park.add(" Elysian ");

        park.add(" Villa Borghese Gardens ");
        park.add(" High Park");
        park.add("  Royal National  ");
        park.add("Parc Güell ");
        park.add("  Parc des Buttes ");
        park.add("Kaziranga national ");
        park.add("kanha ");
        park.add(" bandhavgarh ");
        park.add("sundarbuns ");
        park.add("Corbett ");
        Iterator<String> iterator = park.iterator();
        while (iterator.hasNext()) {
            String ref = iterator.next();
            System.out.println("park name:" + ref);


            if (ref.startsWith("B") || ref.endsWith("k")) {
                System.out.println("park  name ends with k and starts with b:" + ref);
                System.out.println("=====================================");
            }


        }
    }
}



