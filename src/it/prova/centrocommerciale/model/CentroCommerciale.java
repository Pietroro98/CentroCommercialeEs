package it.prova.centrocommerciale.model;

import java.util.ArrayList;
import java.util.List;

public class CentroCommerciale {
    private String ragioneSociale;
    private String indirizzoPerEsteso;
    private List<Negozio> negozi = new ArrayList<>();

    public CentroCommerciale(){}

    public CentroCommerciale(String ragioneSociale, String indirizzoPerEsteso, List<Negozio> negozi) {
        this.ragioneSociale = ragioneSociale;
        this.indirizzoPerEsteso = indirizzoPerEsteso;
        this.negozi = negozi;
    }

    public CentroCommerciale(String ragioneSociale, String indirizzoPerEsteso) {
        this.ragioneSociale = ragioneSociale;
        this.indirizzoPerEsteso = indirizzoPerEsteso;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public String getIndirizzoPerEsteso() {
        return indirizzoPerEsteso;
    }

    public void setIndirizzoPerEsteso(String indirizzoPerEsteso) {
        this.indirizzoPerEsteso = indirizzoPerEsteso;
    }

    public List<Negozio> getNegozi() {
        return negozi;
    }

    public void setNegozi(List<Negozio> negozi) {
        this.negozi = negozi;
    }

    public String toString() {
        return "CentroCommerciale{" + "ragioneSociale=" + ragioneSociale + ", indirizzoPerEsteso=" + indirizzoPerEsteso + ", negozi=" + negozi + '}';
    }
}
