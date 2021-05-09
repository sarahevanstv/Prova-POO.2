import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Layout layout = new Layout();
        int opcao = 0;
        List<Produto> listaProdutos = new ArrayList<>();

        layout.showLayout();
        opcao = read.nextInt();

        switch (opcao) {
   
           case 1:
              int opcaoLayout = layout.showReports(read);
              System.out.println("A opção escolhida foi: " + opcaoLayout);
              break;

            case 2: 
              int opcaoLayout = layout.showProducts(read);
              System.out.println("A opção escolhida foi: " + opcaoLayout);
              if (opcaoLayout == 1) {
                Produto prod;
                registerProducts cad;
                prod = cad.registerProducts(read);
                listaProdutos.add(prod);

              }else if (opcaoLayout == 2) {
                  
              }
                   


              break;

            

           default:
               break;
           

        }
        read.close();
        
    }
    
}
