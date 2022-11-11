package www.testing.login_autism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class LoginTabFragment extends Fragment {

    EditText email_log, pass_log;
    Button Login;
    float v = 0;
    private FirebaseAuth mAuth;

    Activity context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        context = getActivity();

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);

        email_log = root.findViewById(R.id.email);
        pass_log = root.findViewById(R.id.password);
        Login = root.findViewById(R.id.login);

        email_log.setTranslationX(800);
        pass_log.setTranslationX(800);
        Login.setTranslationX(800);

        email_log.setAlpha(v);
        pass_log.setAlpha(v);
        Login.setAlpha(v);

        email_log.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass_log.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        Login.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();

        return root;
    }

    public void onStart() {
        super.onStart();
        Button Login_btn = (Button) context.findViewById(R.id.login);
        Login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginUser();
            }
        });
    }

    public void loginUser() {
        String email = email_log.getText().toString().trim();
        String password = pass_log.getText().toString().trim();

        if (email.isEmpty()) {
            email_log.setError("Email is required");
            email_log.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            email_log.setError("Please enter a valid email");
            email_log.requestFocus();
            return;
        }
        if (password.isEmpty()) {
            pass_log.setError("Password is required");
            pass_log.requestFocus();
            return;
        }
        Intent intent = new Intent(context, parent_child.class);
        startActivity(intent);
    }
}
