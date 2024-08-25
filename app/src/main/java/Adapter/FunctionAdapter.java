package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import com.example.bookingflights_dacs3.R;

import java.util.ArrayList;

import Domain.FunctionDomain;


public class FunctionAdapter extends RecyclerView.Adapter<FunctionAdapter.ViewHolder> {

    ArrayList<FunctionDomain> functionDomains;

    public FunctionAdapter(ArrayList<FunctionDomain> functionDomains) {
        this.functionDomains = functionDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewrcl_function,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.functionName.setText(functionDomains.get(position).getTitle());
        String picUrl = "";
        switch (position){
            case 0:{
                picUrl = "plane";
                break;
            }
            case 1:{
                picUrl = "hotel";
                break;
            }
            case 2:{
                picUrl = "schedule";
                break;
            }
            case 3:{
                picUrl = "support";
                break;
            }
        }

        int drawableResoureId=holder.itemView.getContext().getResources()
                .getIdentifier(picUrl, "drawable",
                        holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableResoureId)
                .into(holder.functionPic);

    }

    @Override
    public int getItemCount() {
        return functionDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView functionName;
        ImageView functionPic;
        ConstraintLayout mainLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            functionName = itemView.findViewById(R.id.functionName);
            functionPic = itemView.findViewById(R.id.functionPic);
            mainLayout = itemView.findViewById(R.id.fuctionLayout);
        }
    }
}
