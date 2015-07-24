package com.ehappy.exmultibutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends Activity {
    // Declare Variable
    private TextView txtShow;
    private Button btnZero,btnOne,btnTwo,btnThree,btnFour;
    private Button btnFive,btnSix,btnSeven,btnEight,btnNine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the res/layout components
        txtShow  = (TextView)findViewById(R.id.txtShow);
        btnZero  = (Button)findViewById(R.id.btnZero);
        btnOne   = (Button)findViewById(R.id.btnOne);
        btnTwo   = (Button)findViewById(R.id.btnTwo);
        btnThree = (Button)findViewById(R.id.btnThree);
        btnFour  = (Button)findViewById(R.id.btnFour);
        btnFive  = (Button)findViewById(R.id.btnFive);
        btnSix   = (Button)findViewById(R.id.btnSix);
        btnSeven = (Button)findViewById(R.id.btnSeven);
        btnEight = (Button)findViewById(R.id.btnEight);
        btnNine  = (Button)findViewById(R.id.btnNine);

        // setting button elements click event all in myListner
        btnZero.setOnClickListener(myListner);
        btnZero.setOnClickListener(myListner);
        btnOne.setOnClickListener(myListner);
        btnTwo.setOnClickListener(myListner);
        btnThree.setOnClickListener(myListner);
        btnFour.setOnClickListener(myListner);
        btnFive.setOnClickListener(myListner);
        btnSix.setOnClickListener(myListner);
        btnSeven.setOnClickListener(myListner);
        btnEight.setOnClickListener(myListner);
        btnNine.setOnClickListener(myListner);
    }

    // Define onClick method
    private Button.OnClickListener myListner =
        new Button.OnClickListener() {
            @Override
            public void onClick (View v) {
                String s = txtShow.getText().toString();
                switch (v.getId()) {
                    case R.id.btnZero: {
                        txtShow.setText(s + "0");
                        break;
                    }
                    case R.id.btnOne: {
                        txtShow.setText(s + "1");
                        break;
                    }
                    case R.id.btnTwo:{
                        txtShow.setText(s + "2");
                        break;
                    }
                    case R.id.btnThree:{
                        txtShow.setText(s + "3");
                        break;
                    }
                    case R.id.btnFour:{
                        txtShow.setText(s + "4");
                        break;
                    }
                    case R.id.btnFive:{
                        txtShow.setText(s + "5");
                        break;
                    }
                    case R.id.btnSix:{
                        txtShow.setText(s + "6");
                        break;
                    }
                    case R.id.btnSeven:{
                        txtShow.setText(s + "7");
                        break;
                    }
                    case R.id.btnEight:{
                        txtShow.setText(s + "8");
                        break;
                    }
                    case R.id.btnNine:{
                        txtShow.setText(s + "9");
                        break;
                    }
                }
            }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
