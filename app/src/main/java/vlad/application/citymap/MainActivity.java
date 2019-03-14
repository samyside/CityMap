package vlad.application.citymap;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private LinearLayout mainLayout;

    private String name;
    private String company;
    private int salary;

    Intent intent = new Intent(this, DescriptionActivity.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = findViewById(R.id.mainLayout);

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
        TextView header = findViewById(R.id.header01);
        String name = header.getText().toString();

        TextView description = findViewById(R.id.desc02);
        String desc = description.getText().toString();

        intent.putExtra("header", name);
        intent.putExtra("description", desc);
        startActivity(intent);
    }

    public void onClickOpenFrame02(View view) {
        TextView header = findViewById(R.id.header02);
        String name = header.getText().toString();

        TextView description = findViewById(R.id.desc02);
        String desc = description.getText().toString();

        intent.putExtra("header", name);
        intent.putExtra("description", desc);

        startActivity(intent);
    }

    @SuppressLint("ShowToast")
    public void removeAll(View view) {
        Toast.makeText(MainActivity.this, "All views has been remove", Toast.LENGTH_LONG).show();

        mainLayout = findViewById(R.id.mainLayout);
    }
}







































