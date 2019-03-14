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

        Bundle arguments = getIntent().getExtras();

        String name = null;
        if (arguments != null) {
            name = arguments.getString("name");
        }

        textView.setText(name);
    }
}
