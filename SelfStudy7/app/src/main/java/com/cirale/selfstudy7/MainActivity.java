package com.cirale.selfstudy7;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = (TextView) findViewById(R.id.tv_display);

        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startAsynCalculation();
                
            }
        });
    }

    private void startAsynCalculation(){
        AsyncCalculateTask task = new AsyncCalculateTask();
        task.execute(1, Integer.MAX_VALUE);

    }

    class AsyncCalculateTask extends AsyncTask<Integer, Integer, Integer>{

        /** UI Thread */
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        /** Asynch Thread Method */
        @Override
        protected Integer doInBackground(Integer... integers) {

            int number = integers[0];
            int count = integers[1];
            int result = 0;

            int percentUnit = count / 100;


            for (int i = 0; i < count; i++){
                result += number;

                if (result % percentUnit == 0){
                    // percent 표시
                    publishProgress(result / percentUnit);
                }
            }

            return result;
        }

        /** UI Thread */
        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            tvDisplay.setText(values[0] + " Percent");

        }

        /** UI Thread */
        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);

            tvDisplay.setText("Result : " + integer);
        }
    }
}
