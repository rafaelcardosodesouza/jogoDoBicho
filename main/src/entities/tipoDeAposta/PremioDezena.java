package entities.tipoDeAposta;

public class PremioDezena {
    private Double valor;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Double premioDezena(){
        return this.valor * 60.00;
    }
}
