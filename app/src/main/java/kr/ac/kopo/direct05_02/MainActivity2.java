package kr.ac.kopo.direct05_02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    EditText editInput;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        editInput = findViewById(R.id.edit_input);
        textResult = findViewById(R.id.text_result);
        Button btnOutput = findViewById(R.id.btn_output);

        btnOutput.setOnClickListener(btnOutputListener);
    }

    View.OnClickListener btnOutputListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String inputStr = editInput.getText().toString();
            textResult.setText(inputStr);
        }
    };
}