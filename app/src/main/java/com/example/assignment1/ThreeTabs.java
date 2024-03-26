package com.example.assignment1;

import android.annotation.SuppressLint;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

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
    ImageView ivBack,ivFrag;
    FragmentManager fragmentManager;
    LinearLayout llOne,llTwo,llThree;
    TextView tvFrag;
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
        tvFrag = Objects.requireNonNull(fragmentManager.findFragmentById(R.id.pageone)).requireView()
                .findViewById(R.id.tvFrag);
        ivFrag=Objects.requireNonNull(fragmentManager.findFragmentById(R.id.pageone)).requireView()
                .findViewById(R.id.ivFrag);
        ivBack.setOnClickListener(v -> {
            Intent intent=new Intent(ThreeTabs.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
        llOne.setOnClickListener(e->{
            String textSet="PAGE ONE";
            tvFrag.setText(textSet);
            ivFrag.setImageResource(R.drawable.hearticon);

        });
        llTwo.setOnClickListener(e->{
            String textSet="CLICK THE THRID TAB\nTO SEE THE INSTA PROFILE";
            tvFrag.setText(textSet);
            ivFrag.setImageResource(R.drawable.callicon);

        });
        llThree.setOnClickListener(e->{
            Intent intent=new Intent(ThreeTabs.this, InstaProf.class);
            startActivity(intent);
            finish();

        });
    }
}
