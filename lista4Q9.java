public class lista4Q9 {
  public static void main(String[] args) {
      int[] listaNumeros = { 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64,
          65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
          75, 76, 77, 78, 79, 80, 81,
          82, 83, 84, 85, 86, 87, 88, 89,
          90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };

      int indice99 = buscaBinaria(listaNumeros, 99);
      System.out.println("O índice do número 99 é: " + indice99);

      int indice81 = buscaBinaria(listaNumeros, 81);
      System.out.println("O índice do número 81 é: " + indice81);
  }

  public static int buscaBinaria(int[] lista, int chave) {
      int inicio = 0;
      int fim = lista.length - 1;

      while (inicio <= fim) {
          int meio = (inicio + fim) / 2;

          if (lista[meio] == chave) {
              return meio; 
          } else if (lista[meio] < chave) {
              inicio = meio + 1; 
          } else {
              fim = meio - 1; 
          }
      }

      return -1; 
}
}