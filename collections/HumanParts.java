package com.xworkz.practice.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HumanParts {
    public static void main(String[] args) {
        Collection<String> humanParts= new ArrayList<String>();
        humanParts.add("eye");
        humanParts.add("ear");
        humanParts.add("nose");
        humanParts.add("mouth");
        humanParts.add("hands");
        humanParts.add("legs");
        humanParts.add("neck");
        humanParts.add("shoulder");
        humanParts.add("heart");
        humanParts.add("kidney");
        humanParts.add("lungs");
        humanParts.add("liver");
        humanParts.add("stomach");
        humanParts.add("arms");
        humanParts.add("Brain");
        humanParts.add("elbow");
        humanParts.add("head");
        humanParts.add("nervous system");
        humanParts.add("ankle");
        humanParts.add("endocrine system");


        humanParts.add("reproductive system");
        humanParts.add("teeth");
        humanParts.add("digestive system");
        humanParts.add("knee");
        humanParts.add("ribs");
        humanParts.add("arteries");
        humanParts.add("spleen");
        humanParts.add("bone marrow");
        humanParts.add("veins");
        humanParts.add("gallbladder");
        humanParts.add("skeleton");
        humanParts.add("intestines");
        humanParts.add("pancreas");
        humanParts.add("lymph nodes");
        humanParts.add("muscles");
        humanParts.add("pharynx");
        humanParts.add("larynx");
        humanParts.add("skull");
        humanParts.add("thyroid");
        humanParts.add("throat");

        humanParts.add("abdomen");
        humanParts.add("appendix");
        humanParts.add("bone");
        humanParts.add("skin");
        humanParts.add("fingers");
        humanParts.add("cranial cavity");
        humanParts.add("trachea");
        humanParts.add("bronchi");
        humanParts.add("salivary glands");
        humanParts.add("joints");
        humanParts.add("cardiovascular");
        humanParts.add("mandible");
        humanParts.add("artery");
        humanParts.add("left femur");
        humanParts.add("right femur");
        humanParts.add("left patella");
        humanParts.add("right patella");
        humanParts.add("right tibia");
        humanParts.add("left tibia");
        humanParts.add("cervical vertebrae");

        humanParts.add("fibula");
        humanParts.add("carpals");
        humanParts.add("humerus");
        humanParts.add("scapula");
        humanParts.add("metacarpals");
        humanParts.add("hip bone");
        humanParts.add("upper limbs");
        humanParts.add("lower limbs");
        humanParts.add("lower jaw");
        humanParts.add("forArm bone");
        humanParts.add("calf bone");
        humanParts.add("shin bone");
        humanParts.add("foot bone");
        humanParts.add("cerebrum");
        humanParts.add("spinal cord");
        humanParts.add("cerebellum");
        humanParts.add("central sulcus");
        humanParts.add("pulmonary value");
        humanParts.add("pericardium");
        humanParts.add("Aorta");

        Iterator<String> iterator=humanParts.iterator();
        while(iterator.hasNext()) {
            String ref = iterator.next();
            System.out.println("human parts name:" + ref);
            if (ref.length() <= 5) {
                System.out.println("Human parts  name less than 5 characters:" + ref);
                System.out.println("=====================================");
            }


        }


    }
}
