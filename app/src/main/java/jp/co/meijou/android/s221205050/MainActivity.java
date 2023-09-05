package jp.co.meijou.android.s221205050;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

import jp.co.meijou.android.s221205050.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private PrefDataStore prefDataStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        prefDataStore = prefDataStore.getInstance(this);

        prefDataStore.getString("name")
                        .ifPresent(name -> binding.text.setText(name));

        binding.button.setOnClickListener(view ->{
            var text = binding.editText.getText().toString();
            binding.text.setText(text);
        });

        binding.buttonSave.setOnClickListener(view ->{
            var text = binding.editText.getText().toString();
            prefDataStore.setString("name",text);
        });

    }
}