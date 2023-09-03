package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> countryList = new ArrayList<>();
        countryList.add("Sri Lanka");
        countryList.add("England");
        countryList.add("Canada");
        countryList.add("Australia");
        //without streams
/**       Collections.sort(countryList);
        for(String country : countryList){
            if(!country.startsWith("C"))
            System.out.println(country.toUpperCase());
  }*/
        //Above logic can be implemented using streams | way 1
        countryList.stream().map(s -> s.toUpperCase()).filter(s -> !s.startsWith("C")).sorted().forEach(s -> System.out.println(s));

        //Above logic can be implemented using streams | way 2
        Stream<String> countryStream = countryList.stream();
        countryStream.sorted().filter(s -> !s.startsWith("C"))
                .map(s -> s.toUpperCase()).
                forEach(s -> System.out.println(s));

        //streaming for array
        Integer[] arr = new Integer[]{5,2,1};
        Stream<Integer> arrStream = Arrays.stream(arr);
        arrStream.sorted().forEach(i -> System.out.println(i) );

        //save filtered countries into a new list


        Stream<String> countryStream2 = countryList.stream();
        List<String> newCountryList = countryStream2.sorted().filter(s -> !s.startsWith("C"))
                .map(s -> s.toUpperCase()).
                collect(Collectors.toList());

        System.out.println(newCountryList);

    }
}
