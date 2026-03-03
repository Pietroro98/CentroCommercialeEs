package it.prova.centrocommerciale.model;

import java.util.ArrayList;
import java.util.List;

public class Negozio {
    private String ragioneSociale;
    private String partitaIva;
    private List<Item> items = new ArrayList<>();
    private CentroCommerciale centroCommerciale;

    public Negozio(){}


    public Negozio(String ragioneSociale, String partitaIva, List<Item> items, CentroCommerciale centroCommerciale) {
        this.ragioneSociale = ragioneSociale;
        this.partitaIva = partitaIva;
        this.items = items;
        this.centroCommerciale = centroCommerciale;
    }

    public Negozio(String ragioneSociale, String partitaIva) {
        this.ragioneSociale = ragioneSociale;
        this.partitaIva = partitaIva;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public CentroCommerciale getCentroCommerciale() {
        return centroCommerciale;
    }

    public void setCentroCommerciale(CentroCommerciale centroCommerciale) {
        this.centroCommerciale = centroCommerciale;
    }

    /**
     * Aggiunge un item al negozio, controllando il ruolo del lavoratore,
     *
     * @param lavoratore
     * @param item
     * @return
     */
    public boolean addToItems(Lavoratore lavoratore, Item item) {
        return true;
    }

    public boolean removeFromItems(Lavoratore lavoratore, Item item) {
        return true;
    }

    public String toString() {
        return "Negozio{" + "ragioneSociale=" + ragioneSociale + ", partitaIva=" + partitaIva + ", items=" + items + '}';
    }
}
