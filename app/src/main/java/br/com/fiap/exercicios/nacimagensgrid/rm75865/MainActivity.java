package br.com.fiap.exercicios.nacimagensgrid.rm75865;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.List;

import static android.widget.LinearLayout.VERTICAL;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvFotos;
    List<Foto> fotos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fotos = GeraFotos.listaFotos();

        RecyclerView.LayoutManager layout = new GridLayoutManager(this, 2);


        FotosAdapter adapter = new FotosAdapter(this, fotos);

        rvFotos = (RecyclerView)findViewById(R.id.rvFotos);
        rvFotos.setHasFixedSize(true);
        rvFotos.setAdapter(adapter);
        rvFotos.setLayoutManager(layout);


    }
}
