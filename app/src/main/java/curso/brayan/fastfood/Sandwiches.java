package curso.brayan.fastfood;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Sandwiches extends AppCompatActivity {


    private Sandwich sandwich;
    private ImageView imageViewSandwiches;
    private TextView  SandwichesName;
    private TextView  DescriptionSandwiches;
    private TextView  PriceSandwiches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwiches);

        // Navbar
        ActionBar actionBar = getSupportActionBar();
        sandwich = (Sandwich) getIntent().getSerializableExtra("sandwich");
        actionBar.setTitle(sandwich.getName());


        imageViewSandwiches = (ImageView) findViewById(R.id.imageViewSandwiches);
        SandwichesName = (TextView) findViewById(R.id.SandwichesName);
        DescriptionSandwiches = (TextView) findViewById(R.id.DescriptionSandwiches);
        PriceSandwiches = (TextView) findViewById(R.id.PriceSandwiches);

        imageViewSandwiches.setImageResource(sandwich.getIdImage());
        SandwichesName.setText(sandwich.getName());
        DescriptionSandwiches.setText(sandwich.getDescription());
        PriceSandwiches.setText(sandwich.getPrice());


    }
}
