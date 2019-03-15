package vlad.application.citymap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import vlad.application.item.Item;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        final TextView textView = findViewById(R.id.dataActivity);
        final TextView textView1 = findViewById(R.id.descriptionActivity);

        Bundle arguments = getIntent().getExtras();

        final Item items;
        if (arguments != null) {
            items = (Item) arguments.getSerializable(Item.class.getSimpleName());
            assert items != null;
            textView.setText(items.getHeader());
            textView1.setText(items.getDescription());
        }

    }
}
