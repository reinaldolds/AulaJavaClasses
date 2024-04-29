public class Gato extends Animal implements Correr, Estimacao{

    public Gato(String nome, int idade, String genero, String peso,
                String especie, String habitat) {
        super(nome, idade, genero, peso, especie, habitat);
    }

    @Override
    public void estimacao() {

    }

    @Override
    public void emitir_som() {
        System.out.println("Gato faz: miau miau");
    }

    @Override
    public void Correr() {
        System.out.println("Gatos podem sim correr");
    }
}
