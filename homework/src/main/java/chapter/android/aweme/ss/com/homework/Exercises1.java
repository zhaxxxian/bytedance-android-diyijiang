package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * 作业1：
 * 打印出Activity屏幕切换 Activity会执行什么生命周期？
 */
public class Exercises1 extends AppCompatActivity {

    private static final  String Tag = "Myactivity:";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(Tag, "onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "onSart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag,"onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag,"onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag,"onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag,"onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag,"onResume");
    }
}
