package it.prova.centrocommerciale.model;

public class PersonaleAmministrativo extends Lavoratore{
    public PersonaleAmministrativo(String nome, String cognome) {
        super(nome, cognome);
    }

    @Override
    boolean handleItemAdd(Item item) {
        if (getNegozio() == null) return false;
        if( this.getNegozio().getItems().contains(item)) return false;
        getNegozio().getItems().add(item);
        return true;
    }

    @Override
    boolean handleItemRemove(Item item) {
        return false;
    }
}
