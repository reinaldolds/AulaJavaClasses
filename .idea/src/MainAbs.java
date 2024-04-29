import java.util.Scanner;
public class MainAbs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Gato gato1 = new Gato("tom",10, "M","10kg","felino","livre");
        Cachorro cao = new Cachorro("Dog",5,"macho","20kg","Cão","urbano ou rural");

        System.out.println("Animais Registrados");
        //System.out.println("Gato Informações: \nnome: "+ gato1.nome+"\nidade: "+gato1.idade+"\ngenero: "
          //      +gato1.genero+"\npeso: "+gato1.peso+"\nespecie: "+gato1.especie+"\nhabitat: "+gato1.habitat);
        //gato1.emitir_som();
        System.out.println(cao);
        System.out.println("bem vindo.");
    }
}
