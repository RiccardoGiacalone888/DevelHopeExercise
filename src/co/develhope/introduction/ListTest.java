package co.develhope.introduction;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        // String [] cityName = {"Palermo", "Roma", "Milano"};
        // List <String> array = Arrays.asList(cityName);
        //System.out.println("The city is = " + cityName[1]);
        // try {cityName.add("Genova")} ; try' without 'catch', 'finally' or resource declarations
        //System.out.println("impossible to add a new array, the list is unmodifiable ");
        List<String> cityNames = new ArrayList<>();
        cityNames.add("Palermo");
        cityNames.add("Milano");
        cityNames.add("Parigi");
        System.out.println(cityNames.get(1));
        cityNames.add(1, "Tegucigalpa");
        System.out.println(cityNames.get(1)); // Modified item
        for (String cityName : cityNames) {
            System.out.println(cityNames);//print in console all the item

            List <String> kingsOfRome = new ArrayList<>();
            kingsOfRome.add("Romolo");
            kingsOfRome.add("Numa Pompilio");
            kingsOfRome.add("Tullo Ostilio");
            kingsOfRome.add("Anco Marzio");
            kingsOfRome.add("Tarquinio Prisco");
            kingsOfRome.add("Servio Tullio");
            kingsOfRome.add("Tarquinio il Superbo");

            //Convert kingsOfRome into an array called kingsOfRomeArray,
            String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
            //the add change beacause the list now are a fixed size
            kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
            // print the elment of kingsOfRomeArray
            System.out.println(Arrays.toString(kingsOfRomeArray));



        }
    }
}
