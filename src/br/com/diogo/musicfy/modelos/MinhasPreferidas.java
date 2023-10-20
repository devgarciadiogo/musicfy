package br.com.diogo.musicfy.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassficacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto" + " e preferido por todos!");
        } else {
            System.out.println(audio.getTitulo() + " Da banda Bring Me the Horizon" + " também é um dos que todo mundo está curtindo");
        }
    }
}
