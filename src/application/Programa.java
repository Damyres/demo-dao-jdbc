package application;
import model.entities.Departamento;
import model.entities.Vendedor;
import java.util.Date;

public class Programa {
    public static void main(String[] args) {
        Departamento obj = new Departamento(1, "Livros");
        System.out.println(obj);

        Vendedor vendedor = new Vendedor(21, "Bob", "bob@gmail.com",
                new Date(), 3000.00, obj);

        System.out.println(vendedor);

    }
}
