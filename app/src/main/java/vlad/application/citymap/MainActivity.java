package vlad.application.citymap;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

import vlad.application.item.Item;

public class MainActivity extends AppCompatActivity implements Serializable {

    private LinearLayout mainLayout;

    Item items;
    Intent intent;
    TextView header;
    TextView description;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = findViewById(R.id.mainLayout);

        //training listView
        listView = findViewById(R.id.listView);
        final String[] listViewItems = new String[] {
                "Item_1", "Item_2", "Item_3", "Item_4", "Item_5",
                "Item_6", "Item_7", "Item_8", "Item_9", "Item_10"
        };
        // trying to use adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,listViewItems);
        listView.setAdapter(adapter);

        ImageView imageView = new ImageView(MainActivity.this);
        imageView.setImageResource(R.drawable.glass_cat);
        LinearLayout.LayoutParams layoutParams =
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
        imageView.setLayoutParams(layoutParams);

        mainLayout.addView(imageView);
    }

    public void onClickOpenFrame(View view) {
        final TextView tvHeader = findViewById(R.id.header01);
        String header = tvHeader.getText().toString();

        final TextView tvDescription = findViewById(R.id.desc01);
        String description = tvDescription.getText().toString();

        items = new Item(header, description);
        Intent intent = new Intent(this, DescriptionActivity.class);
        intent.putExtra(Item.class.getSimpleName(), items);
        startActivity(intent);
    }

    public void onClickOpenFrame02(View view) {
        this.header = findViewById(R.id.header02);
        String header = this.header.getText().toString();

        this.description = findViewById(R.id.desc02);
        String description = this.description.getText().toString();

        items = new Item(header, description);
        intent = new Intent(this, DescriptionActivity.class);

        intent.putExtra(Item.class.getSimpleName(), items);

        startActivity(intent);
    }

    @SuppressLint("ShowToast")
    public void removeAll(View view) {
        Toast.makeText(MainActivity.this, "All views has been remove", Toast.LENGTH_LONG).show();

        mainLayout = findViewById(R.id.mainLayout);
        mainLayout.removeAllViews();
    }

    public void createOrder(View view) {

    }
}







































