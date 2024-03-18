package entities.tipoDeAposta;

public class PremioMilharSeca {
    private Double valor;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Double premioMilharSeca(){
        return this.valor * 4000.00;
    }
}
