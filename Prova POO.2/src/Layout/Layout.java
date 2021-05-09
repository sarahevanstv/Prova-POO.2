import java.util.Scanner;

public class Layout {

    public void showLayout() {

        System.out.println("======================================");
        System.out.println("==== Digite o número de sua opção: ====");
        System.out.println("======================================");
        System.out.println("1_ Cadastro e Consulta de Produtos;");
        System.out.println("2_ Relátórios;");
        System.out.println("3_ Registrar Venda;");
        System.out.println("0_ Sair");
    }

    public int showReports(Scanner read) {

        System.out.println("=====================================");
        System.out.println("=== Digite o número de sua opção: ===");
        System.out.println("=====================================");
        System.out.println("1_ Relatório Consolidado;");
        System.out.println("2_ Relátório Simplificado;");
        int op = read.nextInt();
        return op;
        

    }

    public int showProducts() {

        System.out.println("====================================");
        System.out.println("=== Digite o número de sua opção: ===");
        System.out.println("====================================");
        System.out.println("1_ Consulta de Produto;");
        System.out.println("2_ Cadastro de Produto;");
        int op = read.nextInt();
        return op;

    }  
    
    public void saleRegister() {
        
    }
}
