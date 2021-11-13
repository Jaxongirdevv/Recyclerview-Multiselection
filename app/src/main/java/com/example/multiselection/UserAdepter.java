package com.example.multiselection;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdepter extends RecyclerView.Adapter<UserAdepter.UserviewHolder> {

    int counter=0;



    Context context;
    ArrayList<User> userArrayList;
    MainActivity mainActivity;

    ArrayList<User> selecteduserArrayList=new ArrayList<>();

    public UserAdepter(Context context, ArrayList<User> userArrayList) {
        this.context = context;
        this.userArrayList = userArrayList;
        mainActivity= (MainActivity) context;
    }

    @NonNull
    @Override
    public UserviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(context).inflate(R.layout.recyclerview_item,parent,false);
        return new UserviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdepter.UserviewHolder holder, int position) {
        if (userArrayList.get(position).isSelected()){
            holder.relativeLayout.setBackgroundColor(Color.CYAN);
        }
        else {
            holder.relativeLayout.setBackgroundColor(Color.WHITE);
        }
        holder.textView.setText(userArrayList.get(position).getUsername());
        holder.imageView.setImageResource(userArrayList.get(position).userimage);
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                mainActivity.imageView.setVisibility(View.VISIBLE);
                mainActivity.textView.setVisibility(View.VISIBLE);

                userArrayList.get(position).setSelected(!userArrayList.get(position).isSelected());
                if (userArrayList.get(position).isSelected()){
                    holder.relativeLayout.setBackgroundColor(Color.CYAN);
                    counter++;
                    mainActivity.textView.setText(counter+"item selected");

                    selecteduserArrayList.add(userArrayList.get(position));

                }
                else {
                    holder.relativeLayout.setBackgroundColor(Color.WHITE);
                    counter--;
                    mainActivity.textView.setText(counter+"item selected");

                    selecteduserArrayList.remove(userArrayList.get(position));


                }

                mainActivity.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        for (int i=0;i<selecteduserArrayList.size();i++){
                            userArrayList.remove(selecteduserArrayList.get(i));
                        }
                        selecteduserArrayList.clear();
                        mainActivity.imageView.setVisibility(View.INVISIBLE);
                        mainActivity.textView.setVisibility(View.INVISIBLE);
                        counter=0;
                        notifyDataSetChanged();

                    }
                });

                return true;
            }
        });

    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    public static class UserviewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        RelativeLayout relativeLayout;
        public UserviewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.tvusername);
            imageView=itemView.findViewById(R.id.ivuser);
            relativeLayout=itemView.findViewById(R.id.relativelay1);


        }
    }
}
