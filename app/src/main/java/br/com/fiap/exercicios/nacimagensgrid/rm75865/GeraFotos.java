package br.com.fiap.exercicios.nacimagensgrid.rm75865;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 04/04/2017.
 */

public class GeraFotos {
    public static List<Foto> listaFotos() {
        List<Foto> fotos = new ArrayList<>();

        fotos.add(new Foto(R.drawable.bordercollie));
        fotos.add(new Foto(R.drawable.beagle));
        fotos.add(new Foto(R.drawable.pitbull));
        fotos.add(new Foto(R.drawable.rottweiler));
        fotos.add(new Foto(R.drawable.bulldog));
        fotos.add(new Foto(R.drawable.husky));
        fotos.add(new Foto(R.drawable.york));
        fotos.add(new Foto(R.drawable.golden));


        return fotos;
    }
}