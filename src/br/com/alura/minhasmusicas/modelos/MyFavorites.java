package br.com.alura.minhasmusicas.modelos;

public class MyFavorites {

    public void inclui(Audio audio) {
        if (audio.getClassification() >= 9) {
            System.out.println("%s é considerado sucesso absoluto e preferido por todos!".formatted(audio.getTitle()));
        } else {
            System.out.println("%s também é um dos que todo mundo está curtindo.".formatted(audio.getTitle()));
        }
    }
}
