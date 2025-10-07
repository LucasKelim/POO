package ContaBancaria;

public class CartaoDeCredito {
    private int numero;
    private String operadora;
    private double limite;
    private String tipoDeCartao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        if (!operadora.isEmpty()) {
            this.operadora = operadora;
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if (limite > 0) {
            this.limite = limite;
        }
    }

    public String getTipoDeCartao() {
        return tipoDeCartao;
    }

    public void setTipoDeCartao(String tipoDeCartao) {
        if (!tipoDeCartao.isEmpty()) {
            this.tipoDeCartao = tipoDeCartao;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CartaoDeCredito{");
        sb.append("numero=").append(numero);
        sb.append(", operadora='").append(operadora).append('\'');
        sb.append(", limite=").append(limite);
        sb.append(", tipoDeCartao='").append(tipoDeCartao).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
