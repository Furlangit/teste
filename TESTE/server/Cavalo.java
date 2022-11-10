package server;

public class Cavalo {
    private String nome;
    private int tempo;

    public void Cavalo(String nome, int tempo){

        this.nome = nome;
        this.tempo = tempo;

    }

    public String getNome() {
        return nome;
    }

    public int getTempo() {
        return tempo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    
}
