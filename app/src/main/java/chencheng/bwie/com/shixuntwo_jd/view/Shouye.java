package chencheng.bwie.com.shixuntwo_jd.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import chencheng.bwie.com.shixuntwo_jd.ProhibitScrollViewPager;
import chencheng.bwie.com.shixuntwo_jd.R;
import chencheng.bwie.com.shixuntwo_jd.adapter.MyFraAdapter;
import chencheng.bwie.com.shixuntwo_jd.view.fra1.Feow;
import chencheng.bwie.com.shixuntwo_jd.view.fra1.Four;
import chencheng.bwie.com.shixuntwo_jd.view.fra1.One;
import chencheng.bwie.com.shixuntwo_jd.view.fra1.Three;
import chencheng.bwie.com.shixuntwo_jd.view.fra1.Two;

/**
 * Created by dell on 2018/1/8.
 */

public class Shouye extends FragmentActivity implements View.OnClickListener {
    private ProhibitScrollViewPager mIvPager;
    private ImageView mIvS;
    private ImageView mIvF;
    private ImageView mIvX;
    private ImageView mIvG;
    private ImageView mIvW;
    List<Fragment> list;
    MyFraAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);
        initView();
    }

    private void initView() {
        mIvPager =  findViewById(R.id.main_pager);
        mIvS = (ImageView) findViewById(R.id.iv_s);
        mIvS.setOnClickListener(this);
        mIvF = (ImageView) findViewById(R.id.iv_f);
        mIvF.setOnClickListener(this);
        mIvX = (ImageView) findViewById(R.id.iv_x);
        mIvX.setOnClickListener(this);
        mIvG = (ImageView) findViewById(R.id.iv_g);
        mIvG.setOnClickListener(this);
        mIvW = (ImageView) findViewById(R.id.iv_w);
        mIvW.setOnClickListener(this);
        list=new ArrayList<>();
        list.add(new One());
        list.add(new Two());
        list.add(new Three());
        list.add(new Four());
        list.add(new Feow());
        adapter=new MyFraAdapter(getSupportFragmentManager(),list);
        mIvPager.setAdapter(adapter);
        mIvS.setImageResource(R.drawable.ac1);
        mIvF.setImageResource(R.drawable.abw);
        mIvX.setImageResource(R.drawable.aby);
        mIvG.setImageResource(R.drawable.abu);
        mIvW.setImageResource(R.drawable.ac2);
        mIvPager.setSaveEnabled(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.iv_s:
                mIvPager.setCurrentItem(0);
                mIvS.setImageResource(R.drawable.ac1);
                mIvF.setImageResource(R.drawable.abw);
                mIvX.setImageResource(R.drawable.aby);
                mIvG.setImageResource(R.drawable.abu);
                mIvW.setImageResource(R.drawable.ac2);
                break;
            case R.id.iv_f:
                mIvPager.setCurrentItem(1);
                mIvS.setImageResource(R.drawable.ac0);
                mIvF.setImageResource(R.drawable.abx);
                mIvX.setImageResource(R.drawable.aby);
                mIvG.setImageResource(R.drawable.abu);
                mIvW.setImageResource(R.drawable.ac2);
                break;
            case R.id.iv_x:
                mIvPager.setCurrentItem(2);
                mIvS.setImageResource(R.drawable.ac0);
                mIvF.setImageResource(R.drawable.abw);
                mIvX.setImageResource(R.drawable.abz);
                mIvG.setImageResource(R.drawable.abu);
                mIvW.setImageResource(R.drawable.ac2);
                break;
            case R.id.iv_g:
                mIvPager.setCurrentItem(3);
                mIvS.setImageResource(R.drawable.ac0);
                mIvF.setImageResource(R.drawable.abw);
                mIvX.setImageResource(R.drawable.aby);
                mIvG.setImageResource(R.drawable.abv);
                mIvW.setImageResource(R.drawable.ac2);
                break;
            case R.id.iv_w:
                mIvPager.setCurrentItem(4);
                mIvS.setImageResource(R.drawable.ac0);
                mIvF.setImageResource(R.drawable.abw);
                mIvX.setImageResource(R.drawable.aby);
                mIvG.setImageResource(R.drawable.abu);
                mIvW.setImageResource(R.drawable.ac3);
                break;
        }
    }
}
