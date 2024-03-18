package entities.tipoDeAposta;

public class PremioGrupo {
    private Double valor;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Double premioGrupo(){
        return this.valor * 18.00;
    }
}
