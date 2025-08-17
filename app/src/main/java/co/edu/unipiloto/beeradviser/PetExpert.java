package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class PetExpert {
    public List<String> getBreeds(String category) {
        List<String> breeds = new ArrayList<>();

        if ("Pastores".equals(category)) {
            breeds.add("Pastor Catalán");
            breeds.add("Pastor Alemán");
            breeds.add("Komodor");
            breeds.add("Pastor Australiano");
        } else if ("Pinscher".equals(category)) {
            breeds.add("Dobermann");
            breeds.add("Pinscher Alemán");
            breeds.add("Pinscher Miniatura");
            breeds.add("Schnauzer");
        }

        return breeds;
    }
}