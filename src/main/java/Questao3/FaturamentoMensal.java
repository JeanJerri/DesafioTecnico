package Questao3;
public class FaturamentoMensal {
    private int dia;
    private int valor;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Dia: " + dia + ", Valor: " + valor;
    }
}
