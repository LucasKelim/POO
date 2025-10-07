import HomeTheater.HomeTheater;
import HomeTheater.SistemaDeSom;
import HomeTheater.SistemaDeVideo;

public class HomeTheaterMain {
    public static void main(String[] args) {
        SistemaDeSom som = new SistemaDeSom(220f, 200f, "Frahm", "Booter", 10f);
        SistemaDeVideo video = new SistemaDeVideo(220f, 120f, "AOC", "O Melhor", "LCD", "1024x720");

        HomeTheater homeTheater = new HomeTheater(som, video);

        System.out.println(homeTheater);
    }
}
