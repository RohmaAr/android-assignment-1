package com.example.assignment1;

import android.annotation.SuppressLint;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import java.util.Objects;

public class ThreeTabs extends AppCompatActivity {
    ImageView ivBack;
    FragmentManager fragmentManager;
    LinearLayout llOne,llTwo,llThree;
    Fragment frag_one,frag_two;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.threetabs);
        ivBack=findViewById(R.id.ivBack);
        llOne=findViewById(R.id.llone);
        llTwo=findViewById(R.id.lltwo);
        llThree=findViewById(R.id.llthree);
        fragmentManager=getSupportFragmentManager();
//        frag_one=Objects.requireNonNull(Objects.requireNonNull(fragmentManager.findFragmentById(R.id.pageone)).requireView();
//        ivBack.setOnClickListener(v -> {
//            Intent intent=new Intent(ThreeTabs.this, MainActivity.class);
//            startActivity(intent);
//            finish();
//        });
    }
}
