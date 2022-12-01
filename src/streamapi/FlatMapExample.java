package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {

        // creating arraylist
        List<String> productList1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");
        List<String> productList2 = Arrays.asList("Scanner", "Projector", "Lighter");
        List<String> productList3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");
        List<String> productList4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");

        List<List<String>> allProducts = new ArrayList<List<String>>();

        // adding element to the list
        allProducts.add(productList1);
        allProducts.add(productList2);
        allProducts.add(productList3);
        allProducts.add(productList4);

        // original productList
        System.out.println("Original Product list");
        System.out.println(allProducts);

        System.out.println();
        // creating list of all products
        List<String> listOfAllProducts = new ArrayList<String>();

        // forEach loop iterate the over list
        for (List<String> prod : allProducts) {
            for (String product : prod) {
                //adds all products to the list
                listOfAllProducts.add(product);
            }
        }

        System.out.println("List Before Applying mapping and Flattening: \n");
        //prints stream before applying the flatMap() method
        System.out.println(listOfAllProducts);

        System.out.println();
        //creates a stream of elements using map()
        List<Stream<String>> mapList = allProducts.stream().map(Collection::stream).collect(Collectors.toList());
        System.out.println("List After Applying only Mapping Operation: \n");
        //prints the new stream that we get after applying mapping and flattening
        System.out.println(mapList);

        System.out.println();
        //creates a stream of elements using flatMap()
        List<String> flatMapList = allProducts.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println("List After Applying Mapping and Flattening Operation: \n");
        //prints the new stream that we get after applying mapping and flattening
        System.out.println(flatMapList);


    }
}
