package com.example.alertdialogue;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnname,btnaccount,btnbalance;
    TextView tvname,tvaccount,tvbalance;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnname = findViewById(R.id.btnlogin);
        btnaccount = findViewById(R.id.btnaccount);
//        btnbalance = findViewById(R.id.btnbalance);
        tvname = findViewById(R.id.tvname);
        tvaccount = findViewById(R.id.tvaccount);
        tvbalance = findViewById(R.id.tvbalance);
        btnname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String name = tvname.getText().toString();
                tvname.setText("Malik Mushee");


            }
        });
        btnaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String account = tvaccount.getText().toString();
                tvaccount.setText("0300-4173533");

            }
        });
        btnbalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog ad = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Account Balance Checked")
                        .setMessage("Sure, do you want to check balance")
                        .setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Toast.makeText(MainActivity.this, "Balance showed", Toast.LENGTH_SHORT).show();

//                                    String balance = tvbalance.getText().toString();
                                     tvbalance.setText("1500");

                                    }

            })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "Access denied so, Balance not showed", Toast.LENGTH_SHORT).show();
                            }

                        })
                                .create();
                        ad.show();


            }
        });





    }
}