package school.sptech;

public class RecursiveMethods {

    public static double metodoRecursivo1(ListaObj<DesenhoAnimado> desenhos, int indice) {
        if (indice == desenhos.getTamanho()) return 0;
        return desenhos.getElemento(indice).getNota() + metodoRecursivo1(desenhos, indice + 1);
    }

    public static int metodoRecursivo2(ListaObj<DesenhoAnimado> desenhos, int indice, double notaPesquisada) {
        if (indice == desenhos.getTamanho()) {
            return -1;
        } else if (desenhos.getElemento(indice).getNota() == notaPesquisada) {
            return indice;
        }
        return metodoRecursivo2(desenhos, indice + 1, notaPesquisada);
    }
}
