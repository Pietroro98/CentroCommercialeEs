package it.prova.centrocommerciale.model;

public class personaleAmministrativo extends Lavoratore{
    public personaleAmministrativo(String nome, String cognome) {
        super(nome, cognome);
    }

    @Override
    boolean handleItemAdd(Item item) {
        return true;
    }

    @Override
    boolean handleItemRemove(Item item) {
        return false;
    }
}
