package com.example.mydz36.oneFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mydz36.R;

import java.util.ArrayList;

public class ExchangeFragAdapter extends RecyclerView.Adapter<ExchangeFragAdapter.MainViewHolder> {


    ArrayList<Label> list;
//    ExchangeFragment context;

    public ExchangeFragAdapter(ExchangeFragment exchangeFragment) {
        ArrayList<Label> list = new ArrayList<>();
        this.list = list;
//        this.context = context;
    }

    public void addText(ArrayList<Label> label) {
        list = label;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ExchangeFragAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.label_list, parent, false);

        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(list.get(position));
//        holder.onOneBind1(list1.get(position));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class MainViewHolder extends RecyclerView.ViewHolder {
        TextView lab;
        TextView USD;
        TextView valute;
        ImageView imageView;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);

            lab = itemView.findViewById(R.id.Label1);
            USD = itemView.findViewById(R.id.USD);
            valute = itemView.findViewById(R.id.valute);
            imageView = itemView.findViewById(R.id.image);
        }

        public void onBind(Label list) {
            lab.setText(list.lab);
            USD.setText(list.val);
            valute.setText(String.valueOf(list.num));

        }

    }

}