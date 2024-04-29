public class Passaro extends Animal implements Voar{

    private String possui = "Asas e bico";

    public Passaro(String nome, int idade, String genero, String peso,
                   String especie, String habitat, String possui) {
        super(nome, idade, genero, peso, especie, habitat);
        this.possui = possui;
    }

    @Override
    public void emitir_som() {
        System.out.println("o passáro faz: bem-te-vi");
    }

    @Override
    public void Voar() {
        System.out.println("passarinho pode voar.");
    }
}
