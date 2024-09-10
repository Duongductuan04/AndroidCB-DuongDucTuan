package com.example.sum;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // Declare UI components
    EditText edtA, edtB;
    TextView txtV;
    Button btnTong, btnHieu, btnTich, btnThuong, btnDu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the layout resource
        setContentView(R.layout.activity_main);
        initControl();
    }

    private void initControl() {
        // Map the variables to UI components
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        txtV = findViewById(R.id.txtV);
        btnTong = findViewById(R.id.btnTong);
        btnHieu = findViewById(R.id.btnHieu);
        btnTich = findViewById(R.id.btnTich);
        btnThuong = findViewById(R.id.btnThuong);
        btnDu = findViewById(R.id.btnDu);

        // Set OnClickListeners for the buttons
        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Parse input values, calculate the sum, and display the result
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = a + b;
                txtV.setText(String.valueOf(c));
            }
        });

        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Parse input values, calculate the difference, and display the result
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = a - b;
                txtV.setText(String.valueOf(c));
            }
        });

        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Parse input values, calculate the product, and display the result
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = a * b;
                txtV.setText(String.valueOf(c));
            }
        });

        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Parse input values, calculate the quotient, and display the result
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = a / b;
                txtV.setText(String.valueOf(c));
            }
        });

        btnDu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Parse input values, calculate the remainder, and display the result
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = a % b;
                txtV.setText(String.valueOf(c));
            }
        });
    }
}