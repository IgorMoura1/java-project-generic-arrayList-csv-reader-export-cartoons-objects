package school.sptech;

public class Ordinare {

    public static void selectionSort(ListaObj<DesenhoAnimado> desenhos) {
        for (int i = 0; i < desenhos.getTamanho(); i++) {
            int indiceDesenho = i;
            for (int j = i + 1; j < desenhos.getTamanho(); j++) {
                if (desenhos.getElemento(j).getAnoLancamento() < desenhos.getElemento(indiceDesenho).getAnoLancamento()) {
                    indiceDesenho = j;
                }
            }
            DesenhoAnimado aux = desenhos.getElemento(i);
            desenhos.substitui(aux, desenhos.getElemento(indiceDesenho));
            desenhos.substitui(desenhos.getElemento(indiceDesenho), aux);
        }
    }

    public static void bubbleSort(ListaObj<DesenhoAnimado> desenhos) {
        for (int i = 0; i < desenhos.getTamanho() - 1; i++) {
            for (int j = 0; j < desenhos.getTamanho() - 1; j++) {
                if (desenhos.getElemento(j).getNota() > desenhos.getElemento(j + 1).getNota()) {
                    DesenhoAnimado aux = desenhos.getElemento(j);
                    desenhos.substitui(aux, desenhos.getElemento(j + 1));
                    desenhos.substitui(desenhos.getElemento(j + 1), aux);
                }
            }
        }
    }

    public static void mergeSort(int p, int r, ListaObj<DesenhoAnimado> desenhos) {
        if (p < r - 1) {
            int q = (p + r) / 2;
            mergeSort(p, q, desenhos);
            mergeSort(q, r, desenhos);
            intercala(p, q, r, desenhos);
        }
    }

    public static void intercala(int p, int q, int r, ListaObj<DesenhoAnimado> desenhos) {
        int i, j, k;
        DesenhoAnimado[] w = new DesenhoAnimado[r - p];
        i = p;
        j = q;
        k = 0;

        while (i < q && j < r) {
            if (desenhos.getElemento(i).getEpisodios() <= desenhos.getElemento(j).getEpisodios()) {
                w[k++] = desenhos.getElemento(i++);
            } else {
                w[k++] = desenhos.getElemento(j++);
            }
        }
        while (i < q) {
            w[k++] = desenhos.getElemento(i++);
        }
        while (j < r) {
            w[k++] = desenhos.getElemento(j++);
        }
        for (i = p; i < r; i++) {
            desenhos.substitui(desenhos.getElemento(i), w[i - p]);
        }
    }

    public static void quickSort(ListaObj<DesenhoAnimado> desenhos, int indInicio, int indFim) {
        int i = indInicio, j = indFim;
        int pivo = desenhos.getElemento((indInicio + indFim) / 2).getTemporada();

        while (i <= j) {
            while (i < indFim && desenhos.getElemento(i).getTemporada() < pivo) {
                i++;
            }
            while (j > indInicio && desenhos.getElemento(j).getTemporada() > pivo) {
                j--;
            }
            if (i <= j) {
                DesenhoAnimado aux = desenhos.getElemento(i);
                desenhos.substitui(aux, desenhos.getElemento(j));
                desenhos.substitui(desenhos.getElemento(j), aux);
                i++;
                j--;
            }
        }
        if (indInicio < j) {
            quickSort(desenhos, indInicio, j);
        }
        if (i < indFim) {
            quickSort(desenhos, i, indFim);
        }
    }

    public static int realizarPesquisaBinaria(ListaObj<DesenhoAnimado> desenhos, double nota) {
        int indInf = 0;
        int indSup = desenhos.getTamanho() - 1;
        int meio;
        while (indInf <= indSup) {
            meio = (indInf + indSup) / 2;
            if (desenhos.getElemento(meio).getNota() == nota) {
                return meio;
            } else if (nota < desenhos.getElemento(meio).getNota()) {
                indSup = meio - 1;
            } else {
                indInf = meio + 1;
            }
        }
        return -1;
    }
}
