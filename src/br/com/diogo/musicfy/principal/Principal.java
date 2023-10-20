package br.com.diogo.musicfy.principal;

import br.com.diogo.musicfy.modelos.MinhasPreferidas;
import br.com.diogo.musicfy.modelos.Musica;
import br.com.diogo.musicfy.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhamusica = new Musica();
        minhamusica.setTitulo("Follow You");
        minhamusica.setCantor("Bring Me the Horizon");

        for (int i = 0; i < 1000; i++) {
            minhamusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhamusica.curte();
        }

        Podcast meupodcast = new Podcast();
        meupodcast.setTitulo("Podpah");
        meupodcast.setApresentador("Igão e Mítico");

        for (int i = 0; i < 5000; i++) {
            meupodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meupodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meupodcast);
        preferidas.inclui(minhamusica);
    }

}
