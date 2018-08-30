package com.example.user.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{
        int number;
        public boolean isSquire(){
            double squireRoot= Math.sqrt(number);
            if (squireRoot== Math.floor(squireRoot)){

                return true;
            }else {
                return false;
            }
        }

        //is it triangular number or not

        public boolean isTraingular(){
            int x=1;
            int triangularNumber=1;
            while(triangularNumber<number){
                x++;
                triangularNumber= triangularNumber+x;
            }
            if (triangularNumber==number){
                return true;
            }else {
                return false;
            }
        }
    }

    public void testNumber(View view){
        String message="";
        EditText input = (EditText) findViewById(R.id.getNumber);
        if (input.getText().toString().isEmpty()){
            message="field is empty...!";
        }else {
            Number numberObj = new Number();
            numberObj.number = Integer.parseInt(input.getText().toString());
            if (numberObj.isSquire()) {
                if (numberObj.isTraingular()) {
                    message = numberObj.number + " Is Both Squire and Traiangular Number";
                } else {
                    message = numberObj.number + " is a Squire Number Not Traiangular Number";
                }
            } else {
                if (numberObj.isTraingular()) {
                    message = numberObj.number + " Is a Traiangular Number";
                } else {
                    message = numberObj.number + " is neither Squire Number Nor Traiangular Number";
                }
            }
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
