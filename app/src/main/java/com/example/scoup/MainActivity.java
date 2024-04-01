import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.scoup.R;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editTextUsername;
    private TextInputEditText editTextEmail;
    private TextInputEditText editTextCurrentPassword;
    private TextInputEditText editTextNewPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_info);

        // Initialize views
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextCurrentPassword = findViewById(R.id.editTextCurrentPassword);
        editTextNewPassword = findViewById(R.id.editTextNewPassword);
        Button buttonCancel = findViewById(R.id.buttonCancel);
        Button buttonSave = findViewById(R.id.buttonSave);

        // Action for Cancel button
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear input fields
                clearFields();
                // Show a toast message
                Toast.makeText(MainActivity.this, "Changes canceled!", Toast.LENGTH_SHORT).show();
            }
        });

        // Action for Save button
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get current and new passwords
                String currentPassword = editTextCurrentPassword.getText().toString();
                String newPassword = editTextNewPassword.getText().toString();

                // Save changes to username and email
                String newUsername = editTextUsername.getText().toString();
                String newEmail = editTextEmail.getText().toString();

                // Process saving password and other information (not implemented in this example)
                // Show a toast message
                Toast.makeText(MainActivity.this, "Changes saved successfully!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void clearFields() {
        editTextUsername.setText("");
        editTextEmail.setText("");
        editTextCurrentPassword.setText("");
        editTextNewPassword.setText("");
    }
}
