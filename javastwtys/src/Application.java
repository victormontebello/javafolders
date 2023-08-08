import java.util.*;
import entities.*;

public class Application {
    public static void main (String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    List<pessoapaga> list = new ArrayList<>();

    System.out.print("Entre com o numero de pagadores de imposto: ");
        int n = sc.nextInt();
    for (int i = 1; i <= n; i++){
        System.out.println("Pagador de imposto #" + i + ":");
        System.out.print("Pessoa fisica ou juridica (f/j)? ");
            char ch = sc.next().charAt(0);
        System.out.print("Nome: ");
        sc.nextLine();
            String nome = sc.nextLine();
        System.out.print("Renda anual: ");
            Double rendaAnual = sc.nextDouble();
        if (ch == 'f'){
            System.out.print("Gastos com saude: ");
                Double gastoSaude = sc.nextDouble();
            list.add(new pessoafisica(nome, rendaAnual, gastoSaude));
        }
        else{
            System.out.print("Numero de funcionarios: ");
                int numeroFuncionarios = sc.nextInt();
            list.add(new pessoajuridica(nome, rendaAnual, numeroFuncionarios));
        }
    }
    System.out.println();
    System.out.println("Impostos pagos:");
    for (pessoapaga p : list){
        System.out.println(p.getNome() + ": $ " + String.format("%.2f", p.imposto()));
    }

    System.out.println("\nTotal de impostos: ");
        Double sum = 0.0;
    for (pessoapaga p : list){
        sum += p.imposto();
    }
    System.out.println("$ " + String.format("%.2f", sum));
    sc.close();
    }
}
