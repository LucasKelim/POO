package HomeTheater;

public class EquipamentoEletronico {
    private float tensao;
    private float consumo;

    public EquipamentoEletronico(float tensao, float consumo) {
        setTensao(tensao);
        setConsumo(consumo);
    }

    public float getTensao() {
        return tensao;
    }

    public void setTensao(float tensao) {
        if (tensao > 0) {
            this.tensao = tensao;
        }
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        if (consumo > 0) {
            this.consumo = consumo;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EquipamentoEletronico{");
        sb.append("tensao=").append(tensao);
        sb.append(", consumo=").append(consumo);
        sb.append('}');
        return sb.toString();
    }
}
