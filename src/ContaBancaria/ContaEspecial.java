package ContaBancaria;

public class ContaEspecial {
    private int diasSemJuros;
    private double limite;
    protected CartaoDeCredito cartao;

    public int getDiasSemJuros() {
        return diasSemJuros;
    }

    public void setDiasSemJuros(int diasSemJuros) {
        if (diasSemJuros > 1) {
            this.diasSemJuros = diasSemJuros;
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

    public CartaoDeCredito getCartao() {
        return cartao;
    }

    public void setCartao(CartaoDeCredito cartao) {
        if (cartao != null) {
            this.cartao = cartao;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContaEspecial{");
        sb.append(diasSemJuros);
        sb.append(", limite=").append(limite);
        sb.append(", cartao=").append(cartao);
        sb.append('}');
        return sb.toString();
    }
}
