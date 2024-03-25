public class lista4Q8 {
  String nome;
  int idade;

  public lista4Q8(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
  }

  public static void main(String[] args) {
      lista4Q8 vinicius = new lista4Q8("Vinícius", 41);
      lista4Q8 daniela = new lista4Q8("Daniela", 44);
      lista4Q8 ana = new lista4Q8("Ana", 18);
      lista4Q8 carla = new lista4Q8("Carla", 20);
      lista4Q8 daniel = new lista4Q8("Daniel Paiva", 31);
      lista4Q8 felipe = new lista4Q8("Felipe", 24);
      lista4Q8 patricia = new lista4Q8("Patricia", 23);
      lista4Q8 rafael = new lista4Q8("Rafael", 20);
      lista4Q8 pedro = new lista4Q8("Pedro", 22);
      lista4Q8 marcela = new lista4Q8("Marcela", 24);
      lista4Q8 amanda = new lista4Q8("Amanda", 100);
      lista4Q8[] listaPessoas = { vinicius, daniela, ana, carla, daniel, felipe, pedro, patricia, rafael, marcela, amanda };

      for (lista4Q8 pessoa : listaPessoas) {
          pessoa.idade = 18;
      }

      System.out.println("Nome das pessoas e suas novas idades:");
      for (lista4Q8 pessoa : listaPessoas) {
          System.out.println(pessoa.nome + ": " + pessoa.idade);
      }
  }
}