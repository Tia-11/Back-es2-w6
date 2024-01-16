package MattiaP.Backes2w6.entities ;

public class Blog {
    private Long id;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoLettura;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    public int getTempoLettura() {
        return tempoLettura;
    }

    public void setTempoLettura(int tempoLettura) {
        this.tempoLettura = tempoLettura;
    }

    public Blog() {

    }

    public Blog(Long id, String categoria, String titolo, String cover, String contenuto, int tempoLettura) {
        this.id = id;
        this.categoria = categoria;
        this.titolo = titolo;
        this.cover = cover;
        this.contenuto = contenuto;
        this.tempoLettura = tempoLettura;

    }


}
