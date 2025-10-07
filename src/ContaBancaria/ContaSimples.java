package ContaBancaria;

public class ContaSimples {
    private double saldoPoupanca;

    public ContaSimples(double saldoPoupanca) {
        setSaldoPoupanca(saldoPoupanca);
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        if (saldoPoupanca >= 0) {
            this.saldoPoupanca = saldoPoupanca;
        }
    }

    public boolean depositoPoupanca(double valor) {
        if (valor <= 0) {
            return false;
        }

        saldoPoupanca += valor;

        return true;
    }

    public boolean saquePoupanca(double valor) {
        if (valor <= 0) {
            return false;
        }

        if (valor > saldoPoupanca) {
            return false;
        }

        saldoPoupanca -= valor;

        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContaSimples{");
        sb.append("saldoPoupanca=").append(saldoPoupanca);
        sb.append('}');
        return sb.toString();
    }
}
