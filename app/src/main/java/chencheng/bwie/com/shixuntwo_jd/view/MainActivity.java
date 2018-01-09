package chencheng.bwie.com.shixuntwo_jd.view;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

import chencheng.bwie.com.shixuntwo_jd.R;


public class MainActivity extends AppCompatActivity {
    private Timer timer = new Timer();
    private int progress = 3;

    private Handler handler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            if (msg.what == 1 && msg.arg1 == 1) {
                Intent intent = new Intent(MainActivity.this, Shouye.class);
                startActivity(intent);
                finish();
            }
        }
    };
    private ImageView mIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        SharedPreferences preferences = getSharedPreferences("count", MODE_WORLD_READABLE);
        int count = preferences.getInt("count", 0);
        if (count == 0) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Message message = Message.obtain();
                            message.what = 1;
                            message.arg1 = progress;
                            progress--;
                            handler.sendMessage(message);
                        }
                    }, 1000, 1000);
                }
            }).start();

        }else{
            Intent intent = new Intent(MainActivity.this, Shouye.class);
            startActivity(intent);
            finish();
        }
        SharedPreferences.Editor editor = preferences.edit();
        //存入数据
        editor.putInt("count", ++count);
        //提交修改
        editor.commit();
    }

    private void initView() {
        mIv = (ImageView) findViewById(R.id.iv);
    }
}
