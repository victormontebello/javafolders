package entities;

public abstract class pessoapaga {
    protected String nome;
    protected Double rendaAnual;

    public pessoapaga() {
    }
    public pessoapaga(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }
    public String getNome() {
        return nome;
    }
    public Double getRendaAnual() {
        return rendaAnual;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
    public Double imposto(){
        if (rendaAnual < 20000.00){
            return rendaAnual * 0.15;
        }
        else{
            return rendaAnual * 0.25;
        }
    }

}
