package cn.ucai.superwechat.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hyphenate.superwechat.R;

import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.ucai.superwechat.utils.MFGT;

public class GuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.button2, R.id.button})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button2:
                MFGT.gotoRegister(this);
                break;
            case R.id.button:
                MFGT.gotoLogin(this);
                break;
        }
    }
}
