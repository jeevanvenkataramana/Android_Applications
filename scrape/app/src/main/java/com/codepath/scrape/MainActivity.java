package com.codepath.scrape;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Document;

public class MainActivity extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView)findViewById(R.id.tex1);
        Button but=(Button)findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new doit().execute();
            }
        });
    }

    public class doit extends AsyncTask<Void,Void,Void> {

        String words;

        @Override
        protected Void doInBackground(Void... voids) {
            try {

                Document doc = Jsoup.connect("http://18.221.170.106/example.php").get();

                words = doc.getTextContent();
            }
            catch(Exception e){
                e.printStackTrace();

            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            texx.setText(words);
        }
    }
}
