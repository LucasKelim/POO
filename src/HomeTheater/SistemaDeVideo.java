package HomeTheater;

public class SistemaDeVideo extends EquipamentoEletronico {
    private String marca;
    private String modelo;
    private String tipo;
    private String resolucao;

    public SistemaDeVideo(float tensao, float consumo, String marca, String modelo, String tipo, String resolucao) {
        super(tensao, consumo);
        setMarca(marca);
        setModelo(modelo);
        setTipo(tipo);
        setResolucao(resolucao);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SistemaDeVideo{");
        sb.append(super.toString());
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", tipo='").append(tipo).append('\'');
        sb.append(", resolucao='").append(resolucao).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
