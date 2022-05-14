public class Insegnante extends Persona {

    String materia;
    String[] classi = {"1A", "1B", "1C"};

    Insegnante(String nome, String cognome,  String materia) {
        //super evita di fare this.nome = nome, this.cognome = cognome
        super(nome, cognome);
        this.materia = materia;
    }

    void insegna() {
        System.out.println("Sto insegnando");
    }

    @Override
    void Saluta() {
        System.out.println("salve");
    }
}
