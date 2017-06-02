package andrewthomas.brewery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list_options);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView, View view, int position, long id) {
                final String recipeTitle = listView.getItemAtPosition(position).toString();
                Intent intent = new Intent(MainActivity.this, RecipeActivity.class);
                intent.putExtra("RecipeTitle", recipeTitle);
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(itemClickListener);

    }
}
