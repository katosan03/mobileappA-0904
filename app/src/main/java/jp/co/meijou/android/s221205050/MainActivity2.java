package jp.co.meijou.android.s221205050;

//----NOTICE!!--------授業ではMainActivity3------

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import jp.co.meijou.android.s221205050.databinding.ActivityMain2Binding;
import jp.co.meijou.android.s221205050.databinding.ActivityMain3Binding;

public class MainActivity2 extends AppCompatActivity {
    private ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //明示的Intent
        binding.buttonMeiji.setOnClickListener(view ->{
            var intent = new Intent(this, SubActivity.class);
            startActivity(intent);
        });


    }
}