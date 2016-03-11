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
    int value1,value2;
    boolean add,subtract,divide,multiply;


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

    }
}
