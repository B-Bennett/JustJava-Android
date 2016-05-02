package com.example.android.calculatinganorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    //Global Variable
    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        quantity = quantity + 1;

        displayQuantity(quantity);
    }
    /**
     * This method is called when the minus button is clicked.
     */

    public void decrement(View view) {
        quantity = quantity - 1;

        displayQuantity(quantity);
    }
        /**
         * This method is called when the order button is clicked.
         */
    public void submitOrder(View view) {
        int price = calculatePrice();
//       String priceMessage = createOrderSummary(price);
//        displayMessage(priceMessage);
        displayMessage(createOrderSummary(price));

    }

    /**
     * Create summary of the order
     *
     * @param price
     * @return text summary
     */
    private String createOrderSummary(int price){
        String priceMessage = "Name: Java Man";
        priceMessage += priceMessage + "\nQantity: " + quantity;
        priceMessage += priceMessage + "\nTotal: $"+ price;
        priceMessage += priceMessage + "\nThank You!";
        return priceMessage;

    }
    /**
     * Calculates the price of the order based on the current quantity.
     *
     * @return total price
     */
    private int calculatePrice() {
        return quantity * 5;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
