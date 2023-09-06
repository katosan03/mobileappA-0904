package jp.co.meijou.android.s221205050;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Optional;

import jp.co.meijou.android.s221205050.databinding.ActivitySubBinding;
import jp.co.meijou.android.s221205050.databinding.ActivityMain3Binding;

public class SubActivity extends AppCompatActivity {
    private ActivitySubBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySubBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Optional.ofNullable(getIntent().getStringExtra("text"))
                .ifPresent(text -> binding.textView.setText(text));


        binding.buttonOk.setOnClickListener(view ->{
            var intent = new Intent();
            intent.putExtra("ret", "meijo");
            setResult(RESULT_OK, intent);
            finish();
        });

        binding.buttonCancel.setOnClickListener(view ->{
            setResult(RESULT_CANCELED);
            finish();
        });

    }

}