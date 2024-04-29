abstract class  Animal {
    //nome, idade, genero, peso, especie, habitat
    protected String nome;
    protected int idade;
    protected String genero;
    protected String peso;
    protected String especie;
    protected String habitat;

    private final TipoAnimal tipo;

    public Animal(String nome, int idade, String genero, String peso,
                  String especie, String habitat, TipoAnimal tipo){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.peso = peso;
        this.especie = especie;
        this.habitat = habitat;
        this.tipo = tipo;
    }
    public TipoAnimal getTipo(){
        return tipo;
    }

    public abstract void emitir_som();

}
