package com.example.rajnunes.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;
import java.text.StringCharacterIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //on click
    int orders=0;
    public void submitOrder(View view)
    {
        if(orders==0) {
            String priceMessage = "No Order Set";
            displayMessage(priceMessage);
        }
        else
        {
            String priceMessage="Amount Due: "+orders*10;
            displayMessage(priceMessage);
        }
    }

    private void display(int num)
    {
        TextView quantitytextview=(TextView) findViewById(R.id.quantity_num_text_view);
        quantitytextview.setText(""+num);
    }

    private void displayPrice(int num)
    {
        TextView pricetextview=(TextView) findViewById(R.id.price_num_text_view);
        pricetextview.setText(NumberFormat.getCurrencyInstance().format(num));
    }

    public void increase(View view)
    {
        orders++;
        display(orders);
        //submitOrder();
    }

    public void decrease(View view)
    {

        if(orders>=1)
        {
            orders--;
            display(orders);
        }
        //submitOrder();
    }

    public void displayMessage(String message)
    {
        TextView priceTextView=(TextView) findViewById(R.id.price_num_text_view);
        priceTextView.setText(message);
    }

}
