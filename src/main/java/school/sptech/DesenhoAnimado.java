package school.sptech;

public class DesenhoAnimado {

    private int id;

    private String nome;

    private int anoLancamento;

    private int episodios;

    private Double nota;

    private String produtora;

    private int temporada;

    public DesenhoAnimado(int id, String nome, int anoLancamento, int episodios, Double nota, String produtora, int temporada) {
        this.id = id;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.episodios = episodios;
        this.nota = nota;
        this.produtora = produtora;
        this.temporada = temporada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
}
