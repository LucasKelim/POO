package Carro;

public class Pessoa {
    private String nome;
    private String endereco;

    public Pessoa(String nome, String endereco) {
        setNome(nome);
        setEndereco(endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (!endereco.isEmpty()) {
            this.endereco = endereco;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pessoa{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", endereco='").append(endereco).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
