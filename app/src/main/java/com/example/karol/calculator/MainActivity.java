package com.example.karol.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView firstTextView,secoundTextView,sumTextView,operatorTextView;
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    Button cancelButton,backSlashButton,switchButton,addButton,subButton,divButton,multButton;
    Button dotButton,equalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);

        button9.setOnClickListener(this);
        button8.setOnClickListener(this);
        button7.setOnClickListener(this);
        button6.setOnClickListener(this);
        button5.setOnClickListener(this);
        button4.setOnClickListener(this);
        button3.setOnClickListener(this);
        button2.setOnClickListener(this);
        button1.setOnClickListener(this);
        button0.setOnClickListener(this);

        cancelButton = (Button)findViewById(R.id.cancel_button);
        backSlashButton = (Button)findViewById(R.id.backslash_button);
        switchButton = (Button) findViewById(R.id.switch_button);
        addButton = (Button) findViewById(R.id.add_button);
        subButton = (Button) findViewById(R.id.sub_button);
        divButton = (Button) findViewById(R.id.div_button);
        multButton = (Button) findViewById(R.id.mult_button);
        dotButton = (Button) findViewById(R.id.dec_buton);
        equalButton = (Button) findViewById(R.id.ans_button);

        cancelButton.setOnClickListener(this);
        backSlashButton.setOnClickListener(this);
        switchButton.setOnClickListener(this);
        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        divButton.setOnClickListener(this);
        multButton.setOnClickListener(this);
        dotButton.setOnClickListener(this);
        equalButton.setOnClickListener(this);

        firstTextView = (TextView)findViewById(R.id.first_number_textView);
        secoundTextView = (TextView) findViewById(R.id.secound_textView);
        sumTextView = (TextView) findViewById(R.id.sum_textView);
        operatorTextView = (TextView) findViewById(R.id.operator_textView);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.add_button:
                operatorTextView.setText("+");
                secoundTextView.setText(firstTextView.getText().toString());
                firstTextView.setText("0");
                break;
            case R.id.cancel_button:
                operatorTextView.setText("");
                secoundTextView.setText("");
                firstTextView.setText("0");
                sumTextView.setText("");
                break;

            case R.id.sub_button:

                break;

            case R.id.switch_button:
                if(!firstTextView.getText().toString().equals("0")){
                    if (firstTextView.getText().toString().contains("-"))
                        firstTextView.setText(firstTextView.getText().toString().replace("-",""));
                    else firstTextView.setText("-"+firstTextView.getText().toString());
                }

            case R.id.ans_button:
                String operator = operatorTextView.getText().toString();
                switch (operator){
                    case "+":

                        break;
                    case "-":

                        break;
                    case "/":

                        break;
                    case "*":

                        break;
                }
                break;

            case R.id.backslash_button:
                firstTextView.setText("0");
                break;
            case R.id.button0:
                if(!firstTextView.getText().toString().equals("0"))
                    firstTextView.setText(firstTextView.getText().toString()+"0");
                break;
            case R.id.button1:
                    firstTextView.setText("1");
                break;
            case R.id.button2:
                if(!firstTextView.getText().toString().equals("0"))
                    firstTextView.setText(firstTextView.getText().toString()+"2");
                else
                    firstTextView.setText("2");
                break;

            case R.id.button3:
                if(!firstTextView.getText().toString().equals("0"))
                    firstTextView.setText(firstTextView.getText().toString()+"3");
                else
                    firstTextView.setText("3");
                break;

            case R.id.button4:
                if(!firstTextView.getText().toString().equals("0"))
                    firstTextView.setText(firstTextView.getText().toString()+"4");
                else
                    firstTextView.setText("4");
                break;
            case R.id.button5:
                if(!firstTextView.getText().toString().equals("0"))
                    firstTextView.setText(firstTextView.getText().toString()+"5");
                else
                    firstTextView.setText("5");
                break;

            case R.id.button6:
                if(!firstTextView.getText().toString().equals("0"))
                    firstTextView.setText(firstTextView.getText().toString()+"6");
                else
                    firstTextView.setText("6");
                break;

            case R.id.button7:
                if(!firstTextView.getText().toString().equals("0"))
                    firstTextView.setText(firstTextView.getText().toString()+"7");
                else
                    firstTextView.setText("7");
                break;

            case R.id.button8:
                if(!firstTextView.getText().toString().equals("0"))
                    firstTextView.setText(firstTextView.getText().toString()+"8");
                else
                    firstTextView.setText("8");
                break;

            case R.id.button9:
                if(!firstTextView.getText().toString().equals("0"))
                    firstTextView.setText(firstTextView.getText().toString()+"9");
                else
                    firstTextView.setText("9");
                break;

        }
    }
}
