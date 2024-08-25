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

import Domain.FuncitonDomain;

public class FuncionAdapter extends RecyclerView.Adapter<FuncionAdapter.ViewHolder> {

    ArrayList<FuncitonDomain> funcitonDomains;

    public FuncionAdapter(ArrayList<FuncitonDomain> funcitonDomains) {
        this.funcitonDomains = funcitonDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewrcl_funcion,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.funcionName.setText(funcitonDomains.get(position).getTitle());
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

        int drawableReoureId=holder.itemView.getContext().getResources()
                .getIdentifier(picUrl, "drawable",
                        holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableReoureId)
                .into(holder.funcionPic);

    }

    @Override
    public int getItemCount() {
        return funcitonDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView funcionName;
        ImageView funcionPic;
        ConstraintLayout mainLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            funcionName = itemView.findViewById(R.id.funcionName);
            funcionPic = itemView.findViewById(R.id.funcionPic);
            mainLayout = itemView.findViewById(R.id.fucionLayout);
        }
    }
}
