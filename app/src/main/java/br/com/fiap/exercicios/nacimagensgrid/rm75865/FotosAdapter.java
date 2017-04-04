package br.com.fiap.exercicios.nacimagensgrid.rm75865;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by logonrm on 04/04/2017.
 */

public class FotosAdapter extends RecyclerView.Adapter<FotosAdapter.FotosViewHolder> {
    private Context context;
    private List<Foto> fotos;

    public FotosAdapter(Context context, List<Foto> fotos) {
        this.context = context;
        this.fotos = fotos;
    }

    @Override
    public FotosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(this.context).inflate(R.layout.recyclerview_fotos, parent, false);
        FotosViewHolder fotoViewHolder = new FotosViewHolder(v);
        return fotoViewHolder;
    }

    @Override
    public void onBindViewHolder(FotosAdapter.FotosViewHolder holder, int position) {
        Foto foto = this.fotos.get(position);
        holder.imgFotos.setImageResource(foto.getImagens() );
    }

    @Override
    public int getItemCount() {
        return this.fotos.size();
    }

    public static class FotosViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView imgFotos;


        public FotosViewHolder(View itemView) {
            super(itemView);

            cardView = (CardView) itemView;
            imgFotos = (ImageView) itemView.findViewById(R.id.imgFotos);
        }
    }
}
