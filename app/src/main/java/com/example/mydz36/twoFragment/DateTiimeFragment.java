package com.example.mydz36.twoFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mydz36.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class DateTiimeFragment extends Fragment {
    TextView data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_date_tiime, container, false);
        data = view.findViewById(R.id.data);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


       data.setText(getCorrentDate());
}
    private String getCorrentDate() {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
        String dateTime = simpleDateFormat.format(calendar.getTime());
        return dateTime;
    }
}
