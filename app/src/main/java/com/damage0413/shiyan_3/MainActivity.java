package com.damage0413.shiyan_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTv;
    private Button mBtnes1;
    private Button mBtnes2;
    private Button mBtnes4;
    private Button mBtnes5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTv = (TextView) findViewById(R.id.TextView_1);
        mBtnes1 = (Button) findViewById(R.id.EventSource_1);
        mBtnes2 = (Button) findViewById(R.id.EventSource_2);
        mBtnes4 = (Button) findViewById(R.id.EventSource_4);
        mBtnes5 = (Button) findViewById(R.id.EventSource_5);
        mBtnes1.setOnClickListener(MainActivity.this);
        mBtnes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTv.setText(R.string.TV_2);
            }
        });
        mBtnes4.setOnClickListener(new MyClickListener() {
        });
        mBtnes5.setOnClickListener(new MyClickListener_2(mTv) {
        });
    }

    @Override
    public void onClick(View v) {
        mTv.setText(R.string.TV_1);
    }

    public void clickHandler(View source) {
        mTv.setText(R.string.TV_3);
    }

    @OnClick(R.id.EventSource_6)
    public void onViewClicked() {
        mTv.setText(R.string.TV_6);
    }

    class MyClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            mTv.setText(R.string.TV_4);
        }
    }

    static
    class ViewHolder {
        @BindView(R.id.EventSource_6)
        Button EventSource6;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
