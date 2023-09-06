package jp.co.meijou.android.s221205050;

//授業MainActivity2の代わり

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import jp.co.meijou.android.s221205050.databinding.ActivityMain3Binding;
import jp.co.meijou.android.s221205050.databinding.ActivityMainBinding;


public class MainActivity3 extends AppCompatActivity {

    private ActivityMain3Binding binding;
    private PrefDataStore prefDataStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.textView2.setVisibility(View.GONE);
    }
}