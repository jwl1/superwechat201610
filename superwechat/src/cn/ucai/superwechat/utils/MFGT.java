package cn.ucai.superwechat.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.hyphenate.superwechat.R;

import cn.ucai.superwechat.ui.GuideActivity;
import cn.ucai.superwechat.ui.LoginActivity;
import cn.ucai.superwechat.ui.RegisterActivity;
import cn.ucai.superwechat.ui.SplashActivity;


/**
 * Created by Administrator on 2017/1/10 0010.
 */

public class MFGT {
    private static final String TAG = MFGT.class.getSimpleName();
    public static void finish(Activity context){
        context.finish();
        context.overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    }
    public static void startActivity(Activity context,Class<?> clz){
        context.startActivity(new Intent(context,clz));
        context.overridePendingTransition(R.anim.push_right_in,R.anim.push_right_out);
    }

    public static void startActivity(Activity context,Intent intent){
        context.startActivity(intent);
        context.overridePendingTransition(R.anim.push_right_in,R.anim.push_right_out);
    }
    public static void gotoLogin(Context context){
        startActivity((Activity)context, LoginActivity.class);
    }
    public static void gotoRegister(Context context) {
        startActivity((Activity)context, RegisterActivity.class);
    }

    public static void gotoGide(SplashActivity activity) {
        startActivity(activity, GuideActivity.class);
    }
}

