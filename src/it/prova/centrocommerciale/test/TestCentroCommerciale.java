package it.prova.centrocommerciale.test;

import it.prova.centrocommerciale.model.*;

public class TestCentroCommerciale {
    public static void main(String[] args) {
        System.out.println("Centro commerciale esercizio");

        System.out.println("\n Creo due negozi diversi");
        Negozio negozioA = new Negozio("Negozio A", "AAA111");
        Negozio negozioB = new Negozio("Negozio B", "BBB222");

        System.out.println("\n Creo item");
        Item item1 = new Item("A001", "Smartphone", 500.00f);
        Item item2 = new Item("A002", "Tablet", 300.00f);
        Item item3 = new Item("A003", "Cuffie", 50.00f);
        Item item4 = new Item("A004", "Mouse", 25.00f);
        Item item5 = new Item("A005", "Tastiera", 40.00f);
        Item item6 = new Item("A006", "Monitor", 180.00f);
        Item item7 = new Item("A007", "Powerbank", 35.00f);
        Item item8 = new Item("A008", "Caricatore", 20.00f);

        System.out.println("\n Creo lavoratori");
        Commesso commessoA = new Commesso("Luca", "Bianchi");
        commessoA.setNegozio(negozioA); // commesso che appartiene al negozio A

        Commesso commessoB = new Commesso("Marco", "Rossi");
        commessoB.setNegozio(negozioB); // commesso che appartiene al negozio B

        Commesso commessoSenzaNegozio = new Commesso("Paolo", "Neri"); // negozio null

        Boss bossA = new Boss("Gianni", "Boss");
        bossA.setNegozio(negozioA); // boss che appartiene ad A

        PersonaleAmministrativo personaleAmministrativoA = new PersonaleAmministrativo("Sara", "Verdi");
        personaleAmministrativoA.setNegozio(negozioA); // personale amministrativo che appartiene ad A

        // altri lavoratori (stesso stile di nomi)
        Commesso commessoA2 = new Commesso("Anna", "Gialli");
        commessoA2.setNegozio(negozioA); // altro commesso di A

        Boss bossB = new Boss("Claudio", "BossB");
        bossB.setNegozio(negozioB); // boss di B

        PersonaleAmministrativo personaleAmministrativoB = new PersonaleAmministrativo("Marta", "Blu");
        personaleAmministrativoB.setNegozio(negozioB); // admin di B

        // =========================
        System.out.println("\nTEST 1: Commesso A aggiunge item1 su Negozio A (atteso: true)");
        System.out.println("Item prima: " + negozioA.getItems().size());
        System.out.println("Esito: " + negozioA.addToItems(commessoA, item1));
        System.out.println("Item dopo: " + negozioA.getItems().size());
        System.out.println("Items Negozio A: " + negozioA.getItems());

        // =========================
        System.out.println("\nTEST 2: Commesso A2 aggiunge item2 su Negozio A (atteso: true)");
        System.out.println("Item prima: " + negozioA.getItems().size());
        System.out.println("Esito: " + negozioA.addToItems(commessoA2, item2));
        System.out.println("Item dopo: " + negozioA.getItems().size());
        System.out.println("Items Negozio A: " + negozioA.getItems());

        // =========================
        System.out.println("\nTEST 3: personaleAmministrativoA aggiunge item3 su Negozio A (atteso: true)");
        System.out.println("Item prima: " + negozioA.getItems().size());
        System.out.println("Esito: " + negozioA.addToItems(personaleAmministrativoA, item3));
        System.out.println("Item dopo: " + negozioA.getItems().size());
        System.out.println("Items Negozio A: " + negozioA.getItems());

        // =========================
        System.out.println("\nTEST 4: Boss A prova ad aggiungere item4 su Negozio A (atteso: false)");
        System.out.println("Item prima: " + negozioA.getItems().size());
        System.out.println("Esito: " + negozioA.addToItems(bossA, item4));
        System.out.println("Item dopo: " + negozioA.getItems().size());
        System.out.println("Items Negozio A: " + negozioA.getItems());

        // =========================
        System.out.println("\nTEST 5: Commesso B (di Negozio B) prova ad aggiungere item5 su Negozio A (atteso: false - non appartiene)");
        System.out.println("Item prima: " + negozioA.getItems().size());
        System.out.println("Esito: " + negozioA.addToItems(commessoB, item5));
        System.out.println("Item dopo: " + negozioA.getItems().size());
        System.out.println("Items Negozio A: " + negozioA.getItems());

        // =========================
        System.out.println("\nTEST 6: Commesso senza negozio prova ad aggiungere item6 su Negozio A (atteso: false - negozio null)");
        System.out.println("Item prima: " + negozioA.getItems().size());
        System.out.println("Esito: " + negozioA.addToItems(commessoSenzaNegozio, item6));
        System.out.println("Item dopo: " + negozioA.getItems().size());
        System.out.println("Items Negozio A: " + negozioA.getItems());

        // =========================
        System.out.println("\nTEST 7: Commesso A rimuove item1 da Negozio A (atteso: true)");
        System.out.println("Item prima: " + negozioA.getItems().size());
        System.out.println("Esito: " + negozioA.removeFromItems(commessoA, item1));
        System.out.println("Item dopo: " + negozioA.getItems().size());
        System.out.println("Items Negozio A: " + negozioA.getItems());

        // =========================
        System.out.println("\nTEST 8: personaleAmministrativoA prova a rimuovere item3 da Negozio A (atteso: false - admin non può remove)");
        System.out.println("Item prima: " + negozioA.getItems().size());
        System.out.println("Esito: " + negozioA.removeFromItems(personaleAmministrativoA, item3));
        System.out.println("Item dopo: " + negozioA.getItems().size());
        System.out.println("Items Negozio A: " + negozioA.getItems());

        // =========================
        System.out.println("\nTEST 9: Commesso B prova a rimuovere item2 da Negozio A (atteso: false - non appartiene)");
        System.out.println("Item prima: " + negozioA.getItems().size());
        System.out.println("Esito: " + negozioA.removeFromItems(commessoB, item2));
        System.out.println("Item dopo: " + negozioA.getItems().size());
        System.out.println("Items Negozio A: " + negozioA.getItems());

        // =========================
        System.out.println("\nTEST 10: Commesso B aggiunge item7 su Negozio B (atteso: true)");
        System.out.println("Item prima: " + negozioB.getItems().size());
        System.out.println("Esito: " + negozioB.addToItems(commessoB, item7));
        System.out.println("Item dopo: " + negozioB.getItems().size());
        System.out.println("Items Negozio B: " + negozioB.getItems());

        // =========================
        System.out.println("\nTEST 11: Boss B prova ad aggiungere item8 su Negozio B (atteso: false)");
        System.out.println("Item prima: " + negozioB.getItems().size());
        System.out.println("Esito: " + negozioB.addToItems(bossB, item8));
        System.out.println("Item dopo: " + negozioB.getItems().size());
        System.out.println("Items Negozio B: " + negozioB.getItems());

        // =========================
        System.out.println("\nTEST 12: personaleAmministrativoB aggiunge item4 su Negozio B (atteso: true)");
        System.out.println("Item prima: " + negozioB.getItems().size());
        System.out.println("Esito: " + negozioB.addToItems(personaleAmministrativoB, item4));
        System.out.println("Item dopo: " + negozioB.getItems().size());
        System.out.println("Items Negozio B: " + negozioB.getItems());

        // =========================
        System.out.println("\nTEST 13: Commesso B rimuove item7 da Negozio B (atteso: true)");
        System.out.println("Item prima: " + negozioB.getItems().size());
        System.out.println("Esito: " + negozioB.removeFromItems(commessoB, item7));
        System.out.println("Item dopo: " + negozioB.getItems().size());
        System.out.println("Items Negozio B: " + negozioB.getItems());

        // =========================
        System.out.println("\nTEST 14: Commesso A prova a rimuovere item4 da Negozio B (atteso: false - non appartiene)");
        System.out.println("Item prima: " + negozioB.getItems().size());
        System.out.println("Esito: " + negozioB.removeFromItems(commessoA, item4));
        System.out.println("Item dopo: " + negozioB.getItems().size());
        System.out.println("Items Negozio B: " + negozioB.getItems());

        // =========================
        System.out.println("\n=== STATO FINALE ===");
        System.out.println("Items Negozio A: " + negozioA.getItems());
        System.out.println("Items Negozio B: " + negozioB.getItems());

        System.out.println("\n=== FINE TEST ===");
    }
}
