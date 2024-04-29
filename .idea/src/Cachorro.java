public class Cachorro extends Animal implements Correr, Estimacao{

    public Cachorro(String nome, int idade, String genero, String peso,
                    String especie, String habitat) {
        super(nome, idade, genero, peso, especie, habitat);
    }

    @Override
    public void emitir_som() {
        System.out.println("Cachorro faz: Au au au");
    }

    @Override
    public void Correr() {
        System.out.println("Cachorro pode sim correr.");
    }
    @Override
    public void estimacao(){
        System.out.println("Animal de estimação.");
    }

    @Override
    public String toString() {
        return "Animal{\n" +
                "nome= " + nome +
                ", \nidade= " + idade +
                ", \ntipo= " + TipoAnimal.MAMIFERO +
                "\n}";

    }
}
