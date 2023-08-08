package entities;

public class pessoajuridica extends pessoapaga{

    public int numeroFuncionarios;

    public pessoajuridica() {
    }
    public pessoajuridica(String nome, Double rendaAnual, int numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }
    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }
    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }
    @Override
    public Double imposto(){
        if (numeroFuncionarios > 10){
            return rendaAnual * 0.14;
        }
        else{
            return rendaAnual * 0.16;
        }
    }
    
}
