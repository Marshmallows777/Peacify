package www.testing.login_autism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class parent_child extends AppCompatActivity {
    Button parent_btn, child_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_child);

        parent_btn = findViewById(R.id.button_parent);
        child_btn = findViewById(R.id.button_child);

        parent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), parent_interface.class);
                startActivity(intent);
            }
        });

        child_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), child_interface.class);
                startActivity(intent);
            }
        });
    }
}