package com.example.tourgideapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    ImageView imageData,imageView2;
    TextView textTitle,textDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageData=findViewById(R.id.image_data);
        imageView2=findViewById(R.id.imageView2);
        textTitle=findViewById(R.id.text_title);
        textDescription=findViewById(R.id.text_description);
        ViewPager2 viewPager2=findViewById(R.id.view_pager);
        viewPager2.setAdapter(new PagerAdapter(this));
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        TabLayoutMediator tabLayoutMediator= new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
               switch (position){
                   case 0:
                       tab.setText(R.string.places);
                       tab.setIcon(R.drawable.ic_places);
                       break;
                   case 1:
                       tab.setText("Hotels");
                       tab.setIcon(R.drawable.hotel);
                       break;
                   case 2:
                       tab.setText("Restaurants");
                       tab.setIcon(R.drawable.food);
                       break;
                   case 3:
                       tab.setText("Shopping");
                       tab.setIcon(R.drawable.shopping_bag);
                       break;
               }
            }
        });
        tabLayoutMediator.attach();
    }

}