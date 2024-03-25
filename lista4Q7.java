public class lista4Q7 {
  String nome;
  int idade;

  public lista4Q7(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
  }

  public static void main(String[] args) {
      lista4Q7 vinicius = new lista4Q7("Vinícius", 41);
      lista4Q7 daniela = new lista4Q7("Daniela", 44);
      lista4Q7 ana = new lista4Q7("Ana", 18);
      lista4Q7 carla = new lista4Q7("Carla", 20);
      lista4Q7 daniel = new lista4Q7("Daniel Paiva", 31);
      lista4Q7 felipe = new lista4Q7("Felipe", 24);
      lista4Q7 patricia = new lista4Q7("Patricia", 23);
      lista4Q7 rafael = new lista4Q7("Rafael", 20);
      lista4Q7 pedro = new lista4Q7("Pedro", 22);
      lista4Q7 marcela = new lista4Q7("Marcela", 24);
      lista4Q7 amanda = new lista4Q7("Amanda", 100);
      lista4Q7[] listaPessoas = { vinicius, daniela, ana, carla, daniel, felipe, pedro, patricia, rafael, marcela, amanda };

      System.out.println("Pessoas com idade superior a 30 anos:");
      for (lista4Q7 pessoa : listaPessoas) {
          if (pessoa.idade > 30) {
              System.out.println(pessoa.nome);
          }
      }
  }
}