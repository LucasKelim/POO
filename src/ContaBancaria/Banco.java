package ContaBancaria;

public class Banco {
    private int codigo;
    private String nome;
    private int numeroAgencia;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        if (numeroAgencia > 0) {
            this.numeroAgencia = numeroAgencia;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Banco{");
        sb.append("codigo=").append(codigo);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", numeroAgencia=").append(numeroAgencia);
        sb.append('}');
        return sb.toString();
    }
}
