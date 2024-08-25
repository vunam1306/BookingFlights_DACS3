package com.example.bookingflights_dacs3;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.List;

public class TicketAdapter extends RecyclerView.Adapter<TicketAdapter.TicketViewHolder>{
    private Ticket ticket;
    private Context mContext;
    private  List<Ticket> mListTicket;

    private RecyclerView rcv_ticket;



    public TicketAdapter(List<Ticket> mListTicket) {
        this.mListTicket = mListTicket;
    }

    public void setData(List<Ticket> list) {
        this.mListTicket = list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public TicketViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ticket_item,parent,false);
        return new TicketViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TicketViewHolder holder, int position) {
        ticket = mListTicket.get(position);
        if (ticket == null) {
            return;
        }


        String imgAirlineUrl = ticket.getImgAirline();
        Log.d("ImageUrl", imgAirlineUrl);

        Picasso.get().load(imgAirlineUrl).into(holder.imgAirline);
//        holder.imgAirline.setImageResource(ticket.getImgAirline());
//        holder.imgAirline.setImageResource(ticket.getImgAirline());

        holder.plane_id.setText(ticket.getPlane_id());
        holder.time.setText(ticket.getTime());
        holder.price.setText((ticket.getPrice()) + "$" );
    }

    @Override
    public int getItemCount() {
        if (mListTicket != null) {
            return mListTicket.size();
        }
        return 0;
    }

    public static class TicketViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imgAirline;
        private final TextView plane_id;
        private final TextView time;
        private final TextView price;

        private final TextView airportcode, destinationcode;

        public TicketViewHolder(@NonNull View itemView) {
            super(itemView);

            airportcode = itemView.findViewById(R.id.airport_code);
            destinationcode = itemView.findViewById(R.id.destination_code);
            imgAirline = itemView.findViewById(R.id.airline_logo);
            plane_id = itemView.findViewById(R.id.plane_id);
            time = itemView.findViewById(R.id.time);
            price = itemView.findViewById(R.id.price);
        }
    }
}
