package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Music;
import br.com.alura.minhasmusicas.modelos.MyFavorites;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Music musicForever = new Music();
        musicForever.setTitle("Forever");
        musicForever.setArtist("Kiss");

        for (int i = 0; i < 1000; i++) {
            musicForever.play();
        }
        for (int i = 0; i < 50; i++) {
            musicForever.giveLike();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Maratona de Sofá");
        myPodcast.setHost("Fernando Medeiros");

        for (int i = 0; i < 5000; i++) {
            myPodcast.play();
        }
        for (int i = 0; i < 1000; i++) {
            myPodcast.giveLike();
        }

        MyFavorites favorites = new MyFavorites();
        favorites.inclui(myPodcast);
        favorites.inclui(musicForever);
    }
}
