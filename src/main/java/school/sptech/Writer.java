package school.sptech;

import java.io.*;

public class Writer {

    public static void exportarDados(String caminho, ListaObj<DesenhoAnimado> desenhos) {
        try (OutputStream file = new FileOutputStream(caminho);
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(file))) {

            String header = "Id;Nome;Ano de Lançamento;Episódios;Nota;Produtora;Temporada\n";
            writer.write(header);
            String pattern = "%d;%s;%d;%d;%.1f;%s;%d\n";

            for (int i = 0; i < desenhos.getTamanho(); i++) {
                DesenhoAnimado desenho = desenhos.getElemento(i);
                writer.write(pattern.formatted(
                        desenho.getId(),
                        desenho.getNome(),
                        desenho.getAnoLancamento(),
                        desenho.getEpisodios(),
                        desenho.getNota(),
                        desenho.getProdutora(),
                        desenho.getTemporada()));
            }
            System.out.println("Dados exportados com sucesso!");

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo");
        }
    }
}