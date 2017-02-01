package com.example.networkingandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;


public class ServerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server);

        final TextView mTextView = (TextView) findViewById(R.id.internet_text);
        mTextView.setText("This text has been modified by magic");
        //mTextView.setText("This text has modified again!");

        //Initiate request
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://toro-labs.com";

        //Request a string response from the provided URL
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response){
                        //Display the first 500 characters of the response string.
                        mTextView.setText("Response is: " + response.substring(0,500));
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error){
                        mTextView.setText("That didn't work!");
                    }
        }
        );
        //Add the request to the RequestQueue
        queue.add(stringRequest);

    }



}
