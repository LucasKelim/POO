import Carro.Carro;
import Carro.Motor;
import Carro.Pessoa;

public class CarroMain {
    public static void main(String[] args) {
        Motor motor = new Motor("Nissan", 300f, 6, "Gasolina");
        Pessoa pessoa = new Pessoa("Lucas Kelim Thiel", "Rua XX");

        Carro carro = new Carro("Nissan", "Esportivo", "Cinza", 2023, pessoa, motor);

        System.out.println(carro);
    }
}
