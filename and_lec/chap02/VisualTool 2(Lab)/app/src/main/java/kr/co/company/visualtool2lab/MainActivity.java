package kr.co.company.visualtool2lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClicked2(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1234-5678"));
        startActivity(intent);
    }
}
/*
    인텐트 : 컴포넌트를 실행하기 위해 시스템에 넘기는 정보

    실행하고자 하는 컴포넌트 정보를 담은 Intent 구성 -> 시스템 -> Intent 정보를 통해 그에 맞는 컴포넌트를 실행.
 */