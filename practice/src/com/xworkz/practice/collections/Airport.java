package com.xworkz.practice.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Airport {

    public static void main(String[] args) {

        Collection<String> airport = new ArrayList<String>();
        airport.add("Kempegowda");
        airport.add("Indira gandhi");
        airport.add("Kolkata");
        airport.add("Birsa munda");
        airport.add("CHENNAI");
        airport.add("GAYA");
        airport.add("CHHATRAPATI SHIVAJI");
        airport.add("COCHIN");
        airport.add("rajiv gandhi");
        airport.add("ambikapur");
        airport.add("Biju patnaik");
        airport.add("Dabolim");
        airport.add("GOA");
        airport.add("Rajahmundry");
        airport.add("Trivandrum");
        airport.add("Veer savarkar international");
        airport.add("Diu");
        airport.add("jaipur");
        airport.add("Jorhat");
        airport.add("kandla");
        airport.add("Lilabari");
        airport.add("Sri guru ram dass jee international");
        airport.add("Lokpriya gopinath Bordoloi");
        airport.add("Sardar vallabhhai patel");
        airport.add("Manglore international");


        airport.add("CALICUT");
        airport.add("TRIVANDRUM");
        airport.add("TIRUCHIRAPPALLI");
        airport.add("CHAUDARY CHARAN SINGH");
        airport.add("LAL BAHADUR SHASTRI");
        airport.add("NETAJI SUBHASH CHANDRA BOSE");
        airport.add("kannur international");
        airport.add("surat");
        airport.add("Devi ahilya bai holkar");
        airport.add("coimbatore");
        airport.add("Sheikh-ul-Aalam");
        airport.add("Impal international");
        airport.add("Madurai");
        airport.add("Bagdogra international");
        airport.add("Chandigarh");
        airport.add("Nashik");
        airport.add("Vadodara");
        airport.add("kushinagar");
        airport.add("DENVER");
        airport.add("DFW");
        airport.add("ORLANDO");
        airport.add("SAN FRANCISO");
        airport.add("GEORGE BUSH");
        airport.add("LOS ANGELES");
        airport.add("WASHINGTON DULLES");


        airport.add("McCARRAN");
        airport.add("hartsfield");
        airport.add("Detroit");
        airport.add("salt lake");
        airport.add("hubli");
        airport.add("Jindal vijayanagar");
        airport.add("Mysore airport");
        airport.add("Kuvempu");
        airport.add("HAL");
        airport.add("JAKKUR");
        airport.add("HARIHARA AIRPORT");
        airport.add("car nicobar");
        airport.add("jorhat");
        airport.add("north lakhimpur");
        airport.add("tezpur");
        airport.add("jamnagar");
        airport.add("bhavnagar");
        airport.add("agatti");
        airport.add("shillong");
        airport.add("agra");
        airport.add("allahabad");
        airport.add("gwalior");
        airport.add("pantnagar");
        airport.add("vishakapatnam");
        airport.add("jay prakash narayan international");


        airport.add("vijayawada international");
        airport.add("kadapa airport");
        airport.add("donakonda airstrip");
        airport.add("Along airport");
        airport.add("pasighat");
        airport.add("daporjio runway");
        airport.add("shibpur");
        airport.add("bobbili");
        airport.add("Mechuka");
        airport.add("walong");
        airport.add("zero airport");
        airport.add("chabua");
        airport.add("darrang");
        airport.add("cudappah kurnool");
        airport.add("rupsi");
        airport.add("PUDUCHERRY AIRPORT");
        airport.add("PORBANDAR AIRPORT");
        airport.add("rajkot");
        airport.add("kullu manali");
        airport.add("kolhapur sindhudurg ");
        airport.add("tirupati");
        airport.add("Bhuj airport");
        airport.add("lucknow  airport");
        airport.add("varanasi airport");
        airport.add("trichy airport");

        Iterator<String> iterator = airport.iterator();
        while (iterator.hasNext()) {
            String ref = iterator.next();



                System.out.println("airport  name  with uppercase:" + ref.toUpperCase());

            }


        }
    }







