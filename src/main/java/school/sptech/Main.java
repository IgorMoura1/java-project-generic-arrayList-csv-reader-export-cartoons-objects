package school.sptech;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    ListaObj<DesenhoAnimado> desenhos = new ListaObj<>(10);
    populateInitialDesenhos(desenhos);
    Scanner scanner = new Scanner(System.in);
    int opcao;
    double notaPesquisa;

    do {
      exibirMenu();
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          cadastrarNovoObjeto(desenhos, scanner);
          break;
        case 2:
          Ordinare.selectionSort(desenhos);
          exibirVetor(desenhos);
          break;
        case 3:
          Ordinare.bubbleSort(desenhos);
          exibirVetor(desenhos);
          break;
        case 4:
          Ordinare.mergeSort(0, desenhos.getTamanho(), desenhos);
          exibirVetor(desenhos);
          break;
        case 5:
          Ordinare.quickSort(desenhos, 0, desenhos.getTamanho() - 1);
          exibirVetor(desenhos);
          break;
        case 6:
          System.out.print("Informe a nota que deseja pesquisar: ");
          while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, insira um número decimal.");
            scanner.nextLine();
            System.out.print("Informe a nota que deseja pesquisar: ");
          }
          notaPesquisa = scanner.nextDouble();
          int resultado = Ordinare.realizarPesquisaBinaria(desenhos, notaPesquisa);
          if (resultado != -1) {
            System.out.println("Valor encontrado na posição: " + resultado);
          } else {
            System.out.println("Valor não encontrado no vetor.");
          }
          break;
        case 7:
          double soma = RecursiveMethods.metodoRecursivo1(desenhos, 0);
          System.out.println("A soma das notas é: " + soma);
          break;
        case 8:
          int resultadoRecursivo2 = RecursiveMethods.metodoRecursivo2(desenhos, 0, 9.5);
          if (resultadoRecursivo2 != -1) {
            System.out.println("Nota " + desenhos.getElemento(resultadoRecursivo2).getNota() + " encontrada na posição: " + resultadoRecursivo2);
          } else {
            System.out.println("Nota não encontrada.");
          }
          break;
        case 9:
          exibirVetor(desenhos);
          break;
        case 10:
          String caminho = "desenhos.csv";
          Writer.exportarDados(caminho, desenhos);
          break;
        case 11:
          System.out.print("Digite o nome do arquivo a ser importado (ex: novos-dados.csv): ");
          String nomeArquivo = scanner.next();
          Reader.importarDados(nomeArquivo, desenhos);
          break;
        case 12:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida! Tente novamente.");
      }
    } while (opcao != 12);
  }

  public static void exibirMenu() {
    System.out.println("\nMenu de Opções");
    System.out.println("1) Cadastrar novo objeto");
    System.out.println("2) Ordenar por Ano de Lançamento (Selection Sort)");
    System.out.println("3) Ordenar por Nota (Bubble Sort)");
    System.out.println("4) Ordenar por quantidade de Episódios (Merge Sort)");
    System.out.println("5) Ordenar por quantidade de Temporadas (Quick Sort)");
    System.out.println("6) Pesquisa Binária por Nota");
    System.out.println("7) Método Recursivo 1");
    System.out.println("8) Método Recursivo 2");
    System.out.println("9) Ver Vetor");
    System.out.println("10) Exportar Dados");
    System.out.println("11) Importar Dados");
    System.out.println("12) Sair");
    System.out.print("Escolha uma opção: ");
  }

  public static void cadastrarNovoObjeto(ListaObj<DesenhoAnimado> desenhos, Scanner scanner) {
    System.out.print("Informe o ID: ");
    int id = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Informe o Nome: ");
    String nome = scanner.nextLine();
    System.out.print("Informe o Ano de Lançamento: ");
    int anoLancamento = scanner.nextInt();
    System.out.print("Informe o número de episódios: ");
    int episodios = scanner.nextInt();
    System.out.print("Informe a Nota: ");
    double nota = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("Informe a Produtora: ");
    String produtora = scanner.nextLine();
    System.out.print("Informe a Temporada: ");
    int temporada = scanner.nextInt();

    DesenhoAnimado novoDesenho = new DesenhoAnimado(id, nome, anoLancamento, episodios, nota, produtora, temporada);
    desenhos.adiciona(novoDesenho);
  }

  public static void exibirVetor(ListaObj<DesenhoAnimado> desenhos) {
    for (int i = 0; i < desenhos.getTamanho(); i++) {
      DesenhoAnimado desenho = desenhos.getElemento(i);
      System.out.println("ID: " + desenho.getId());
      System.out.println("Nome: " + desenho.getNome());
      System.out.println("Ano de Lançamento: " + desenho.getAnoLancamento());
      System.out.println("Episódios: " + desenho.getEpisodios());
      System.out.println("Nota: " + desenho.getNota());
      System.out.println("Produtora: " + desenho.getProdutora());
      System.out.println("Temporada: " + desenho.getTemporada());
      System.out.println("---------------------------");
    }
  }

  public static void populateInitialDesenhos(ListaObj<DesenhoAnimado> desenhos) {
    desenhos.adiciona(new DesenhoAnimado(1, "Looney Tunes", 1930, 545, 9.9, "Warner Bros", 10));
    desenhos.adiciona(new DesenhoAnimado(2, "Tom & Jerry", 1940, 448, 9.5, "Warner Bros", 8));
    desenhos.adiciona(new DesenhoAnimado(3, "Bob Esponja", 1999, 268, 8.2, "Nickelodeon", 22));
    desenhos.adiciona(new DesenhoAnimado(4, "Pica-Pau", 1940, 200, 7.6, "Universal Studios", 30));
  }
}
