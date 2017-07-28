package com.example.iii.caltdemo_2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActMain extends Activity {

    int calc;
    String oper;

    private View.OnClickListener btn0_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int i = Integer.parseInt(tvShow.getText().toString());
            if(i == 0){
                tvShow.setText("0");
            }
            else {
                tvShow.setText(tvShow.getText().toString()+"0");
            }

        }
    };
    private View.OnClickListener btn1_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int i = Integer.parseInt(tvShow.getText().toString());
            if(i == 0){
                tvShow.setText("1");
            }
            else {
                tvShow.setText(tvShow.getText().toString()+"1");
            }

        }
    };
    private View.OnClickListener btn2_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int i = Integer.parseInt(tvShow.getText().toString());
            if(i == 0){
                tvShow.setText("2");
            }
            else {
                tvShow.setText(tvShow.getText().toString()+"2");
            }

        }
    };
    private View.OnClickListener btn3_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int i = Integer.parseInt(tvShow.getText().toString());
            if(i == 0){
                tvShow.setText("3");
            }
            else {
                tvShow.setText(tvShow.getText().toString()+"3");
            }

        }
    };
    private View.OnClickListener btn4_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int i = Integer.parseInt(tvShow.getText().toString());
            if(i == 0){
                tvShow.setText("4");
            }
            else {
                tvShow.setText(tvShow.getText().toString()+"4");
            }

        }
    };
    private View.OnClickListener btn5_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int i = Integer.parseInt(tvShow.getText().toString());
            if(i == 0){
                tvShow.setText("5");
            }
            else {
                tvShow.setText(tvShow.getText().toString()+"5");
            }

        }
    };
    private View.OnClickListener btn6_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int i = Integer.parseInt(tvShow.getText().toString());
            if(i == 0){
                tvShow.setText("6");
            }
            else {
                tvShow.setText(tvShow.getText().toString()+"6");
            }

        }
    };
    private View.OnClickListener btn7_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int i = Integer.parseInt(tvShow.getText().toString());
            if(i == 0){
                tvShow.setText("7");
            }
            else {
                tvShow.setText(tvShow.getText().toString()+"7");
            }

        }
    };
    private View.OnClickListener btn8_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int i = Integer.parseInt(tvShow.getText().toString());
            if(i == 0){
                tvShow.setText("8");
            }
            else {
                tvShow.setText(tvShow.getText().toString()+"8");
            }

        }
    };
    private View.OnClickListener btn9_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int i = Integer.parseInt(tvShow.getText().toString());
            if(i == 0){
                tvShow.setText("9");
            }
            else {
                tvShow.setText(tvShow.getText().toString()+"9");
            }

        }
    };
    private View.OnClickListener btnAdd_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tvShow2.setText("");
            calc = Integer.parseInt(tvShow.getText().toString());
            oper = "+";
            tvShow.setText("0");
            tvShow2.setText("+");

        }
    };
    private View.OnClickListener btnMin_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tvShow2.setText("");
            calc = Integer.parseInt(tvShow.getText().toString());
            oper = "-";
            tvShow.setText("0");
            tvShow2.setText("-");
        }
    };
    private View.OnClickListener btnMul_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tvShow2.setText("");
            calc = Integer.parseInt(tvShow.getText().toString());
            oper = "*";
            tvShow.setText("0");
            tvShow2.setText("*");
        }
    };
    private View.OnClickListener btnDiv_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tvShow2.setText("");
            calc = Integer.parseInt(tvShow.getText().toString());
            oper = "/";
            tvShow.setText("0");
            tvShow2.setText("/");
        }
    };
    private View.OnClickListener btnIs_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int j = Integer.parseInt(tvShow.getText().toString());
            tvShow2.setText("");

            if("+".equals(oper)){
                tvShow.setText(String.valueOf(calc + j));
            }
            if("-".equals(oper)){
                tvShow.setText(String.valueOf(calc - j));
            }
            if("*".equals(oper)){
                tvShow.setText(String.valueOf(calc * j));
            }
            if("/".equals(oper)){
                tvShow.setText(String.valueOf(calc / j));
            }

        }
    };
    private View.OnClickListener btnCLR_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            calc = 0;
            oper = "";
            tvShow.setText("0");
            tvShow2.setText("");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmain);
        InitialComponent();
    }

    private void InitialComponent() {

        btn0 = (Button)findViewById(R.id.btn0);
        btn0.setOnClickListener(btn0_Click);
        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(btn1_Click);
        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(btn2_Click);
        btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(btn3_Click);
        btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(btn4_Click);
        btn5 = (Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(btn5_Click);
        btn6 = (Button)findViewById(R.id.btn6);
        btn6.setOnClickListener(btn6_Click);
        btn7 = (Button)findViewById(R.id.btn7);
        btn7.setOnClickListener(btn7_Click);
        btn8 = (Button)findViewById(R.id.btn8);
        btn8.setOnClickListener(btn8_Click);
        btn9 = (Button)findViewById(R.id.btn9);
        btn9.setOnClickListener(btn9_Click);


        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(btnAdd_Click);
        btnMin=(Button)findViewById(R.id.btnMin);
        btnMin.setOnClickListener(btnMin_Click);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnMul.setOnClickListener(btnMul_Click);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(btnDiv_Click);
        btnIs=(Button)findViewById(R.id.btnIs);
        btnIs.setOnClickListener(btnIs_Click);
        btnCLR=(Button)findViewById(R.id.btnCLR);
        btnCLR.setOnClickListener(btnCLR_Click);

        tvShow=(TextView)findViewById(R.id.tvShow);
        tvShow2=(TextView)findViewById(R.id.tvShow2);
    }

    //全域變數
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnAdd;
    Button btnMin;
    Button btnMul;
    Button btnDiv;
    Button btnIs;
    Button btnCLR;
    TextView tvShow;
    TextView tvShow2;
    //要先給予初始值
    //String s = tvShow.getText().toString();
}
