package vn.edu.usth.weather;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import android.media.MediaPlayer;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
//        setSupportActionBar(toolbar);
//        toolbar.setNavigationIcon(R.drawable.ic_baseline_refresh_24);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        TabLayout tablayout = findViewById(R.id.tab_layout);
        ViewPager2 pager2 = findViewById(R.id.view_pager);

        WeatherFragmentAdapter adapter = new WeatherFragmentAdapter(this);
        pager2.setAdapter(adapter);

        new TabLayoutMediator(tablayout, pager2, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("Ha Noi");
                    break;
                case 1:
                    tab.setText("Paris");
                    break;
                case 2:
                    tab.setText("London");
                    break;
            }
        }).attach();

        MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.dolphine);
        mediaPlayer.start();

        Log.i(TAG, "Create");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.refresh:
                Handler handler = new Handler(Looper.getMainLooper()) {
                    @Override
                    public void handleMessage(@NonNull Message msg) {
                        String content = msg.getData().getString("server_response");
                        Toast.makeText(getApplicationContext() ,content, Toast.LENGTH_SHORT).show();
                    }
                };

                Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(5000);
                        }
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("server_response", "Refreshed");
                        Message msg = new Message();
                        msg.setData(bundle);
                        handler.sendMessage(msg);
                    }
                });
                t.start();

                return true;
            case R.id.search:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
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