package it.prova.centrocommerciale.model;

public abstract class Lavoratore {
    protected String nome;
    protected String cognome;

    public Lavoratore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    abstract boolean handleItemAdd(Item item);
    abstract boolean handleItemRemove(Item item);

    @Override
    public String toString() {
        return "Lavoratore{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
}
