package www.testing.login_autism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class parent_interface extends AppCompatActivity {

    Button socialmedia, dodonts, parent_home;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_interface);

        socialmedia = findViewById(R.id.parent_socialmedia);
        dodonts = findViewById(R.id.parent_do_donts);
        parent_home = findViewById(R.id.parent_home);
        floatingActionButton = findViewById(R.id.parent_floating_button);
        parent_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), parent_child.class);
                startActivity(intent);
            }
        });

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Peach_colour1.class);
                startActivity(intent);
            }
        });


    }
}