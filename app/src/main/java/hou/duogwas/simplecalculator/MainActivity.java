package hou.duogwas.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvScreen;
    Button btn0, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9;
    Button btnCong, btnTru, btnNhan, btnChia, btnDot, btnEqual, btnClear, btnAllClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlView();
        setOnClick();
    }

    protected void controlView(){
        tvScreen=findViewById(R.id.tvScreen);

        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);

        btnCong=findViewById(R.id.btnCong);
        btnTru=findViewById(R.id.btnTru);
        btnNhan=findViewById(R.id.btnNhan);
        btnChia=findViewById(R.id.btnChia);
        btnDot=findViewById(R.id.btnDot);
        btnEqual=findViewById(R.id.btnEqual);
        btnClear=findViewById(R.id.btnClear);
        btnAllClear=findViewById(R.id.btnAllClear);
    }

    public void setOnClick(){
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnCong.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnChia.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnAllClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn0:
                tvScreen.append("0");
                break;
            case R.id.btn1:
                tvScreen.append("1");
                break;
            case R.id.btn2:
                tvScreen.append("2");
                break;
            case R.id.btn3:
                tvScreen.append("3");
                break;
            case R.id.btn4:
                tvScreen.append("4");
                break;
            case R.id.btn5:
                tvScreen.append("5");
                break;
            case R.id.btn6:
                tvScreen.append("6");
                break;
            case R.id.btn7:
                tvScreen.append("7");
                break;
            case R.id.btn8:
                tvScreen.append("8");
                break;
            case R.id.btn9:
                tvScreen.append("9");
                break;
            case R.id.btnCong:
                tvScreen.append("+");
                break;
            case R.id.btnTru:
                tvScreen.append("-");
                break;
            case R.id.btnNhan:
                tvScreen.append("*");
                break;
            case R.id.btnChia:
                tvScreen.append("/");
                break;
            case R.id.btnDot:
                tvScreen.append(".");
                break;
            case R.id.btnClear:
                if(tvScreen.length()>0) {
                    String newScreen = tvScreen.getText().toString().substring(0, tvScreen.length() - 1);
                    tvScreen.setText(newScreen);
                }
                break;
            case R.id.btnAllClear:
                tvScreen.setText("");
                break;
            case R.id.btnEqual:
                tinhtoan();
                break;
            default:
                tvScreen.setText("");
                break;
        }
    }

    public void tinhtoan() {
        String val = tvScreen.getText().toString();
        Expression expression = new ExpressionBuilder(val).build();
        double result = expression.evaluate();
        tvScreen.setText(Double.toString(result));
    }
}