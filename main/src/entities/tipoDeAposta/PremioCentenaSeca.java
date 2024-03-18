package entities.tipoDeAposta;

public class PremioCentenaSeca {
    private Double valor;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Double premioCentenaSeca(){
        return this.valor * 600.00;
    }

    @Override
    public String toString() {
        return "Premio se ganhar: " + premioCentenaSeca();
    }
}
