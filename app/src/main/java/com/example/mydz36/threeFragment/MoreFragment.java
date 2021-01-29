package com.example.mydz36.threeFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mydz36.fourFragment.ForeFragment;
import com.example.mydz36.R;

public class MoreFragment extends Fragment {
    SwitchCompat switchCompat;
    Boolean aBoolean = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_more, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        switchCompat = view.findViewById(R.id.switchh);
        MoreFragment m1 = new MoreFragment();
        ForeFragment m2 = new ForeFragment();
        switchCompat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                if (aBoolean) {
                    transaction.replace(R.id.frame, m1);
                    aBoolean = false;
                } else {
                    transaction.replace(R.id.frame, m2);
                    aBoolean = true;
                }
                transaction.commit();
            }
        });
    }
}