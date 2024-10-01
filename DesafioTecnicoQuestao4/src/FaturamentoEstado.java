public class FaturamentoEstado {
    private String estado;
    private double valor, percentual;

    public FaturamentoEstado(String estado, double valor) {
        this.estado = estado;
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public String toString() {
        return "Faturamento " + estado + " = " + percentual + "%";
    }
}
