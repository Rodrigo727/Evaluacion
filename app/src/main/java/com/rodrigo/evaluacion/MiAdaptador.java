package com.rodrigo.evaluacion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolderDatos> {
    ArrayList<Auto> listaAuto;

    public MiAdaptador(Ver_Registro ver_registro, ArrayList<Auto> listaAuto) {
        this.listaAuto = listaAuto;
    }


    @NonNull
    @Override
    public MiAdaptador.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent
                .getContext()).inflate
                (R.layout.simple_recycler_item,
                parent,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        holder.txtMarca.setText(listaAuto.get(position).getMarca());
        holder.txtModelo.setText(listaAuto.get(position).getModelo());
        holder.txtAC.setText(listaAuto.get(position).getAC());
        holder.txtTipo.setText(listaAuto.get(position).getTipo());
        holder.txtEstrella.setText(listaAuto.get(position).getValoracion());

    }

    @Override
    public int getItemCount() {
        return listaAuto.size();
    }


    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView txtModelo, txtMarca, txtAC, txtTipo, txtEstrella;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            txtAC = itemView.findViewById(R.id.txtAC);
            txtEstrella = itemView.findViewById(R.id.txtEstrella);
            txtMarca = itemView.findViewById(R.id.txtMarca);
            txtModelo = itemView.findViewById(R.id.txtModelo);
            txtTipo = itemView.findViewById(R.id.txtTipo);
        }

    }
}
