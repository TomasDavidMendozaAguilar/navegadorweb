package com.example.navegadorweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Buscador = (Button)findViewById(R.id.btnBuscar);
        EditText palabra = (EditText)findViewById(R.id.EditURL);
        WebView ver =(WebView)findViewById(R.id.webVer);
        ver.setWebViewClient(new visual());
        Buscador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String vi = palabra.getText().toString();

                ver.getSettings().setLoadsImagesAutomatically(true);
                ver.getSettings().setJavaScriptEnabled(true);
                ver.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                ver.loadUrl("https://"+vi);

                            }
        });

    }
    private class visual extends WebViewClient{
        public boolean urlVisual(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }

}