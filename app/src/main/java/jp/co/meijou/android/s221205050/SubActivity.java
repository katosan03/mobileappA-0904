package jp.co.meijou.android.s221205050;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import jp.co.meijou.android.s221205050.databinding.ActivitySubBinding;
import jp.co.meijou.android.s221205050.databinding.ActivityMain3Binding;

public class SubActivity extends AppCompatActivity {
    private ActivitySubBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySubBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}