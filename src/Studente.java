public class Studente extends Persona {

    String materia;
    String classe = "1A";
    int[] voti = {9, 9, 9};

    Studente(String nome, String cognome, String materia) {
        //super evita di fare this.nome = nome, this.cognome = cognome
        super(nome, cognome);
        this.materia = materia;
    }

    void studia() {
        System.out.println("Sto studiando...");
    }

    @Override
    void Saluta() {
        System.out.println("Bungiorno");
    }
}
