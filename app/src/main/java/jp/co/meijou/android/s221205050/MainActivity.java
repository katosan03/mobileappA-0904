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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(view ->{
            var text = binding.editText.getText().toString();
            binding.text.setText(text);
        });

        binding.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //テキストが更新される直前に呼ばれる
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //文字を1つ入力された時に呼ばれる
            }

            @Override
            public void afterTextChanged(Editable s) {
                //テキストが更新した後に呼ばれる
                binding.text.setText(s.toString());
            }
        });

    }
}