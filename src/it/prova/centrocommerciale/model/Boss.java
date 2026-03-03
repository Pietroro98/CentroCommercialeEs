package it.prova.centrocommerciale.model;

public class Boss extends Lavoratore{
    public Boss(String nome, String cognome) {
        super(nome, cognome);
    }

    @Override
    boolean handleItemAdd(Item item) {
        return false;
    }

    @Override
    boolean handleItemRemove(Item item) {
        return false;
    }
}
