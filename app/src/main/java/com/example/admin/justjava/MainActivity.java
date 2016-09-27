package com.example.admin.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import static com.example.admin.justjava.R.id.increment;
import static com.example.admin.justjava.R.id.price;
import static com.example.admin.justjava.R.id.decrement;
import static com.example.admin.justjava.R.id.text_viewer;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity=0;
    int price=5;
    int totalAmount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    /*public void text_viewer(View v) {
        totalAmount = quantity * price;
        display_text_view(totalAmount);
    }*/
    public void btn(View v) {
        //int quantity =3;
        //int price = text_viewer * 5;
        //display_text_view(price);
        totalAmount =quantity  * price;
        display_text_view(totalAmount);
    }
    public void increment(View v) {
        //int quantity =3;
        //display(quantity);
        //displayPrice(quantity * 5);
        quantity = quantity + 1;
        displayQuantity(quantity);

    }
    public void decrement(View v) {
        //int quantity =3;
        //display(quantity);
        //display(quantity * 5);
        quantity = quantity - 1;
        displayQuantity(quantity);


    }
    public void order_me(View v){
        display_text_view(quantity);

    }
    public void displayQuantity(int qty)
    {
        TextView txtQuantity = (TextView) findViewById(R.id.text_viewer);
        txtQuantity.setText( " "+qty);


    }



    private void display_text_view(int num){
        TextView txt_quantity = (TextView)findViewById(R.id.price);
        txt_quantity.setText("" +num );
    }
   /** private void display_btn(int number){
        TextView btn_view = (TextView) findViewById(R.id.sbt_order);
        btn_view.setText(number);
    }*/
}
