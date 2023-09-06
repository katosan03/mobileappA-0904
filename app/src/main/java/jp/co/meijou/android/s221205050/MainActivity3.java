package jp.co.meijou.android.s221205050;

//----NOTICE!!--------授業ではMainActivity2------

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import jp.co.meijou.android.s221205050.databinding.ActivityMain3Binding;
import jp.co.meijou.android.s221205050.databinding.ActivityMainBinding;


public class MainActivity3 extends AppCompatActivity {

    private ActivityMain3Binding binding;

    int suti1 = 0;
    String enzan = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button0.setOnClickListener(view ->{
            var text = binding.textView.getText().toString() + "0";
            binding.textView.setText(text);
        });

        binding.button1.setOnClickListener(view ->{
            var text = binding.textView.getText().toString() + "1";
            binding.textView.setText(text);
        });

        binding.button2.setOnClickListener(view ->{
            var text = binding.textView.getText().toString() + "2";
            binding.textView.setText(text);
        });

        binding.button3.setOnClickListener(view ->{
            var text = binding.textView.getText().toString() + "3";
            binding.textView.setText(text);
        });

        binding.button4.setOnClickListener(view ->{
            var text = binding.textView.getText().toString() + "4";
            binding.textView.setText(text);
        });

        binding.button5.setOnClickListener(view ->{
            var text = binding.textView.getText().toString() + "5";
            binding.textView.setText(text);
        });

        binding.button6.setOnClickListener(view ->{
            var text = binding.textView.getText().toString() + "6";
            binding.textView.setText(text);
        });

        binding.button7.setOnClickListener(view ->{
            var text = binding.textView.getText().toString() + "7";
            binding.textView.setText(text);
        });

        binding.button8.setOnClickListener(view ->{
            var text = binding.textView.getText().toString() + "8";
            binding.textView.setText(text);
        });

        binding.button9.setOnClickListener(view ->{
            var text = binding.textView.getText().toString() + "9";
            binding.textView.setText(text);
        });

        binding.buttonkakeru.setOnClickListener(view ->{
            this.suti1 = Integer.parseInt(binding.textView.getText().toString());
            binding.textView.setText(null);
            this.enzan = "kakeru";
        });

        binding.buttonwaru.setOnClickListener(view ->{
            this.suti1 = Integer.parseInt(binding.textView.getText().toString());
            binding.textView.setText(null);
            this.enzan = "waru";
        });
        binding.buttonplus.setOnClickListener(view ->{
            this.suti1 = Integer.parseInt(binding.textView.getText().toString());
            binding.textView.setText(null);
            this.enzan = "plus";
        });

        binding.buttonhiku.setOnClickListener(view ->{
            this.suti1 = Integer.parseInt(binding.textView.getText().toString());
            binding.textView.setText(null);
            this.enzan = "hiku";
        });

        binding.buttonAC.setOnClickListener(view ->{
            this.suti1 = 0;
            binding.textView.setText(null);
            this.enzan = null;
        });

        binding.buttonequal.setOnClickListener(view ->{
            int suti2 = Integer.parseInt(binding.textView.getText().toString());
            if(this.enzan == "plus"){
                var kekka = suti1 + suti2;
                binding.textView.setText(kekka);
            }
            else if(this.enzan == "hiku"){
                var kekka = suti1 - suti2;
                binding.textView.setText(kekka);
            }
            else if(this.enzan == "kakeru"){
                var kekka = suti1 * suti2;
                binding.textView.setText(kekka);
            }
            else if(this.enzan == "waru"){
                var kekka = suti1 / suti2;
                binding.textView.setText(kekka);
            }
            else{
                var kekka = "hogehoge";
                binding.textView.setText(kekka);
            }
            this.suti1 = 0;
            this.enzan = null;
        });
    }
}