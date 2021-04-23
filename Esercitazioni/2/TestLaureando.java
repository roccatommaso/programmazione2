public class TestLaureando {
  public static void main(String[] args){
    Docente docente1 = new Docente();
    docente1.nome = "Rossi";

    Tesi tesi = new Tesi();
    tesi.titolo = "Visualizzatore di spazi";

    Laureando pippo = new Laureando();
    pippo.nome = "Pippo";
    pippo.matricola = 123456;
    pippo.tesi = tesi;
    pippo.relatore = docente1;
    pippo.correlatore = new Docente();
    pippo.correlatore.nome = "Bianchi";

    Laureando pluto = new Laureando();
    pluto.nome = "Pluto";
    pluto.matricola = 123457;
    pluto.relatore = docente1;
    pluto.correlatore = pippo.correlatore;

    pluto.correlatore.nome = "Bianchissimo";
    System.out.println(pippo.correlatore.nome);
    System.out.println(pluto.correlatore.nome);

    Docente docente3 = new Docente();
    docente3.nome = pippo.correlatore.nome;
    pluto.correlatore = docente3;

    pluto.correlatore.nome = "Bianchi";
    System.out.println(pippo.correlatore.nome);
    System.out.println(pluto.correlatore.nome);

    System.out.println("done.");
  }
}
