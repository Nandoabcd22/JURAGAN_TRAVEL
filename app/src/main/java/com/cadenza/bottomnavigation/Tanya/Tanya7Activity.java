package com.cadenza.bottomnavigation.Tanya;

import android.content.Intent;
import android.os.Bundle;

import com.cadenza.bottomnavigation.Panduan.panduanActivity;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.cadenza.bottomnavigation.databinding.ActivityTanya7Binding;

import com.cadenza.bottomnavigation.R;

public class Tanya7Activity extends AppCompatActivity {

    private ImageView btnkembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanya7);

        btnkembali = findViewById(R.id.btnKembali);

        btnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PertanyaanActivity.class));
            }
        });

    }
}