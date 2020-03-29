package curso.brayan.fastfood;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
import java.util.ArrayList;


public class Menu extends AppCompatActivity {

   private Button sandwichesitalianobutton;
   private Button sandwicheschacarerobutton;
   private Button sandwichesbarroslucobutton;
   private Button sandwichesbarrosjarpabutton;
   private Button sandwichesvegetarianobutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        // Navbar
        final ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        final ArrayList<Sandwich> all_sandwich;
        sandwichesitalianobutton = findViewById(R.id.ButtonSandwichesItaliano);
        sandwicheschacarerobutton = findViewById(R.id.ButtonSandwichesChacarero);
        sandwichesbarroslucobutton = findViewById(R.id.ButtonSandwichesBarrosLuco);
        sandwichesbarrosjarpabutton = findViewById(R.id.ButtonSandwichesBarrosJarpa);
        sandwichesvegetarianobutton = findViewById(R.id.ButtonSandwichesVegetariano);

        all_sandwich = new ArrayList<Sandwich>();


        all_sandwich.add(new Sandwich(getResources().getString(R.string.sandwiches_italiano),getResources().getString(R.string.sadwiches_italiano_detail),getResources().getString(R.string.sadwiches_italiano_price),(R.drawable.italiano)));
        all_sandwich.add(new Sandwich(getResources().getString(R.string.sandwiches_chacarero),getResources().getString(R.string.sadwiches_chacarero_detail),getResources().getString(R.string.sadwiches_chacarero_price),(R.drawable.chacareroo)));
        all_sandwich.add(new Sandwich(getResources().getString(R.string.sanwiches_barros_luco),getResources().getString(R.string.sadwiches_barros_luco_detail),getResources().getString(R.string.sadwiches_barros_luco_price),(R.drawable.barrosluco)));
        all_sandwich.add(new Sandwich(getResources().getString(R.string.sadwiches_barros_jarpa),getResources().getString(R.string.sadwiches_barros_jarpa_detail),getResources().getString(R.string.sadwiches_barros_jarpa_price),(R.drawable.barrosjarpa)));
        all_sandwich.add(new Sandwich(getResources().getString(R.string.sadwiches_vegetariano),getResources().getString(R.string.sadwiches_vegetariano_detail),getResources().getString(R.string.sadwiches_vegetariano_price),(R.drawable.vegetariano)));


        sandwichesitalianobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Sandwiches.class);
                Bundle b = new Bundle();
                b.putSerializable("sandwich", (Serializable) all_sandwich.get(0));
                intent.putExtras(b);
                view.getContext().startActivity(intent);
            }
        });
        sandwicheschacarerobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Sandwiches.class);
                Bundle b = new Bundle();
                b.putSerializable("sandwich", (Serializable) all_sandwich.get(1));
                intent.putExtras(b);
                view.getContext().startActivity(intent);
            }
        });
        sandwichesbarroslucobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Sandwiches.class);
                Bundle b = new Bundle();
                b.putSerializable("sandwich", (Serializable) all_sandwich.get(2));
                intent.putExtras(b);
                view.getContext().startActivity(intent);
            }
        });
        sandwichesbarrosjarpabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Sandwiches.class);
                Bundle b = new Bundle();
                b.putSerializable("sandwich", (Serializable) all_sandwich.get(3));
                intent.putExtras(b);
                view.getContext().startActivity(intent);
            }
        });
        sandwichesvegetarianobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Sandwiches.class);
                Bundle b = new Bundle();
                b.putSerializable("sandwich", (Serializable) all_sandwich.get(4));
                intent.putExtras(b);
                view.getContext().startActivity(intent);
            }
        });

    }
}
