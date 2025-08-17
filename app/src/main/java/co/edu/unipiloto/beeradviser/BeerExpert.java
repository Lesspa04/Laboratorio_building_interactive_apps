package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;
public class BeerExpert {
    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if ("Light".equals(color)) {
            brands.add("Corona");
            brands.add("Bud Light");
        } else if ("Amber".equals(color)) {
            brands.add("Dos Equis Ambar");
            brands.add("Fat Tire Amber Ale");
        } else if ("Brown".equals(color)) {
            brands.add("Newcastle Brown Ale");
            brands.add("Samuel Smith Nut Brown");
        } else if ("Dark".equals(color)) {
            brands.add("Guinness");
            brands.add("Porterhouse Oyster Stout");
        }
        return brands;
    }
}
