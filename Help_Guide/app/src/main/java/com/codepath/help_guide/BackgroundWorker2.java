package com.codepath.help_guide;
import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.AdapterView;



public class BackgroundWorker2 extends AsyncTask<String,Void,String> {
    Context context;
    AlertDialog alertDialog;
    BackgroundWorker2 (Context ctx){
        context= ctx;
    }

    @Override
    protected String doInBackground(String... params) {
        String situation=params[1];
        String result="";

        if(situation.equals("Police")){
            result="Call 100";
            return result;
        }

        if(situation.equals("Ambulance")){
            result="Call 108";
            return result;
        }

        if(situation.equals("Fire Station")){
            result="Call 109";
            return result;
        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle("Helpline");
    }

    @Override
    protected void onPostExecute(String result) {
        result = result;
        alertDialog.setMessage(result);
        alertDialog.show();
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}
