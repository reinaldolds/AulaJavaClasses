public class Jacare extends Animal{


    public Jacare(String nome, int idade, String genero, String peso, String especie, String habitat, TipoAnimal tipo) {
        super(nome, idade, genero, peso, especie, habitat, tipo);
    }

    @Override
    public void emitir_som() {
        System.out.println("Jacaré faz pouco som.");
    }
}
