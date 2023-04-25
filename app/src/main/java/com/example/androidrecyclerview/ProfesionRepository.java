package com.example.androidrecyclerview;

import java.util.ArrayList;
import java.util.List;

public class ProfesionRepository {
    private List<Profesion> profesiones;
    private static ProfesionRepository instance;

    public ProfesionRepository(){
        profesiones = new ArrayList<>();
        profesiones.add(new Profesion("Actor", R.mipmap.Actor_foreground));
        profesiones.add(new Profesion("Albañil",R.mipmap.Albanil_foreground));
        profesiones.add(new Profesion("Banquero",R.mipmap.banquero_foreground));
        profesiones.add(new Profesion("Cocinero", R.mipmap.cocinero_foreground));
        profesiones.add(new Profesion("Estudiante", R.mipmap.estudiante_foreground));
        profesiones.add(new Profesion("Instagramer", R.mipmap.instagramer_foreground));
        profesiones.add(new Profesion("Pintor", R.mipmap.pintor_foreground));
        profesiones.add(new Profesion("Policía", R.mipmap.policia_foreground));
        profesiones.add(new Profesion("Político activo", R.mipmap.politicoActivo_foreground));
        profesiones.add(new Profesion("Político retirado", R.mipmap.politicoRetirado_foreground));
        profesiones.add(new Profesion("Vendedor", R.mipmap.Vendedor_foreground));
        profesiones.add(new Profesion("Youtuber", R.mipmap.youtuber_foreground));
    }

    public static ProfesionRepository getInstance(){
        if (instance==null){
            instance = new ProfesionRepository();
        }
        return instance;
    }


}
