package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String Titulo;
    private int totalDeReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte() {
        this.totalCurtidas++;
    }

    public void reproduz() {
        this.totalDeReproducoes++;
    }
}
