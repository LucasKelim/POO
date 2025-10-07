package Carro;

public class Motor {
    private String marca;
    private float potencia;
    private int cilindros;
    private String combustivel;

    public Motor(String marca, float potencia, int cilindros, String combustivel) {
        setMarca(marca);
        setPotencia(potencia);
        setCilindros(cilindros);
        setCombustivel(combustivel);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (!marca.isEmpty()) {
            this.marca = marca;
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

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        if (cilindros > 0) {
            this.cilindros = cilindros;
        }
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        if (!combustivel.isEmpty()) {
            this.combustivel = combustivel;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Motor{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", potencia=").append(potencia);
        sb.append(", cilindros=").append(cilindros);
        sb.append(", combustivel='").append(combustivel).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
