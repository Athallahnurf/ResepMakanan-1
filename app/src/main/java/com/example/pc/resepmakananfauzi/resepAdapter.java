package com.example.pc.resepmakananfauzi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by PC on 10/12/2017.
 */

public class resepAdapter extends RecyclerView.Adapter<resepAdapter.MyViewHolder>{
    private Context a;
    private List<resep> resepList;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.resep_list_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final resep resep = resepList.get(position);
        holder.judul.setText(resep.getJudul());
        holder.info.setText(resep.getInfo());
        holder.citra.setImageResource(resep.getCitra());
        holder.RL.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent in = new Intent(a, Data.class);
                        in.putExtra("gambar",resep.getCitra());
                        in.putExtra("judul", resep.getJudul());
                        in.putExtra("langkah", resep.getPerintah());
                        a.startActivity(in);
                    }
                });
    }

    @Override
    public int getItemCount() {
        return resepList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView judul,info,pembuatan;
        public ImageView citra;
        public RelativeLayout RL;
        public MyViewHolder(View view) {
            super(view);
            judul = (TextView) view.findViewById(R.id.judul);
            info = (TextView) view.findViewById(R.id.keterangan);
            citra = (ImageView) view.findViewById(R.id.citra);
            pembuatan = (TextView) view.findViewById(R.id.perintah);
            RL = (RelativeLayout) view.findViewById(R.id.row_data);
        }
    }
    public resepAdapter(Context a, List<resep> resepList){
        this.resepList = resepList;
        this.a = a;
    }
}
