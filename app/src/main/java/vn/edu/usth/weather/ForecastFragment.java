package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ForecastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ForecastFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ForecastFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ForecastFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ForecastFragment newInstance(String param1, String param2) {
        ForecastFragment fragment = new ForecastFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Main layout
        LinearLayout main_layout = new LinearLayout(getActivity());
        main_layout.setBackgroundColor(0x100000FF);
        main_layout.setOrientation(LinearLayout.VERTICAL);

        // Scroll
        ScrollView scroll_layout = new ScrollView(getActivity());
        scroll_layout.addView(main_layout);

        // Monday layout
        LinearLayout monday_layout = new LinearLayout(getActivity());
        monday_layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView monday = new TextView(getActivity());
        ImageView monday_weather = new ImageView(getActivity());
        LinearLayout monday_descriptions = new LinearLayout(getActivity());
        monday_descriptions.setOrientation(LinearLayout.VERTICAL);
        TextView monday_weather_des = new TextView(getActivity());
        TextView monday_temperature_des = new TextView(getActivity());

        // Set up monday
        monday.setText("Monday");
        monday_weather.setImageResource(R.drawable.rainy);
        monday_weather_des.setText("Heavy Rain");
        monday_temperature_des.setText("26\u00B0 21\u00B0");


        monday_layout.addView(monday);
        monday_layout.addView(monday_weather);
        monday_layout.addView(monday_descriptions);
        monday_descriptions.addView(monday_weather_des);
        monday_descriptions.addView(monday_temperature_des);

        // Tuesday layout
        LinearLayout tuesday_layout = new LinearLayout(getActivity());
        tuesday_layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView tuesday = new TextView(getActivity());
        ImageView tuesday_weather = new ImageView(getActivity());
        LinearLayout tuesday_descriptions = new LinearLayout(getActivity());
        tuesday_descriptions.setOrientation(LinearLayout.VERTICAL);
        TextView tuesday_weather_des = new TextView(getActivity());
        TextView tuesday_temperature_des = new TextView(getActivity());

        tuesday.setText("Tuesday");
        tuesday_weather.setImageResource(R.drawable.sun);
        tuesday_weather_des.setText("Sunny");
        tuesday_temperature_des.setText("31\u00B0 25\u00B0");

        tuesday_layout.addView(tuesday);
        tuesday_layout.addView(tuesday_weather);
        tuesday_layout.addView(tuesday_descriptions);
        tuesday_descriptions.addView(tuesday_weather_des);
        tuesday_descriptions.addView(tuesday_temperature_des);


        // Wednesday layout
        LinearLayout wednesday_layout = new LinearLayout(getActivity());
        wednesday_layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView wednesday = new TextView(getActivity());
        ImageView wednesday_weather = new ImageView(getActivity());
        LinearLayout wednesday_descriptions = new LinearLayout(getActivity());
        wednesday_descriptions.setOrientation(LinearLayout.VERTICAL);
        TextView wednesday_weather_des = new TextView(getActivity());
        TextView wednesday_temperature_des = new TextView(getActivity());

        wednesday.setText("Wednesday");
        wednesday_weather.setImageResource(R.drawable.rainy);
        wednesday_weather_des.setText("Light Rain");
        wednesday_temperature_des.setText("32\u00B0 24\u00B0");

        wednesday_layout.addView(wednesday);
        wednesday_layout.addView(wednesday_weather);
        wednesday_layout.addView(wednesday_descriptions);
        wednesday_descriptions.addView(wednesday_weather_des);
        wednesday_descriptions.addView(wednesday_temperature_des);


        // Thursday layout
        LinearLayout thursday_layout = new LinearLayout(getActivity());
        thursday_layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView thursday = new TextView(getActivity());
        ImageView thursday_weather = new ImageView(getActivity());
        LinearLayout thursday_descriptions = new LinearLayout(getActivity());
        thursday_descriptions.setOrientation(LinearLayout.VERTICAL);
        TextView thursday_weather_des = new TextView(getActivity());
        TextView thursday_temperature_des = new TextView(getActivity());

        thursday.setText("Thursday");
        thursday_weather.setImageResource(R.drawable.sun);
        thursday_weather_des.setText("Sunny");
        thursday_temperature_des.setText("34\u00B0 25\u00B0");

        thursday_layout.addView(thursday);
        thursday_layout.addView(thursday_weather);
        thursday_layout.addView(thursday_descriptions);
        thursday_descriptions.addView(thursday_weather_des);
        thursday_descriptions.addView(thursday_temperature_des);


        // Friday layout
        LinearLayout friday_layout = new LinearLayout(getActivity());
        friday_layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView friday = new TextView(getActivity());
        ImageView friday_weather = new ImageView(getActivity());
        LinearLayout friday_descriptions = new LinearLayout(getActivity());
        friday_descriptions.setOrientation(LinearLayout.VERTICAL);
        TextView friday_weather_des = new TextView(getActivity());
        TextView friday_temperature_des = new TextView(getActivity());

        friday.setText("Friday");
        friday_weather.setImageResource(R.drawable.sun);
        friday_weather_des.setText("Sunny");
        friday_temperature_des.setText("33\u00B0 24\u00B0");

        friday_layout.addView(friday);
        friday_layout.addView(friday_weather);
        friday_layout.addView(friday_descriptions);
        friday_descriptions.addView(friday_weather_des);
        friday_descriptions.addView(friday_temperature_des);


        // Saturday layout
        LinearLayout saturday_layout = new LinearLayout(getActivity());
        saturday_layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView saturday = new TextView(getActivity());
        ImageView saturday_weather = new ImageView(getActivity());
        LinearLayout saturday_descriptions = new LinearLayout(getActivity());
        saturday_descriptions.setOrientation(LinearLayout.VERTICAL);
        TextView saturday_weather_des = new TextView(getActivity());
        TextView saturday_temperature_des = new TextView(getActivity());

        saturday.setText("Saturday");
        saturday_weather.setImageResource(R.drawable.rainy);
        saturday_weather_des.setText("Light rain");
        saturday_temperature_des.setText("31\u00B0 24\u00B0");

        saturday_layout.addView(saturday);
        saturday_layout.addView(saturday_weather);
        saturday_layout.addView(saturday_descriptions);
        saturday_descriptions.addView(saturday_weather_des);
        saturday_descriptions.addView(saturday_temperature_des);


        // Sunday layout
        LinearLayout sunday_layout = new LinearLayout(getActivity());
        sunday_layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView sunday = new TextView(getActivity());
        ImageView sunday_weather = new ImageView(getActivity());
        LinearLayout sunday_descriptions = new LinearLayout(getActivity());
        sunday_descriptions.setOrientation(LinearLayout.VERTICAL);
        TextView sunday_weather_des = new TextView(getActivity());
        TextView sunday_temperature_des = new TextView(getActivity());

        sunday.setText("Sunday");
        sunday_weather.setImageResource(R.drawable.rainy);
        sunday_weather_des.setText("Heavy rain");
        sunday_temperature_des.setText("29\u00B0 23\u00B0");

        sunday_layout.addView(sunday);
        sunday_layout.addView(sunday_weather);
        sunday_layout.addView(sunday_descriptions);
        sunday_descriptions.addView(sunday_weather_des);
        sunday_descriptions.addView(sunday_temperature_des);


        // add to main layout
        main_layout.addView(monday_layout);
        main_layout.addView(tuesday_layout);
        main_layout.addView(wednesday_layout);
        main_layout.addView(thursday_layout);
        main_layout.addView(friday_layout);
        main_layout.addView(saturday_layout);
        main_layout.addView(sunday_layout);

        return main_layout;
    }
}