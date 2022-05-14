public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("Luca", "Rossi");
        persona1.Saluta();

        Studente studente1 = new Studente("Luca", "Rossi", "Storia");
        studente1.Saluta();
        // System.out.println(studente1.nome);
        // studente1.studia();

        Insegnante insegnante1 = new Insegnante("Luca", "Rossi", "Matematica");
        insegnante1.Saluta();
        // insegnante1.insegna();
    }
}
