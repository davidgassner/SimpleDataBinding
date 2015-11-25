package com.example.david.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.david.myapplication.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ActivityDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
        User user = new User("Test", "User");
        binding.setUser(user);
    }
}
