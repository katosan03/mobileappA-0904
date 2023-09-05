package jp.co.meijou.android.s221205050;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
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
            Log.d("Kato","save: "+ text);
        });

        binding.buttonReset.setOnClickListener(view ->{
            binding.text.setText(null);
            prefDataStore.setString("name",null);
        });

        //誰が仕込んだlogか分かるようにtagに名前を入れる
        //Logcatから確認（package:mine tag:Kato ）
        Log.d("Kato","onCreate text"+ binding.text.getText());
    }

    //他のアプリから戻ってきた場合の処理
    @Override
    protected void onStart() {
        super.onStart();
        prefDataStore.getString("name")
                .ifPresent(name -> binding.text.setText(name));
    }
}