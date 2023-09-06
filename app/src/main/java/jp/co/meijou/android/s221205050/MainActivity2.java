package jp.co.meijou.android.s221205050;

//----NOTICE!!--------授業ではMainActivity3------

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import java.util.Optional;

import jp.co.meijou.android.s221205050.databinding.ActivityMain2Binding;
import jp.co.meijou.android.s221205050.databinding.ActivityMain3Binding;

public class MainActivity2 extends AppCompatActivity {
    private ActivityMain2Binding binding;

    private final ActivityResultLauncher<Intent> getActivityResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                switch (result.getResultCode()){
                    case RESULT_OK:
                        Optional.ofNullable(result.getData())
                                .map(data -> data.getStringExtra("ret"))
                                .map(text -> "Result: " + text)
                                .ifPresent(text -> binding.textResult.setText(text));
                        break;
                    case RESULT_CANCELED:
                        binding.textResult.setText("Result: Canceled");
                        break;
                    default:
                        binding.textResult.setText("Result: Unknown(" + result.getResultCode() + ")");
                        break;
                }
            }
    );
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

        //暗黙的Intent
        binding.buttonAnmoku.setOnClickListener(view ->{
            var intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.yahoo.co.jp"));
            startActivity(intent);
        });

        //文字を送信
        binding.buttonSousin.setOnClickListener(view ->{
            var intent = new Intent(this,SubActivity.class);
            intent.putExtra("text",binding.editTextName.getText().toString());
            startActivity(intent);
        });

        //取得
        binding.buttonKidou.setOnClickListener(view ->{
            var intent = new Intent(this, SubActivity.class);
            getActivityResult.launch(intent);
        });
    }
}