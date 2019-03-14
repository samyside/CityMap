package vlad.application.citymap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        TextView textView = findViewById(R.id.dataActivity);
        TextView textView1 = findViewById(R.id.descriptionActivity);

        Bundle arguments = getIntent().getExtras();

        String header = null;
        String desc = null;
        if (arguments != null) {
            header = arguments.getString("header");
        }

        if (arguments != null) {
            desc = arguments.getString("description");
        }

        textView.setText(header);
        textView1.setText(desc);
    }
}
