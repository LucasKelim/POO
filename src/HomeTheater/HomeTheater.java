package HomeTheater;

public class HomeTheater {
    protected SistemaDeSom som;
    protected SistemaDeVideo video;

    public HomeTheater(SistemaDeSom som, SistemaDeVideo video) {
        setSom(som);
        setVideo(video);
    }

    public SistemaDeSom getSom() {
        return som;
    }

    public void setSom(SistemaDeSom som) {
        this.som = som;
    }

    public SistemaDeVideo getVideo() {
        return video;
    }

    public void setVideo(SistemaDeVideo video) {
        this.video = video;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HomeTheater{");
        sb.append("som=").append(som);
        sb.append(", video=").append(video);
        sb.append('}');
        return sb.toString();
    }
}
