package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
        LinearLayout layout = new LinearLayout(getActivity());
        layout.setBackgroundColor(0x80FF0000);
        layout.setOrientation(LinearLayout.VERTICAL);

        // Monday layout
        LinearLayout monday_layout = new LinearLayout(getActivity());
        layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView monday = new TextView(getActivity());
        ImageView monday_weather = new ImageView(getActivity());
        LinearLayout monday_descriptions = new LinearLayout(getActivity());
        TextView monday_weather_des = new TextView(getActivity());
        TextView monday_temperature_des = new TextView(getActivity());

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
        layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView tuesday = new TextView(getActivity());
        ImageView tuesday_weather = new ImageView(getActivity());
        LinearLayout tuesday_descriptions = new LinearLayout(getActivity());
        TextView tuesday_weather_des = new TextView(getActivity());
        TextView tuesday_temperature_des = new TextView(getActivity());

        tuesday.setText("Tuesday");
        tuesday_weather.setImageResource(R.drawable.sun);
        tuesday_weather_des.setText("Sunny");
        tuesday_temperature_des.setText("31\u00B0 25\u00B0");

        tuesday_layout.addView(tuesday);
        tuesday_layout.addView(tuesday_weather);
        tuesday_layout.addView(tuesday_descriptions);
        tuesday_descriptions.addView(tue_weather);
        tuesday_descriptions.addView(tue_temperature);

        LinearLayout wednesday_layout = new LinearLayout(getActivity());
        layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView wednesday = new TextView(getActivity());
        ImageView wednesday_weather = new ImageView(getActivity());
        LinearLayout wednesday_descriptions = new LinearLayout(getActivity());
        TextView wed_weather = new TextView(getActivity());
        TextView wed_temperature = new TextView(getActivity());

        wednesday_layout.addView(wednesday);
        wednesday_layout.addView(wednesday_weather);
        wednesday_layout.addView(wednesday_descriptions);
        wednesday_descriptions.addView(wed_weather);
        wednesday_descriptions.addView(wed_temperature);

        LinearLayout thursday_layout = new LinearLayout(getActivity());
        layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView thursday = new TextView(getActivity());
        ImageView thursday_weather = new ImageView(getActivity());
        LinearLayout thursday_descriptions = new LinearLayout(getActivity());
        TextView thu_weather = new TextView(getActivity());
        TextView thu_temperature = new TextView(getActivity());

        thursday_layout.addView(thursday);
        thursday_layout.addView(thursday_weather);
        thursday_layout.addView(thursday_descriptions);
        thursday_descriptions.addView(thu_weather);
        thursday_descriptions.addView(thu_temperature);

        LinearLayout friday_layout = new LinearLayout(getActivity());
        layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView friday = new TextView(getActivity());
        ImageView friday_weather = new ImageView(getActivity());
        LinearLayout friday_descriptions = new LinearLayout(getActivity());
        TextView fri_weather = new TextView(getActivity());
        TextView fri_temperature = new TextView(getActivity());

        friday_layout.addView(friday);
        friday_layout.addView(friday_weather);
        friday_layout.addView(friday_descriptions);
        friday_descriptions.addView(fri_weather);
        friday_descriptions.addView(fri_temperature);

        LinearLayout saturday_layout = new LinearLayout(getActivity());
        layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView saturday = new TextView(getActivity());
        ImageView saturday_weather = new ImageView(getActivity());
        LinearLayout saturday_descriptions = new LinearLayout(getActivity());
        TextView sat_weather = new TextView(getActivity());
        TextView sat_temperature = new TextView(getActivity());

        saturday_layout.addView(saturday);
        saturday_layout.addView(saturday_weather);
        saturday_layout.addView(saturday_descriptions);
        saturday_descriptions.addView(sat_weather);
        saturday_descriptions.addView(sat_temperature);

        LinearLayout sunday_layout = new LinearLayout(getActivity());
        layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView sunday = new TextView(getActivity());
        ImageView sunday_weather = new ImageView(getActivity());
        LinearLayout sunday_descriptions = new LinearLayout(getActivity());
        TextView sun_weather = new TextView(getActivity());
        TextView sun_temperature = new TextView(getActivity());

        sunday_layout.addView(sunday);
        sunday_layout.addView(sunday_weather);
        sunday_layout.addView(sunday_descriptions);
        sunday_descriptions.addView(sun_weather);
        sunday_descriptions.addView(sun_temperature);

        return layout;
    }
}