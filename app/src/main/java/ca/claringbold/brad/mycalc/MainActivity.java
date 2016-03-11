package ca.claringbold.brad.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    Button buttondecimal,buttonadd,buttonsubtract,buttonmultiply,buttondivide,buttonequal,buttonclear;
    TextView textoutput;
    double value1, value2;
    boolean add, subtract, divide, multiply, decimalpressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
        button0=(Button) findViewById(R.id.button0);
        buttondecimal=(Button) findViewById(R.id.buttondecimal);
        buttonadd=(Button) findViewById(R.id.buttonadd);
        buttonsubtract=(Button) findViewById(R.id.buttonsubtract);
        buttonmultiply=(Button) findViewById(R.id.buttonmultiply);
        buttondivide=(Button) findViewById(R.id.buttondivide);
        buttonequal=(Button) findViewById(R.id.buttonequal);
        buttonclear=(Button) findViewById(R.id.buttonclear);
        textoutput=(TextView) findViewById(R.id.textoutput);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoutput.setText(textoutput.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoutput.setText(textoutput.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoutput.setText(textoutput.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoutput.setText(textoutput.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoutput.setText(textoutput.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoutput.setText(textoutput.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoutput.setText(textoutput.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoutput.setText(textoutput.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoutput.setText(textoutput.getText()+"9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoutput.setText(textoutput.getText()+"0");
            }
        });
        buttondecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (decimalpressed==false) {
                    decimalpressed=true;
                    textoutput.setText(textoutput.getText()+".");
                }
            }
        });
        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decimalpressed=false;
                textoutput.setText(null);
                value1 = 0;
                value2 = 0;
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Double.parseDouble(textoutput.getText()+"");
                add=true;
                decimalpressed=false;
                textoutput.setText(null);
            }
        });

        buttonsubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Double.parseDouble(textoutput.getText()+"");
                subtract=true;
                decimalpressed=false;
                textoutput.setText(null);
            }
        });

        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Double.parseDouble(textoutput.getText()+"");
                multiply=true;
                decimalpressed=false;
                textoutput.setText(null);
            }
        });

        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Double.parseDouble(textoutput.getText()+"");
                divide=true;
                decimalpressed=false;
                textoutput.setText(null);
            }
        });

        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decimalpressed=false;
                value2=Double.parseDouble(textoutput.getText()+"");
                if (add==true) {
                    textoutput.setText(value1+value2+"");
                    add=false;
                }
                if (subtract==true) {
                    textoutput.setText(value1-value2+"");
                    subtract=false;
                }
                if (multiply==true) {
                    textoutput.setText(value1*value2+"");
                    multiply=false;
                }
                if (divide==true) {
                    textoutput.setText(value1/value2+"");
                    divide=false;
                }
            }
        });

    }
}
