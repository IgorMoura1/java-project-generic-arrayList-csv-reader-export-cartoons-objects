package school.sptech;

public class ListaObj <T>{

    private T[] vetor;

    private int nroElem;


    public ListaObj(int tam) {
        this.vetor = (T[]) new Object[tam];
        this.nroElem = 0;
    }


    public void adiciona(T elemento) {
        if (nroElem >= vetor.length) {
            throw new IllegalStateException("Lista cheia");
        }
        vetor[nroElem++] = elemento;
        exibe();
    }

    public int busca(T elementoProcurado){
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i].equals(elementoProcurado)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removePeloIndice(int indice){
        if (indice < 0 || indice >= nroElem) {
            return false;
        }

        T valorVetor = vetor[indice];
        T[] novoVetor = (T[]) new Object[nroElem - 1];
        int j = 0;

        for (int i = indice; i < nroElem; i++) {
            if (i != indice) {
                novoVetor[j++] = vetor[i];
            }
        }

        vetor = novoVetor;
        nroElem--;
        System.out.println("Valor removido: " + valorVetor + " do índice: " + indice);
        return true;
    }

    public boolean removeElemento(T elemento) {
        boolean valorAchado = false;
        T[] novoVetor = (T[]) new Object[nroElem - 1];
        int j = 0;

        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == elemento && !valorAchado) {
                valorAchado = true;
                continue;
            }
            if (j < novoVetor.length) {
                novoVetor[j++] = vetor[i];
            }
        }

        if (!valorAchado) {
            return false;
        }

        vetor = novoVetor;
        nroElem--;
        System.out.println("Valor removido: " + elemento);
        return true;
    }

    public int getTamanho() {
        return nroElem;
    }

    public T[] getVetor() {
        return vetor;
    }

    public void exibe(){
        for (int i = 0; i < nroElem; i++) {
            System.out.print(vetor[i] + "");
        }
        System.out.println();
    }

    public int substitui(T elementoSubstituir, T novoElemento){
        int indice = busca(elementoSubstituir);
        if (indice == -1){
            return -1;
        }
        vetor[indice] = novoElemento;
        return indice;
    }

    public int contaOcorrencia(T elemento) {
        int contagem = 0;
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == elemento) {
                contagem++;
            }
        }
        return contagem;
    }

    public boolean adicionaNoInicio(T elemento) {
        if (nroElem == vetor.length) {
            throw new IllegalStateException("Lista cheia");
        }
        T[] novoVetor = (T[]) new Object[nroElem + 1];
        novoVetor[0] = elemento;
        for (int i = 0; i < nroElem; i++) {
            novoVetor[i + 1] = vetor[i];
        }
        vetor = novoVetor;
        nroElem++;
        return true;
    }


    public T getElemento(int indice) {
        if (indice < 0 || indice >= nroElem) {
            return null;
        }
        return vetor[indice];
    }

    public void limpa() {
        nroElem = 0;
    }
}
