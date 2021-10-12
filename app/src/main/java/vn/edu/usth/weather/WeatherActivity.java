package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        getSupportFragmentManager().beginTransaction().add(R.id.weatherFragment, new WeatherFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.forecastFragment, new ForecastFragment()).commit();

        Log.i(TAG, "Create");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "Start");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(TAG, "Stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i(TAG, "Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG, "Destroy");
    }
}