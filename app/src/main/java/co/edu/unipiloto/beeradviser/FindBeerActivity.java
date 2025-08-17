package co.edu.unipiloto.beeradviser;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    private final BeerExpert beerExpert = new BeerExpert();
    private final PetExpert petExpert = new PetExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
    }

    // Método para buscar cervezas
    public void onClickFindBeer(View view) {
        Spinner colorSpinner = findViewById(R.id.beer_color);
        String beerType = String.valueOf(colorSpinner.getSelectedItem());

        List<String> brandsList = beerExpert.getBrands(beerType);

        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append("\n");
        }

        TextView brands = findViewById(R.id.brands);
        brands.setText(brandsFormatted.toString());
    }
    public void onClickFindPet(View view) {
        Spinner categorySpinner = findViewById(R.id.pet_category);
        String category = String.valueOf(categorySpinner.getSelectedItem());

        List<String> breedsList = petExpert.getBreeds(category);

        StringBuilder breedsFormatted = new StringBuilder();
        for (String breed : breedsList) {
            breedsFormatted.append(breed).append("\n");
        }

        TextView breedsText = findViewById(R.id.pet_breeds);
        breedsText.setText(breedsFormatted.toString());
    }
}

