package vlad.application.citymap;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout mainLayout;
    RelativeLayout orderOfList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = findViewById(R.id.mainLayout);

        ImageView imageView = new ImageView(MainActivity.this);
        imageView.setImageResource(R.drawable.glass_cat);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        imageView.setLayoutParams(layoutParams);

        mainLayout.addView(imageView);
    }

    @SuppressLint("ShowToast")
    public void removeAll(View view) {
        Toast.makeText(MainActivity.this, "All views has been remove", Toast.LENGTH_LONG).show();

        mainLayout = findViewById(R.id.mainLayout);


    }
}
