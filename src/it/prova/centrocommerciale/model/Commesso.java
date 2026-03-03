package it.prova.centrocommerciale.model;

public class Commesso extends Lavoratore {
    public Commesso(String nome, String cognome, Negozio negozio) {
        super(nome, cognome, negozio);
    }

    public Commesso(String nome, String cognome) {
        super(nome, cognome);
    }

    @Override
    boolean handleItemAdd(Item item) {
        if (this.getNegozio() == null) {
            return false;
        }
        if( this.getNegozio().getItems().contains(item)) return false;
        this.getNegozio().getItems().add(item);
        return true;
    }

    @Override
    boolean handleItemRemove(Item item) {
        if (this.getNegozio() == null) {
            return false;
        }
        return this.getNegozio().getItems().remove(item);
    }
}
