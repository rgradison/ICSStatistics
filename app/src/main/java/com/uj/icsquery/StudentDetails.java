package com.uj.icsquery;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.uj.icsquery.R;

public class StudentDetails extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Context context = this;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_details);

        Button buttonN = (Button) findViewById(R.id.btnNext);
        buttonN.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View arg0)
            {
                Intent intent = new Intent(context, IcsProblems.class);
                startActivity(intent);
            }
        });

        Button buttonB = (Button) findViewById(R.id.btnBack);
        buttonB.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View arg0)
            {
                Intent intent = new Intent(context, UserCategory.class);
                startActivity(intent);
            }
        });

        final Button btnOne = (Button) findViewById(R.id.btnOne);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = "1";
                TextView tv = (TextView)findViewById(R.id.lblNumber);
                tv.append(one);
            }
        });

        final Button btnTwo = (Button) findViewById(R.id.btnTwo);
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String two = "2";
                TextView tv = (TextView)findViewById(R.id.lblNumber);
                tv.append(two);
            }
        });

        final Button btnThree = (Button) findViewById(R.id.btnThree);
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String three = "3";
                TextView tv = (TextView)findViewById(R.id.lblNumber);
                tv.append(three);
            }
        });

        final Button btnFour = (Button) findViewById(R.id.btnFour);
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String four = "4";
                TextView tv = (TextView)findViewById(R.id.lblNumber);
                tv.append(four);
            }
        });

        final Button btnFive = (Button) findViewById(R.id.btnFive);
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String five = "5";
                TextView tv = (TextView)findViewById(R.id.lblNumber);
                tv.append(five);
            }
        });

        final Button btnSix = (Button) findViewById(R.id.btnSix);
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String six = "6";
                TextView tv = (TextView)findViewById(R.id.lblNumber);
                tv.append(six);
            }
        });

        final Button btnSeven = (Button) findViewById(R.id.btnSeven);
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String seven = "7";
                TextView tv = (TextView)findViewById(R.id.lblNumber);
                tv.append(seven);
            }
        });

        final Button btnEight = (Button) findViewById(R.id.btnEight);
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eight = "8";
                TextView tv = (TextView)findViewById(R.id.lblNumber);
                tv.append(eight);
            }
        });

        final Button btnNine = (Button) findViewById(R.id.btnNine);
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nine = "9";
                TextView tv = (TextView)findViewById(R.id.lblNumber);
                tv.append(nine);
            }
        });

        final Button btnZero = (Button) findViewById(R.id.btnZero);
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Zero = "0";
                TextView tv = (TextView)findViewById(R.id.lblNumber);
                tv.append(Zero);
            }
        });

        final Button btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                TextView tv = (TextView)findViewById(R.id.lblNumber);
                tv.setText("");
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.student_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
