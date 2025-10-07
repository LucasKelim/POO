package HomeTheater;

public class SistemaDeSom extends EquipamentoEletronico {
    private String marca;
    private String modelo;
    private float potencia;

    public SistemaDeSom(float tensao, float consumo, String marca, String modelo, float potencia) {
        super(tensao, consumo);
        setMarca(marca);
        setModelo(modelo);
        setPotencia(potencia);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (!marca.isEmpty()) {
            this.marca = marca;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (!modelo.isEmpty()) {
            this.modelo = modelo;
        }
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        if (potencia > 0) {
            this.potencia = potencia;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SistemaDeSom{");
        sb.append(super.toString());
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", potencia=").append(potencia);
        sb.append('}');
        return sb.toString();
    }
}
