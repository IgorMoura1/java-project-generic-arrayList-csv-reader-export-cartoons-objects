package school.sptech;

import java.io.*;
import java.util.Scanner;

public class Reader {

    public static void importarDados(String nomeArquivo, ListaObj<DesenhoAnimado> desenhos) {
        try (InputStream file = new FileInputStream(nomeArquivo);
             BufferedReader buffer = new BufferedReader(new InputStreamReader(file));
             Scanner leitor = new Scanner(buffer)) {

            leitor.nextLine();

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] dados = linha.split(";");

                if (dados.length == 7) {
                    int id = Integer.parseInt(dados[0]);
                    String nome = dados[1];
                    int anoLancamento = Integer.parseInt(dados[2]);
                    int episodios = Integer.parseInt(dados[3]);
                    double nota = Double.parseDouble(dados[4]);
                    String produtora = dados[5];
                    int temporada = Integer.parseInt(dados[6]);

                    DesenhoAnimado novoDesenho = new DesenhoAnimado(id, nome, anoLancamento, episodios, nota, produtora, temporada);
                    desenhos.adiciona(novoDesenho);
                }
            }
            System.out.println("Dados importados com sucesso!");

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado, verifique o nome informado.");
        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo.");
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter dados. Verifique o formato dos valores no arquivo.");
        }
    }
}
