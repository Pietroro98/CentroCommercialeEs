package it.prova.centrocommerciale.model;

public class Commesso extends Lavoratore {
    public Commesso(String nome, String cognome) {
        super(nome, cognome);
    }

    @Override
    boolean handleItemAdd(Item item) {
        return true;
    }

    @Override
    boolean handleItemRemove(Item item) {
        return true;
    }
}
