import java.util.Scanner;

public class CadastrodeProdutos {

    public Produto registerProducts(Scanner read) {
        System.out.println("Por favor,insira o código do Produto:");
        int cod = read.nextInt();
        read.nextLine();
        System.out.println("Insira o nome do Produto:");
        String name = read.nextLine();
        return new Produto(cod, name);
    }
    
}
