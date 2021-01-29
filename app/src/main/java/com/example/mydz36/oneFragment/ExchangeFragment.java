package com.example.mydz36.oneFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mydz36.R;
import com.example.mydz36.oneFragment.ExchangeFragAdapter;
import com.example.mydz36.oneFragment.Label;

import java.util.ArrayList;


public class ExchangeFragment extends Fragment {


    RecyclerView recyclerView;
    ArrayList<Label> list;
    ExchangeFragAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exchange, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView = view.findViewById(R.id.recyclerView);
        adapter = new ExchangeFragAdapter(this);
        recyclerView.setAdapter(adapter);
        list = new ArrayList<>();
        list.add(0, new Label("EUROPA", "EUR", 102));
        list.add(1, new Label("USA", "USD", 180));
        list.add(2, new Label("RUSSIAN", "RUB", 100));
        list.add(3, new Label("AUSTRALIA", "AUD", 200));
        list.add(4, new Label("AZERBAIDJAN", "AZN", 250));
        list.add(5, new Label("ARGENTINA", "ARP", 350));
        list.add(6, new Label("KAZAKSTAN", "KZT", 190));
        list.add(7, new Label("KYRGYSTAN", "KGS", 120));
        list.add(8, new Label("CNYNA", "CHY", 168));
        list.add(9, new Label("COLUMBIA", "COP", 289));
        list.add(10, new Label("GERMANY", "GRM", 189));
        list.add(11, new Label("ITALIA", "SRI", 140));
        list.add(12, new Label("URUGUAY", "UAH", 120));
        list.add(13, new Label("FRANCE", "FRC", 132));
        list.add(14, new Label("JAPAN", "JAP", 142));

        adapter.addText(list);
    }
}