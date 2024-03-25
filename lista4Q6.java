public class lista4Q6 {
  String nome;
  int idade;

  public lista4Q6(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
  }

  public static void main(String[] args) {
      lista4Q6 vinicius = new lista4Q6("Vinícius", 41);
      lista4Q6 daniela = new lista4Q6("Daniela", 44);
      lista4Q6 ana = new lista4Q6("Ana", 18);
      lista4Q6 carla = new lista4Q6("Carla", 20);
      lista4Q6 daniel = new lista4Q6("Daniel Paiva", 31);
      lista4Q6 felipe = new lista4Q6("Felipe", 24);
      lista4Q6 patricia = new lista4Q6("Patricia", 23);
      lista4Q6 rafael = new lista4Q6("Rafael", 20);
      lista4Q6 pedro = new lista4Q6("Pedro", 22);
      lista4Q6 marcela = new lista4Q6("Marcela", 24);
      lista4Q6 amanda = new lista4Q6("Amanda", 100);
      lista4Q6[] listaPessoas = { vinicius, daniela, ana, carla, daniel, felipe, pedro, patricia, rafael, marcela, amanda };

      for (lista4Q6 pessoa : listaPessoas) {
          if (pessoa.idade == 100) {
              System.out.println("A pessoa com 100 anos é: " + pessoa.nome);
              break;
          }
      }
  }
}