public class TestLettera {
  public static void main (String[] args) {
    Lettera lettera = new Lettera();
    lettera.peso = 80;

    lettera.mittente = new Persona();
    lettera.mittente.nome = "Pluto";
    lettera.mittente.indirizzo = "Milano";

    lettera.destinatario = new Persona();
    lettera.destinatario.nome = "Pippo";
    lettera.destinatario.indirizzo = "Roma";

    Lettera risposta1 = new Lettera();
    risposta1.mittente = lettera.destinatario;
    risposta1.destinatario = lettera.mittente;

    Lettera risposta2 = new Lettera();
    risposta2.mittente = risposta1.destinatario;
    risposta2.destinatario = risposta1.mittente;

    System.out.println("done.");
  }
}
